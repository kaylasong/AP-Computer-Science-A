import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.awt.Color;
import java.util.ArrayList;
public class BlusterCritter extends Critter 
{
    private int c;
    //c is courage, determining if the bc is brave enough to 
    //brighten in the presence of the grand procession of critters
    public BlusterCritter(int co)
    {
        c=co;
    }
    
    public ArrayList<Actor> getActors()
    {
        ArrayList<Actor> humins=super.getActors();
        
        Location a=getLocation();
        Location b=null;
        Location c=null;
        for(int i=315;i<316;i=i+90)
        {
            b=a.getAdjacentLocation(i);
            for(int j=i-45;j<i+140;j=j+45)
            {
                c=b.getAdjacentLocation(j);
                if(getGrid().isValid(c) && getGrid().get(c)!=null)
                {
                    humins.add(getGrid().get(c));
                }
            }
        }
        System.out.println(humins.size());
        return(humins);
    }
    public void processActors(ArrayList<Actor> a)
    {
        int b=a.size();
        if(b>=c)
            setColor(getColor().darker());
        else
            setColor(getColor().brighter());
    }
}
