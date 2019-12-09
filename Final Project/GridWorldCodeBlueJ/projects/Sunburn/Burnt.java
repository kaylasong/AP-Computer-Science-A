import info.gridworld.actor.*;
import info.gridworld.grid.*; 
import java.awt.Color;
import java.util.ArrayList;
public class Burnt extends Actor
{
    public Burnt()
    {
        setColor(null);
    }
    
    public void act()
    {
        removeSelfFromGrid(); 
    }
}
