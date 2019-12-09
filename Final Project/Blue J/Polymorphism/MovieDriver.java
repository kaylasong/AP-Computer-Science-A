import java.util.*;
public class MovieDriver
{
    public static void main()
    {
        ArrayList<PlayMovie> list=new ArrayList<PlayMovie>();
        list.add(new DVDPlayer());
        list.add(new VCR(10));
        list.add(new Computer("comp",5));
        list.add(new Computer("comp2",1));
        
        playN(list.get(0),3);
        playN(list.get(1),3);
        playN(list.get(2),3);
        
        System.out.println();
        System.out.println(timeToWatch(list.get(0),3));
        System.out.println(timeToWatch(list.get(1),3));
        System.out.println(timeToWatch(list.get(2),3));
        
        System.out.println();
        System.out.println(canPlayGames(list.get(0)));
        System.out.println(canPlayGames(list.get(2)));
        System.out.println(canPlayGames(list.get(3)));
        
        System.out.println();
        System.out.println(upgrade(list.get(0)));
        System.out.println(upgrade(list.get(2)));
        System.out.println(upgrade(list.get(1)));
        
        System.out.println();
        System.out.println(removeOld(list));
        System.out.println(anyType("Banana"));
        System.out.println(anyType("VCR"));
    }

    public static void playN(PlayMovie p, int n)
    {
        for(int i=0;i<n;i++)
        {
            p.play(); 
        }
    }
    public static int timeToWatch(PlayMovie p, int n)
    {
        int time=p.getRewindTime()+n;
        if(p.skipPreviews()==true)
        {
            time=time-5;
        }
        return(time);
    }
    public static boolean canPlayGames(PlayMovie p)
    {
        if(p instanceof Computer && ((Computer)p).getProcs()>=2)
        {
            return(true);
        }
        else return(false);
    }
    public static Computer upgrade(PlayMovie p)
    {
        if(p instanceof Computer && ((Computer)p).getProcs()>=2)
        {
            return((Computer)p);
        }
        else 
        {
            p=new Computer("John",4);
            return((Computer)p);
        }
    }
    public static ArrayList<PlayMovie> removeOld(ArrayList<PlayMovie> list)
    {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i) instanceof VCR)
            {
                list.remove(i);
                i--;
            }
        }
        return(list);
    }
    public static Object anyType(String desiredOutput)
    {
        //I DON'T UNDERSTAND WHAT THIS IS TALKING ABOUT
        if(desiredOutput.equals("VCR"))
        {return(new VCR(5));}
        if(desiredOutput.equals("DVDPlayer"))
        {return(new DVDPlayer());}
        if(desiredOutput.equals("Computer"))
        {return(new Computer("charlie",2));}
        if(desiredOutput.equals("Integer"))
        {return(new Integer(5));}
        return(new String("this method is not designed to return "+desiredOutput+" objects."));
    }
}