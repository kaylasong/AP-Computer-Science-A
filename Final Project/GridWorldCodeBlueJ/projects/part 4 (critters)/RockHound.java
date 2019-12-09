import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.awt.Color;
import java.util.ArrayList;
public class RockHound extends Critter
{
    //gets actors same as critter
    //removes any rocks in its area
    //moves like a critter
    //keep: getActors, move
    public void processActors(ArrayList<Actor> actors)
    {
        for(Actor a:actors)
        {
            if(a instanceof Rock)
            {
                a.removeSelfFromGrid();
            }
        }
    }
}
