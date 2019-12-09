import java.awt.Desktop;
import java.net.URI;

import info.gridworld.actor.*;
import info.gridworld.grid.*; 
import java.awt.Color;
import java.util.ArrayList;
public class SunburnDriver
{
    public static void main()
    {  
       System.out.println("Welcome to Sunburn!");
        System.out.println("Here are the basic rules of the game:");
        System.out.println("1. You are Sky Borish, and you are trying to keep the beach"+
        " free from the \n Ocean and Sand Borishes.");
        System.out.println("2. In order to make the lil'Borishes leave, you must shine your"+
        " UV rays, and \n make them burn."); 
        System.out.println("3. Be careful around the Charlie Clouds! They'll try to steal"+
        " your shine, \n"+"and if they crash into you, you lose a life.");
        System.out.println("(Luckily for you though, the clouds will sometimes collide, and \n"+
        "not crash into you, thanks to the Wild Wind here at the beach.");
        System.out.println("4. If the beach gets too crowded (87% full) you lose.");
        System.out.println("5. Watch out for the ocean men! They're harder to burn.");
        System.out.println("5. Each burned lil'Borish gives you 10 points.");
        System.out.println("6. Try to get as many points as possible.");
        System.out.println();
        System.out.println("Here's how to play:");
        System.out.println("Use the arrow keys to move. You can move up and down to widen \n"+
        "or narrow your beam and to dodge CloudDoges, and you can also \n"+
        "turn your beam left and right to adjust your UV range.");
        System.out.println("You can only turn so much before your beams are shining on Japan or \n"+
        "Norway instead of the beach, so try not to turn too much :).");
        System.out.println("I recommend: \n"+"1) running this program at full speed and zooming in \n"+
        "on the screen by clicking on \"Location\" and \"zoom in\" so that \n"+
        "you can enjoy the full glory of the graphics."); 
        System.out.println("2) keeping this window open so that you can see the \n"+
        "status of your lives.");
        System.out.println("3) turning your volume up to enjoy the tunes");
        System.out.println("You now have 20 lives."); 
        System.out.println("Have fun fighting against the lil'Borishes and Cloud Doges!");
       
        try
        {       
            Desktop d=Desktop.getDesktop();
            URI u=new URI("https://www.youtube.com/watch?v=YB6lsbFoYqE"); 
            d.browse(u); 
        }
        catch (Exception e)
        {
            e.printStackTrace(); 
        }
        
        Grid<Actor> grid=new BoundedGrid<Actor>(15,25); 
        KeyWorld game=new KeyWorld(grid);
        game.add(new Location(4,12),new Sun(grid)); 
        //add the people and then show them.
        game.show();
    }
}
