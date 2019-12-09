import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.*;
import java.awt.Color;
public class ZBug extends Bug
{
    //instance variables
    private int steps;
    private int length;
    private int part;
    private boolean done;
    //part: 0 is transition from top to middle, 1 is transition from middle to bottom
    
    //constructor
    public ZBug(int l)
    {
        //face east
        turn();
        turn();
        
        steps=0;
        length=l;
        part=0;
    }
    
    //the actual z
    public void act()
    {
        //to make the dude stop moving
        if(steps==length-1 && part==2)
        {
            
        }
        //the turns
        else if(steps==length && part==0)
        {
            turn();
            turn();
            turn();
            move();
            steps=0;
            part++;
        }
        else if(steps==length-1 && part==1)
        {
            turn();
            turn();
            turn();
            turn();
            turn();
            move();
            steps=0;
            part++;
        }
        else if(steps<length && canMove())
        {
            move();
            steps++;
        }
    }
}
