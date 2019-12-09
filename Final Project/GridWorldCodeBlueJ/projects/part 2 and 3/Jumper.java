import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.*;
import java.awt.Color;
public class Jumper extends Actor
{
    //constructor
    public Jumper()
    {
        setColor(Color.GREEN);
    }
    //alternate constructor
    public Jumper(Color c)
    {
        setColor(c);
    }
    
    //act is called every time a "step" is made. 
    //if the character can jump 2 spaces, it will, but otherwise it shimmies one step.
    //If it can do nothin, it just turns
    public void act()
    {
        if(canMove()==0)
        {
            turn();
        }
        else
        {
            move(canMove());
        }
    }
    //canMove will return an int representing how many spaces the buggy can move
    public int canMove()
    {
        //the current tile that the actor is on
        //if there ain't a jumper on the tile, then it can't move at all. Turn.
        Grid<Actor> a=getGrid();
        if(a==null)
        {
            return(0);
        }
        
        Location current=getLocation();
        Location next=current.getAdjacentLocation(getDirection());
        Location next2=next.getAdjacentLocation(getDirection());
        //the space must be available and entirely empty
        if((a.isValid(next2)) && (a.get(next2)==null))
        {
            return(2);
        }
        else if(a.isValid(next) && (a.get(next)==null))
        {
            return(1);
        }
        else
            return(0);
    }
    //move will move as much as canMove() allows
    public void move(int s)
    {
        Grid<Actor> a=getGrid();
        //repeating: what if the space is zero
        if(a==null)
        {
            return;
        }
        
        Location current=getLocation();
        Location next=current.getAdjacentLocation(getDirection());
        Location next2=next.getAdjacentLocation(getDirection());
        if(s==1 && a.isValid(next))
        {
            moveTo(next);
        }
        else if(s==2 && a.isValid(next2))
        {
            moveTo(next2);
        }
        else 
            return;
    }
    
    //lil methods 
    public void turn()
    {
        setDirection(getDirection()+Location.HALF_RIGHT);
    }
}
