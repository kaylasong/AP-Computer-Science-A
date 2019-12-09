
import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.awt.Color;

public class GW4Driver
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();

        
        
        
        //comment out some of these lines as you go so you can test
        //when you turn it in, make sure all lines are uncommented.
        //I put them as different colors so you can see which is which.
        ChameleonKid a = new ChameleonKid();
        a.setColor(Color.RED);
        world.add(new Location(1,1),a);
        RockHound b = new RockHound();
        b.setColor(Color.PINK);
        world.add(new Location(3,7),b);
        QuickCrab c = new QuickCrab();
        c.setColor(Color.BLUE);
        world.add(new Location(8,7),c);

        world.add(new Location(7,7), new Flower());
        world.add(new Location(7,6), new Flower());
        world.add(new Location(7, 8), new Rock());
        world.add(new Location(3, 3), new Rock()); 
        //add to random spots
        world.add(new Rock());
        world.add(new Rock());
        world.add(new Bug());
        world.add(new Bug());
        
        world.show();
    }
}