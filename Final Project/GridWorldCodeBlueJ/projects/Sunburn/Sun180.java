import info.gridworld.actor.*;
import info.gridworld.grid.*; 
import java.awt.Color;
import java.util.ArrayList;
public class Sun180
{
    private ArrayList<Location> range;
    public Sun180(Location a)
    {
        ArrayList<Location> ra=new ArrayList<Location>(); 
        int stage=1;
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
        range=ra;     
    }

    public ArrayList<Location> getRange()
    {
        return(range);
    }
}