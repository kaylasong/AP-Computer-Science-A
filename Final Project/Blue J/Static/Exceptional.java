import java.util.*;
public class Exceptional
{
    public static void main()
    {    
        
       
        System.out.println(capFirst(null));
    }
    public static Homework mostWorth(Homework[]projects)
    {
        //loop through
        int max=Integer.MIN_VALUE;
        int mark=0;
        for(int i=0;i<projects.length;i++)
        {
            if(projects[i].getPoints()>max)
            {
                mark=i;
                max=projects[i].getPoints();
            }
        }
        double percent=(double)projects[mark].getPoints()/Homework.getTotalPoints();
        percent=percent*100;
        System.out.println("This assignment is "+percent+"% of the total points");
        return(projects[mark]);
    }
    public static ArrayList<Homework> removeNines(ArrayList<Homework> assignments)
    {
        int end=0;
        for(int i=0;i<assignments.size();i++)
        {
            end=assignments.get(i).getPoints()%10;
            if(end==9)
            {
                assignments.remove(i);
                i--;
            }
        }
        return(assignments);
    }
    public static int intPower(int x, int y)
    {
        if(y<0)
        {
            throw new ArithmeticException("that's a negative number");
        }
        else 
            return((int)Math.pow(x,y));
    }
    public static String capFirst(String input)
    {
        if(input==null)
        {
            throw new NullPointerException("well that's not gonna work");
        }
        else
        {
            input=input.substring(0,1).toUpperCase()+input.substring(1);
            return(input);
        }
    }
    public static String[] remove(String[]words,int x)
    {
        if(x<0 || x>=words.length)
        {
            throw new ArrayIndexOutOfBoundsException("that's outta bounds");
        }
        String[] ans=new String[words.length-1];
        int mark=0;
        for(int i=0;i<words.length;i++)
        {
            if(i!=x)
            {
                ans[mark]=words[i];
                mark++;
            }
        }
        return(ans);
    }
    public static String mostCommon(ArrayList<String> list1, String[] list2)
    {
        ArrayList<String> both=new ArrayList<String>();
        for(String a:list1)  
        {
            both.add(a);
        }
        for(int i=0;i<list2.length;i++)
        {
            both.add(list2[i]);
        }
        //loop through to count
        int max=0;
        String a=new String();
        int count=0;
        int mark=-1000;
        for(int i=0;i<both.size();i++)
        {
            a=both.get(i);
            for(int j=1;j<both.size();j++)
            {
                if(both.get(j).equals(a))
                {
                    count++;
                }
            }
            if(count>max)
            {
                max=count;
                mark=i;
                count=0;
            }
            else count=0;
        }
        return(both.get(mark));
    }
}
