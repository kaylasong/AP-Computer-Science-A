public class DiaryDriver
{
    public static void main()
    {
        Diary a=new Diary();
        a.unlock(1713);
        if(a.isLocked()==false)
        {
            System.out.println("success");
        }
        JournalEntry a1=new JournalEntry("aa hi",3);
        JournalEntry a2=new JournalEntry("bb",2);
        JournalEntry a3=new JournalEntry("cc",10);
        JournalEntry a4=new JournalEntry("dd",4);
        JournalEntry a5=new JournalEntry("ee",5);
        JournalEntry a6=new JournalEntry("ff",6);
        a.addTask(a1);
        a.addTask(a2);
        a.addTask(a3);
        a.addTask(a4);
        a.addTask(a5);
        a.addTask(a6);
        
        
        System.out.println(a.numEntries());
        
        //number of words isn't working.
        System.out.println(a.numWords());
        System.out.println(a.getHighest());
        a.removeTasks(3);
        a.printAll();
    }
}
