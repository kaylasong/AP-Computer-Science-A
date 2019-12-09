import java.util.*;
public class Homework
{
    //nonstatic
    private String des;
    private int pts;
    //static
    private static int num=0;
    private static int tPts=0;
    private static ArrayList<String> allDes=new ArrayList<String>();
    public static final boolean BORISHRULES=true;
    
    //constructor
    public Homework(String desc, int points)
    {
        des=desc;
        pts=points;
        
        num++;
        tPts=tPts+points;
        allDes.add(desc);
    }
    
    //accessor
    public String getDescription()
    {
        return(des);
    }
    public int getPoints()
    {
        return(pts);
    }
    
    //mutators
    public void changePoints(int n)
    {
        tPts=tPts-pts;
        pts=n;
        tPts=tPts+pts;
    }
    
    public String toString()
    {
        String ans=new String("Description: "+des+"\nPoints: "+pts);
        return(ans);
    }
    
    //static methods
    public static void printAssignments()
    {
        for(String a: allDes)
        {
            System.out.println(a);
        }
    }
    public static int numAssignments()
    {
        return(num);
    }
    public static int getTotalPoints()
    {
        return(tPts);
    }
    public static Homework fewestPoints(Homework a, Homework b)
    {
        if(a.getPoints()>b.getPoints())
        {
            return(b);
        }
        else 
            return(a);
    }
}
