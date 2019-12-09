public class GoldenTicketDriver
{
    public static void main()
    {
        GoldenTicket me=new GoldenTicket("kayla",40);
        GoldenTicket a=new GoldenTicket("a",2);
        GoldenTicket b=new GoldenTicket("b",1);
        
        System.out.println(me.getPriority());
        System.out.println(a.getPriority());
        System.out.println(b.getPriority());
        
        me.setPriority(3);
        a.nextUp();
        b.nextUp();
        me.nextUp();
    }
}
