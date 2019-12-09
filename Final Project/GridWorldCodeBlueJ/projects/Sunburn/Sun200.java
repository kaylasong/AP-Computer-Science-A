import info.gridworld.actor.*;
import info.gridworld.grid.*; 
import java.awt.Color;
import java.util.ArrayList;
public class Sun200 
{
    private ArrayList<Location> range;
    public Sun200(Location a)
    {
        ArrayList<Location> ra=new ArrayList<Location>(); 
        int length=2;
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
        range=ra;
    }

    public ArrayList<Location> getRange()
    {
        return(range);
    }
}
