public class GoldenTicket implements Priority
{
    private String name;
    private int priority;
    //lower number represents higher priority, with the lowest/best at 1
    //constructor
    public GoldenTicket(String nm, int initialSpot)
    {
        name=nm;
        priority=initialSpot;
    }
    
    //interface methods
    public int getPriority()
    {
        return(priority);
    }
    
    public void setPriority(int a)
    {
        System.out.println("Boi, you gotta wait your turn smh.");
    }
    
    //other
    public void nextUp()
    {
        priority--;
        if(priority<=1)
        {
            System.out.println("Tada!");
        }
    }
}
