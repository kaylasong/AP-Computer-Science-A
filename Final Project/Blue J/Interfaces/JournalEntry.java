public class JournalEntry implements Comparable<JournalEntry>,Priority
{
    private String entry;
    private int epri;
    private static int total=0;
    //constructor
    public JournalEntry(String entryInput, int priorityInput)
    {
        entry=entryInput;
        if(priorityInput<=0)
        {
            epri=1;
        }
        else epri=priorityInput;
        total++;
    }
    
    //interfacing methods
    public int compareTo(JournalEntry b)
    {
        int ans=epri-b.getPriority();
        return(ans);
    }
    public int getPriority()
    {
        return(epri);
    }
    public void setPriority(int a)
    {
        epri=a;
    }
    
    //accessors and mutators
    public String getEntry()
    {
        return(entry);
    }
    public void setEntry(String e)
    {
        entry=e;
    }
    public int wordCount()
    {
        int count=1;
        String e=new String(entry);
        while(e.indexOf(" ")!=-1)
        {
            count++;
            e=e.substring(e.indexOf(" ")+1);
        }
        return count;
    }
    public static int getTotalCount()
    {
        //returns total number of entries.        
        return(total);
    }
    
    //toString
    public String toString()
    {
        String ans=new String("Entry: "+entry+"\nPriority: "+epri);
        return(ans);
    }
}
