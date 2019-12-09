import info.gridworld.actor.*;
import info.gridworld.grid.*; 
import java.awt.Color;
import java.util.ArrayList;
public class Sun140
{
    private ArrayList<Location> range;
    public Sun140(Location a)
    {
        ArrayList<Location> ra=new ArrayList<Location>(); 
        int start=a.getCol()+1;
        int length=1;
        for(int r=a.getRow()+1;r<15;r++)
        {
            for(int c=start;c<start+length && c<25;c++)
            {
                ra.add(new Location(r,c));
            }
            length=length*2;
            start++;
        }
        range=ra; 
    }

    public ArrayList<Location> getRange()
    {
        return(range);
    }
}