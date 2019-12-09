//the sunny sky
import info.gridworld.actor.*;
import info.gridworld.grid.*; 
import java.awt.Color;
import java.util.ArrayList;
public class Sunny
{
    //direction 
    private int d;
    private Location sloc;
    
    private Sun220 s220;
    private Sun200 s200;
    private Sun180 s180;
    private Sun160 s160;
    private Sun140 s140;
    
    public Sunny(int dir, Location loc, Grid<Actor> gr)
    {
        d=dir;
        sloc=loc;
        s220=new Sun220(sloc);
        s200=new Sun200(sloc);
        s180=new Sun180(sloc);
        s160=new Sun160(sloc);
        s140=new Sun140(sloc);
    }
    
    public ArrayList<Location> getRange()
    {
        if(d==180)
        {
            return(s180.getRange());
        }
        else if(d==160)
        {
            return(s160.getRange());
        }
        else if(d==140)
        {
            return(s140.getRange());
        }
        else if(d==200)
        {
            return(s200.getRange());
        }
        else if(d==220)
        {
            return(s220.getRange());
        }
        return(null);
    }
    
    public void setRange()
    {
        //creating a new list of locations and setting instance variable range to ra.
        if(d==180)
        {
            /*int stage=1;
            int count=0;
            int start=a.getCol();
            int length=1;
            for(int r=a.getRow()+1;r<15;r++)
            {
                for(int c=start;c<start+length;c++)
                {
                    ra.add(new Location(r,c));
                    count++;
                    if(stage==1 && count==2)
                    {
                        count=0;
                        stage++;
                        start--;
                        length=length+2;
                    }
                    else if(stage==2 && count==9)
                    {
                        count=0;
                        stage++;
                        start--;
                        length=length+2;
                    }
                    else if(stage==3 && count==15)
                    {
                        count=0;
                        stage++;
                        start--;
                        length=length+2;
                    }
                    else if(stage==4 && count==21)
                    {
                        count=0;
                        stage++;
                        start--;
                        length=length+2;
                    }
                }
            }
            range=ra;    */       
            
        }
        else if(d==200)
        {
            /*int length=2;
            int start=a.getRow()+1;
            for(int c=a.getCol()-1;c>=0;c--)
            {
                for(int r=start;r<start+length && r<15;r++)
                {
                    ra.add(new Location(r,c));
                }
                length=length+2;
                start++;
            }
            range=ra;*/
        }
        else if(d==160)
        {
            /*int length=2;
            int start=a.getRow()+1;
            for(int c=a.getCol()+1;c<25;c--)
            {
                for(int r=start;r<start+length && r<15;r++)
                {
                    ra.add(new Location(r,c));
                }
                length=length+2;
                start++;
            }
            System.out.println(range);
            range=ra; */
        }
        else if(d==140)
        {
            /*int start=a.getCol()+1;
            int length=1;
            for(int r=a.getRow()+1;r<15;r++)
            {
                for(int c=start;c<start+length;c++)
                {
                    ra.add(new Location(r,c));
                }
                length=length*2;
                start++;
            }
            System.out.println(range);
            range=ra; */
        }
        else if(d==220)
        {
            /*int start=a.getCol()-1;
            int length=-1;
            for(int r=a.getRow()+1;r<15;r++)
            {
                for(int c=start;c<start+length;c--)
                {
                    ra.add(new Location(r,c));
                }
                length=length*2;
                start--;
            }
            System.out.println(range);
            range=ra; */
        }
    }
}
