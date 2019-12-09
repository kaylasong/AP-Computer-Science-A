import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.*;
import java.awt.Color;
public class ChameleonKid extends ChameleonCritter
{
    //changes color to front or behind
    public ArrayList<Actor> getActors()
    {
        Location current=getLocation();
        ArrayList<Actor> ans=new ArrayList<Actor>();
        Location front=null;
        Location back=null;
        if(getLocation().getCol()<(getGrid().getNumCols())-1 && 
        getLocation().getCol()>0 && 
        getLocation().getRow()>0 &&
        getLocation().getRow()<(getGrid().getNumRows())-1)
        {
            front=current.getAdjacentLocation(getDirection());
            back=current.getAdjacentLocation(getDirection()+180);
        }
        
        System.out.println(front);
        System.out.println(back);
        System.out.println(getDirection());
        if(front!=null && (getGrid().get(front))!=null)
        {
            ans.add(getGrid().get(front));
        }
        
        if(back!=null && getGrid().get(back)!=null)
        {
            ans.add(getGrid().get(back));
        }
        System.out.println(ans);
        return(ans);
    }
}
