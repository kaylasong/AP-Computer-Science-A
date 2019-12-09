import java.util.*;
public class Diary implements Lockable
{
    private ArrayList<JournalEntry> inside;
    private boolean isLocked;
    //password is:1713

    //constructor
    public Diary()
    {
        inside=new ArrayList<JournalEntry>();
        isLocked=true;
    }

    //interface methods
    public void unlock(int a)
    {
        if(a==password)
        {
            isLocked=false;
        }
    }
    public void lock(int a)
    {
        if(a==password)
        {
            isLocked=true;
        }
        else
            System.out.println("That is incorrect.");
    }
    public boolean isLocked()
    {
        return(isLocked);
    }

    //other
    public void addTask(JournalEntry newOne)
    {
        if(isLocked==true)
        {
            System.out.println("This diary is locked.");
        }
        else
            inside.add(newOne);
    }
    public int numEntries()
    {
        if(isLocked==true)
        {
            return(-1);
        }
        return(inside.size());
    }
    public int numWords()
    {
        if(isLocked==true)
        {
            return(-1);
        }
        int count=0;
        for(int i=0;i<inside.size();i++)
        {
            count=count+inside.get(i).wordCount();
        }
        return(count);
    }
    public JournalEntry getHighest()
    {
        if(isLocked==true)
        {
            return(null);
        }
        int p=Integer.MAX_VALUE;
        int mark=-1;
        for(int i=0;i<inside.size();i++)
        {
            if(inside.get(i).getPriority()<p)
            {
                p=inside.get(i).getPriority();
                mark=i;
            }
        }
        return(inside.get(mark));
    }
    public void removeTasks(int n)
    {
        if(isLocked==true)
        {
            System.out.println("Rats, it's locked.");
        }
        for(int i=0;i<inside.size();i++)
        {
            if(inside.get(i).getPriority()<=n)
            {
                inside.remove(i);
                i--;
            }
        }
        for(int i=0;i<inside.size();i++)
        {
            int currentp=inside.get(i).getPriority();
            inside.get(i).setPriority(currentp-n);
        }
    }
    public void printAll()
    {
        if(isLocked==true)
        {
            System.out.println("Rats, it's locked.");
        }
        System.out.println(inside);
    }
}
