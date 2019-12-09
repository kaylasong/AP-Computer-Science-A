public class JournalEntryDriver
{
    public static void main()
    {
        JournalEntry a=new JournalEntry("hello there",1);
        JournalEntry b=new JournalEntry("hullo my fren",2);
        JournalEntry c=new JournalEntry("hi fellow human",3);
        
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(c));
        System.out.println(c.compareTo(a));
        
        System.out.println(a.getPriority());
        System.out.println(b.getPriority());
        System.out.println(c.getPriority());
        
        a.setPriority(2);
        b.setPriority(3);
        c.setPriority(1);
        
        System.out.println(a.getEntry());
        System.out.println(b.getEntry());
        System.out.println(c.getEntry());
        
        System.out.println(a.wordCount());
        System.out.println(b.wordCount());
        System.out.println(c.wordCount());
        
        a.setEntry("hello");
        b.setEntry("hullo");
        c.setEntry("hi");
        
        System.out.println("total num of entries");
        System.out.println(JournalEntry.getTotalCount());
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);        
    }
}
