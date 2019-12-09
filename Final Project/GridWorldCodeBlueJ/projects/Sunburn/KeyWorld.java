import info.gridworld.actor.*;
import info.gridworld.grid.*; 
import java.awt.Color;
import java.util.ArrayList;
public class KeyWorld extends ActorWorld
{
    public KeyWorld(Grid<Actor> g)
    {
        super(g);
    }

    public boolean keyPressed(String des, Location loc)
    {
        Actor sun=null;
        Grid<Actor> g=getGrid();
        for(int r=0;r<8;r++)
        {
            Location look=new Location(r,12);
            if(g!=null && g.get(look) instanceof Sun)
            {
                sun=g.get(look);
                break;
            }
        }
        if(des.equals("UP"))
        {
            ((Sun)sun).moveUp();
            return(true);
        }
        else if(des.equals("DOWN"))
        {
            ((Sun)sun).moveDown();
            return(true);
        }
        else if(des.equals("RIGHT"))
        {
            ((Sun)sun).turnRight();
            return(true);
        }
        else if(des.equals("LEFT"))
        {
            ((Sun)sun).turnLeft();
            return(true);
        }
        return(false);
    }
}
