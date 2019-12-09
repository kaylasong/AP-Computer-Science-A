import info.gridworld.actor.*;
import info.gridworld.grid.*; 
import java.awt.Color;
import java.util.ArrayList;
public class Sun extends Actor 
{
    //direction in actor class
    //set direction to be 180. 
    //loation is set to 3,12 in Scorekeeping
    private ArrayList<Location> range; 
    private int uv;
    private boolean covered;
    //for enemies and clouds
    private double eApp;
    private double cApp;
    //the actual score
    private int score;
    private int steps;
    //to see the direction of the cloud that covers it
    private int cd; 
    private Grid<Actor> gr;
    private boolean line;
    //the sun's life and the sun's end
    private int lives;
    private boolean ended;
    public Sun(Grid<Actor> g)
    {
        setColor(null);
        setDirection(180);
        uv=10;

        //for the game keeping track
        eApp=5;
        cApp=15;
        score=0;
        steps=0;
        gr=g;
        line=false;
        lives=20;

        adjustSky();
        adjustOcean();
        adjustSand();
    }

    //senidng the UV rays
    public void act()
    {        
        //checks the grid to see how many enemies there are. If all spots
        //taken,then lose. 
        if(end()==true)
        {            
            if(ended==false)
            {
                System.out.println("The lil'Borishes and the Charlies have dominated. Face the defeat.");
                System.out.println("Your score is: "+score);
                for(int r=0;r<15;r++)
                {
                    for(int c=0;c<25;c++)
                    {
                        Actor x=gr.get(new Location(r,c));
                        x.setColor(null);        
                    }
                }  
                ended=true;
            }
            return;
        }

        //account for score stuff
        changeEApp();
        changeCApp();
        //adjust the sky so that there's no awkward spacs.
        adjustSky();
        adjustOcean();
        adjustSand();

        //adding enemies.
        if(steps%Math.abs(eApp)==0 || eApp==0 || line==true)
        {
            if(eApp<0)
            {
                for(int i=0;i<Math.abs(eApp);i++)
                {
                    enterEnemy();
                }
            }
            else
            {
                enterEnemy();
            }
        }
        //adding clouds
        if(steps%Math.abs(cApp)==0 || cApp==0)
        {
            if(cApp<0)
            {
                for(int i=0;i<Math.abs(cApp);i++)
                {
                    enterCloud();
                }
            }
            else
            {
                enterCloud();
            }
        }
        steps++;
        adjustSky();
        adjustOcean();
        adjustSand();
        range=getRange();
        //the sun's attack.
        if(covered==true)
        {
            Grid<Actor> gr=getGrid(); 
            Location s=getLocation();
            CoveredSun a=new CoveredSun(this,cd,gr);
            removeSelfFromGrid();
            a.putSelfInGrid(gr,s);  
            changeLives();
            System.out.println("You got hit by a cloud! You now have "+lives+" lives.");
            for(int r=0;r<15;r++)
            {
                for(int c=0;c<25;c++)
                {
                    Actor x=gr.get(new Location(r,c));
                    x.setColor(null);
                    if(x instanceof Enemy)
                    {
                        ((Enemy)x).changeInSun(false); 
                    }
                }
            }   
        }
        else if(range!=null && range.size()!=0)
        {
            for(int r=0;r<15;r++)
            {
                for(int c=0;c<25;c++)
                {
                    Location loc=new Location(r,c);
                    if(isInRange(loc))
                    {
                        Object a=getGrid().get(loc);
                        ((Actor)a).setColor(Color.WHITE);
                        if(a instanceof OceanMan)
                        {
                            ((OceanMan)a).changeInSun(true);
                            ((OceanMan)a).changeHealth(uv);
                            if(((OceanMan)a).getHealth()<=0)
                            {
                                score=score+10; 
                                Location ofEnemy=((OceanMan)a).getLocation(); 
                                ((OceanMan)a).removeSelfFromGrid(); 
                                Burnt b=new Burnt();
                                b.putSelfInGrid(getGrid(),ofEnemy); 
                            }
                        }
                        if(a instanceof Enemy)
                        {
                            ((Enemy)a).changeInSun(true);
                            ((Enemy)a).changeHealth(uv); 
                            if(((Enemy)a).getHealth()<=0)
                            {
                                score=score+10; 
                                Location ofEnemy=((Enemy)a).getLocation(); 
                                ((Enemy)a).removeSelfFromGrid(); 
                                Burnt b=new Burnt();
                                b.putSelfInGrid(getGrid(),ofEnemy); 
                            }
                        }
                    }
                    else
                    {
                        Object a=getGrid().get(loc);
                        ((Actor)a).setColor(null);
                        if(a instanceof Enemy)
                        {
                            ((Enemy)a).changeInSun(false);
                        }
                    }
                }
            }
        }
    }

    //the check to lose
    public boolean end()
    {
        if(lives==0)
        {
            return(true);
        }
        Grid<Actor> gr=getGrid();
        double count=0;
        for(int r=7;r<15;r++)
        {
            for(int c=0;c<25;c++)
            {
                if((gr.get(new Location(r,c)) instanceof Enemy))
                {
                    count++; 
                }
            }
        }
        if((double)count/(double)200>.87)
        {
            return(true);      
        }
        return(false);
    }

    //handling the stuff of other classes
    public void enterEnemy()
    {
        int row=(int)(7+8*Math.random());
        int col=(int)(24*Math.random());
        int scol=0;
        boolean found=false;
        boolean ocean=false; 
        if(col<13)
        {
            for(int c=12;c>=0;c--)
            {
                if(getGrid().get(new Location(row,c)) instanceof Sand)
                {
                    scol=c; 
                    found=true ;
                    break;
                }
                else if(getGrid().get(new Location(row,c)) instanceof Ocean)
                {
                    scol=c; 
                    found=true;
                    ocean=true;
                    break;
                }
            }
            if(ocean==false && found==true &&
            getGrid().get(new Location(row,0)) instanceof Sand)
            {
                Enemy e=new Enemy(new Location(row,scol), gr); 
                e.putSelfInGrid(getGrid(),new Location(row,0)); 
            }
            else if(ocean==true && found==true &&
            getGrid().get(new Location(row,0)) instanceof Ocean)
            {
                OceanMan o=new OceanMan(new Location(row,scol), gr); 
                o.putSelfInGrid(getGrid(),new Location(row,0));
            }
        }    
        else
        {
            for(int c=13;c<25;c++)
            {
                if(getGrid().get(new Location(row,c)) instanceof Sand)
                {
                    scol=c;
                    found=true;
                    break;
                }
                else if(getGrid().get(new Location(row,c)) instanceof Ocean)
                {
                    scol=c; 
                    found=true;
                    ocean=true;
                    break;
                }
            }
            if(ocean==false && found==true && 
            getGrid().get(new Location(row,24)) instanceof Sand)
            {
                Enemy e=new Enemy(new Location(row,scol), gr); 
                e.putSelfInGrid(getGrid(),new Location(row,24)); 
            }
            else if(ocean==true && found==true &&
            getGrid().get(new Location(row,24)) instanceof Ocean)
            {
                OceanMan o=new OceanMan(new Location(row,scol), gr); 
                o.putSelfInGrid(getGrid(),new Location(row,24));
            }
        }
    }

    public void enterCloud()
    { 
        int row=(int)(7*Math.random());
        double col=Math.random(); 
        if(col<.5)
        {
            CloudDoge c=new CloudDoge(90); 
            if(getGrid().get(new Location(row,0)) instanceof Sky)
            {
                getGrid().get(new Location(row,0)).removeSelfFromGrid();
                c.putSelfInGrid(getGrid(),new Location(row,0)); 
            }
        }
        else
        {
            CloudDoge c=new CloudDoge(270); 
            if(getGrid().get(new Location(row,0)) instanceof Sky)
            {
                getGrid().get(new Location(row,24)).removeSelfFromGrid();
                c.putSelfInGrid(getGrid(),new Location(row,24)); 
            }
        }
    }

    public void adjustSky()
    {
        Sky sky=null;
        for(int r=0;r<7;r++)
        {
            for(int c=0;c<25;c++)
            {
                Location loc=new Location(r,c);
                if(gr.isValid(loc) && (gr.get(loc) instanceof Sky || gr.get(loc)==null))
                {
                    sky=new Sky();
                    sky.putSelfInGrid(gr,new Location(r,c)); 
                }
            }
        }
    }

    public void adjustOcean()
    {
        Ocean ocean=null;
        for(int r=7;r<9;r++)
        {
            for(int c=0;c<25;c++)
            {
                Location loc=new Location(r,c);
                if(gr.isValid(loc) && (gr.get(loc) instanceof Ocean || gr.get(loc)==null))
                {
                    ocean=new Ocean();
                    ocean.putSelfInGrid(gr,new Location(r,c));
                }
            }
        }
    }

    public void adjustSand()
    {
        Sand sand=null;
        for(int r=9;r<15;r++)
        {
            for(int c=0;c<25;c++)
            {
                Location loc=new Location(r,c);
                if(gr.isValid(loc) && (gr.get(loc) instanceof Sand || gr.get(loc)==null))
                {
                    sand=new Sand();
                    sand.putSelfInGrid(gr,new Location(r,c));
                }
            }
        }
    }

    public boolean isInRange(Location loc)
    {
        if(range!=null && range.size()!=0)
        {
            for(int r=0;r<range.size();r++)
            {
                if(loc.equals(range.get(r)))
                {
                    return(true);
                }
            }
        }
        return(false);
    }

    public void whiteRange()
    {
        range=getRange();
        if(range!=null && range.size()!=0)
        {
            for(int r=0;r<range.size();r++)
            {
                gr.get(range.get(r)).setColor(Color.WHITE);
            }
        }
    }

    //the more basic maintenance stuff////////////////////////////////////////////////////////

    //accessors
    public double getEApp()
    {
        return(eApp);
    }

    public double getCApp()
    {
        return(cApp);
    }

    public int getScore()
    {
        return(score);
    }

    public int getUV()
    {
        return(uv);
    }

    public int getLives()
    {
        return(lives);
    }

    public ArrayList<Location> getRange()
    {
        Sunny a=new Sunny(getDirection(),getLocation(),gr);
        return(a.getRange()); 
    }

    //basic mutators
    public void changeEApp()
    {
        if(eApp<=-7)
        {
            if(score%500==0 && eApp>=-10)
            {
                eApp--;
            }
        }
        else if(score%150==0 && eApp==1 && score!=0)
        {
            eApp=-1;
        }
        else if(score%150==0 && score!=0)
        {
            eApp--;
        }
        if(eApp==-10)
        {
            changeLine(true);
        }
    }

    public void changeCApp()
    {
        //every 200 points, the rate of clouds doubles
        if(score%250==0 && cApp==1 && score!=0)
        {
            eApp=-5;
        }
        else if(score%250==0 && score!=0)
        {
            cApp--;
        }
    }

    public void changeScore(int x)
    {
        score=score+x;
    }

    public void changeCovered(boolean x)
    {
        covered=x;
    }

    public void setCd(int x)
    {
        cd=x;
    }

    public void changeLine(boolean x)
    {
        line=x;
    }

    public void changeLives()
    {
        lives--;
    }

    //moving the sun
    //gets a key direction or summat 
    public void turnRight()
    {
        setDirection(getDirection()-20);
        Sunny a=new Sunny(getDirection(),getLocation(),gr);
        range=null;
        range=a.getRange(); 
        adjustSky();
        adjustOcean();
        adjustSand();
    }

    public void turnLeft()
    {
        adjustSky();
        adjustOcean();
        adjustSand();
        setDirection(getDirection()+20);
        Sunny a=new Sunny(getDirection(),getLocation(),gr);
        range=null;
        range=a.getRange(); 
    }

    public void moveUp()
    {
        Location up=getLocation().getAdjacentLocation(0);
        range=null;
        Sunny a=new Sunny(getDirection(),getLocation(),gr);
        range=a.getRange();
        if(getGrid().isValid(up) && up.getRow()>=0)
        {
            moveTo(up); 
            adjustSky();
            adjustOcean();
            adjustSand();
        }
    }

    public void moveDown()
    {
        Location down=getLocation().getAdjacentLocation(180);
        range=null; 
        Sunny a=new Sunny(getDirection(),getLocation(),gr);
        range=a.getRange();
        //can't go into the ocean
        if(getGrid().isValid(down) && down.getRow()<7)
        {
            moveTo(down); 
            adjustSky();
            adjustOcean();
            adjustSand();
        }
    }
}
