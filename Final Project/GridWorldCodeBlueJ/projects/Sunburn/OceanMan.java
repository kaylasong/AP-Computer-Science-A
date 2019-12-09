import info.gridworld.actor.*;
import info.gridworld.grid.*; 
import java.awt.Color;
import java.util.ArrayList;
public class OceanMan extends Enemy
{
    private boolean inOcean; 
    private Grid<Actor> gr;
    private int health; 
    private Location spot; 
    private boolean inSun;
    public OceanMan(Location sp, Grid<Actor> g)
    {
        super(sp,g); 
        if(sp.getCol()<=12)
            setDirection(90);
        else
            setDirection(270);
        health=100; 
        spot=sp;
        setColor(null);
        gr=g;
        inSun=false;
    }

    //override accessors/mutators
    public int getHealth()
    {
        return(health);
    }

    public void changeHealth(int x)
    {
        health=health-(x/3); 
    }
}
