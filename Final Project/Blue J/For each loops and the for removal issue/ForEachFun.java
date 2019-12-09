import java.util.*;
public class ForEachFun
{
    public static void main()
    {
        
    }
    public static int positives(int[] numbers)
    {
        int count=0;
        for(int thing:numbers)
        {
            System.out.println(thing);
            if(thing>0)
            {
                count++;
            }
        }
        return(count);
    }
    public static int sumAll(int[] thing)
    {
        int sum=0;
        for(int theeng:thing)
        {
            sum=sum+theeng;
        }
        return(sum);
    }
    public static int sumAll(ArrayList<Integer> thing)
    {
        int sum=0;
        for(int theeng:thing)
        {
            sum=sum+theeng;
        }
        return(sum);
    }
    public static ArrayList<String> removeSub(ArrayList<String> thing, String thiing)
    {
        for(int i=0;i<thing.size();i++)
        {
            if(thiing.indexOf(thing.get(i))!=-1)
            {
                thing.remove(i);
                i--;
            }
        }
        return(thing);        
    }
    public static ArrayList<Integer> removeThrees(ArrayList<Integer> thing)
    {
        for(int i=0;i<thing.size();i++)
        {
            if(Math.abs(thing.get(i))==3)
            {
                thing.remove(i);
            }
        }
        return(thing);
    }
}