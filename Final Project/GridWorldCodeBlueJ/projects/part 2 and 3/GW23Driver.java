//driver for parts 2 and 3 - submit this inside your project folder!
import info.gridworld.actor.*;
import info.gridworld.grid.*;

import java.awt.Color;

public class GW23Driver
{
    public static void main()
    {
        ActorWorld world = new ActorWorld(); 	//setting up the ActorWorld
        
        
        //add to a specific location
        world.add(new Location(1,1), new Rock());
        world.add(new Location(2,5), new Rock());
        //add to a random empty location
        world.add(new Flower());
        world.add(new Flower());
        
        world.add(new Location(7,1),new CircleBug(2));
        world.add(new Location(5,5),new ZBug(3));
        world.add(new Location(3,5),new Jumper());
        
        
        
               
        
        world.show();				//this makes the visual part appear!

        
    }
}