import info.gridworld.actor.*;
import info.gridworld.grid.*; 
import java.awt.Color;
import java.util.ArrayList;
public class Random
{
    public static void main()
    {
        for(int i=0;i<1000;i++)
        {
            int row=(int)(7+8*Math.random());
            System.out.println(row);
        }
    }
}
