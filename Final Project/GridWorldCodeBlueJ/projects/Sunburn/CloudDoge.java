import info.gridworld.actor.*;
import info.gridworld.grid.*; 
import java.awt.Color;
import java.util.ArrayList;
public class CloudDoge extends Actor
{
    public CloudDoge(int d)
    {
        setDirection(d); 
        setColor(null);
    }

    //just goes across the sky
    public void act()
    {
        setColor(null);
        Location next=getLocation().getAdjacentLocation(getDirection());
        if(getGrid().isValid(next) && (getGrid().get(next) instanceof Sun))
        {
            ((Sun)getGrid().get(next)).changeCovered(true); 
            //sending the sun the direction that the cloud was traveling. 
            ((Sun)getGrid().get(next)).setCd(getDirection()); 
            ((Sun)getGrid().get(next)).adjustSky();
            removeSelfFromGrid();
            return; 
        }
        else if(getGrid().isValid(next))
        {
            moveTo(getLocation().getAdjacentLocation(getDirection())); 
            adjustSky();
        }   
        else 
            removeSelfFromGrid(); 
    }
    
    public void adjustSky()
    {
        Sky sky=null;
        for(int r=0;r<7;r++)
        {
            for(int c=0;c<25;c++)
            {
                Location loc=new Location(r,c);
                if(getGrid().isValid(loc) && getGrid().get(loc)==null)
                {
                    sky=new Sky();
                    sky.putSelfInGrid(getGrid(),new Location(r,c)); 
                }
            }
        }
    }
}
