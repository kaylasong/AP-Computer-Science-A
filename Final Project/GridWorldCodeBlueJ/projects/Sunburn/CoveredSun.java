import info.gridworld.actor.*;
import info.gridworld.grid.*; 
import java.awt.Color;
import java.util.ArrayList;
public class CoveredSun extends Sun
{
    private Sun temp;
    //the direction of the cloud
    private int cdirection; 
    public CoveredSun(Sun t,int d,Grid<Actor> g)
    {
        super(g);
        setColor(null);
        temp=t;
        cdirection=d; 
    }
    
    public void act()
    {
        Grid<Actor> gr=getGrid(); 
        Location s=getLocation(); 
        //the previous sun that is going to be put back.
        Sun a=temp;
        a.changeCovered(false); 
        //the cloud being replaced and moving on
        CloudDoge cloud=new CloudDoge(cdirection); 
        //the location of the replaced cloud. 
        Location c=getLocation().getAdjacentLocation(cdirection); 
        cloud.putSelfInGrid(getGrid(),c); 
        removeSelfFromGrid();
        a.putSelfInGrid(gr,s);  
    }
}
