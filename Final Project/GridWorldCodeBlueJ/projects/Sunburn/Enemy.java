import info.gridworld.actor.*;
import info.gridworld.grid.*; 
import java.awt.Color;
import java.util.ArrayList;
public class Enemy extends Actor
{
    private int health; 
    private Location spot; 
    private Location start;
    //appearance represents the rate at which the enemy shows up
    private double app; 
    private Grid<Actor> gr;
    private boolean inSun;
    public Enemy(Location sp, Grid<Actor> g)
    {
        if(sp.getCol()<=12)
            setDirection(90);
        else
            setDirection(270);
        health=100; 
        spot=sp;
        setColor(null);
        gr=g;
        inSun=false;
    }

    //accessor
    public int getHealth()
    {
        return(health);
    }

    public boolean getInSun()
    {
        return(inSun);
    }

    public void changeHealth(int x)
    {
        health=health-x; 
    }

    public void changeInSun(boolean x)
    {
        inSun=x;
    }

    //the enemy goes to their spot on the beach
    public void act()
    {
        if(inSun==false)
        {
            setColor(null);
        }
        Location current=getLocation();
        int direct90=current.getDirectionToward(new Location(spot.getRow(),12));
        int direct270=current.getDirectionToward(new Location(spot.getRow(),13));
        if(current.equals(new Location(current.getRow(),12)) ||
        current.equals(new Location(current.getRow(),13)))
        {
        }
        else if(getDirection()==90 && 
        getGrid().get(current.getAdjacentLocation(direct90)) instanceof Sand ||
        getGrid().get(current.getAdjacentLocation(direct90)) instanceof Ocean )
        {
            moveTo(current.getAdjacentLocation(direct90));
            adjustOcean();
            adjustSand();
            if(inSun)
            {
                gr.get(new Location(getLocation().getRow(),getLocation().getCol()-1)).setColor(Color.WHITE);
            }
        }
        else if(getDirection()==270 &&
        getGrid().get(current.getAdjacentLocation(direct270)) instanceof Sand ||
        getGrid().get(current.getAdjacentLocation(direct270)) instanceof Sand)
        {
            moveTo(current.getAdjacentLocation(direct270));
            adjustOcean();
            adjustSand();
            if(inSun)
            {
                gr.get(new Location(getLocation().getRow(),getLocation().getCol()+1)).setColor(Color.WHITE);
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
                if(getGrid().isValid(loc) && getGrid().get(loc)==null)
                {
                    ocean=new Ocean();
                    ocean.putSelfInGrid(getGrid(),new Location(r,c));
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
                if(getGrid().isValid(loc) && getGrid().get(loc)==null)
                {
                    sand=new Sand();
                    sand.putSelfInGrid(getGrid(),new Location(r,c));
                }
            }
        }
    }

    //there's a 10% chance that the enemy will have the brains to 
    //run to the beach so they do. (random stuff) 
    public void runToBeach()
    {
        double chance=Math.random(); 
    } 
}
