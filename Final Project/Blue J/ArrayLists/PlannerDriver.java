import java.util.*;
public class PlannerDriver
{
    public static void main()
    {
        ArrayList<Date> days=new ArrayList<Date>();
        days.add(new Date(3,4,2004));
        days.add(new Date(9,28,1986));
        
        Planner p=new Planner(days);
        p.addAssignment(new String("do homework"));
        p.addAssignment(new String("read a lot of books"));
        p.printAssignments();
        System.out.println(p.getCalendar());
    }
}
