import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.awt.Color;
import java.util.ArrayList;
public class QuickCrab extends CrabCritter
{
    //leave the: process actors
    //moves to one of 2 locations 2 spaces apart, like jumper 
    public ArrayList<Location> getMoveLocations()
    {
        ArrayList<Location> locs = new ArrayList<Location>();
        Location current=getLocation();
        //directions it turns
        int right=getDirection()+90;
        int left=getDirection()-90;
        //moving horizontally for right
        if(getDirection()==0 && getLocation().getCol()<(getGrid().getNumCols())-2 
        && getLocation().getCol()>1)
        {
            locs.add(current.getAdjacentLocation(right).getAdjacentLocation(right));
        }
        else if(getDirection()==0 && getLocation().getCol()<(getGrid().getNumCols())-1 &&
            getLocation().getCol()>0)
        {
            locs.add(current.getAdjacentLocation(right));
        }
        //moving vertically for right
        
        return locs;
    }
}
