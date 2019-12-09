import java.util.*;
public class Planner
{
    private ArrayList<Date> calendar;
    private ArrayList<String> assignments;
    
    public Planner(ArrayList<Date> cal)
    {
        calendar=cal;
        assignments=new ArrayList<String>();
    }
    
    //ACCESSORS
    public int dateLength()
    {
        return(calendar.size());
    }
    public ArrayList<Date> getCalendar()
    {
        return(calendar);
    }
    public ArrayList<String> getAssignments()
    {
        return(assignments);
    }
    public int assignmentLength()
    {
        return(assignments.size());
    }
    
    //MUTATORS and WACK STUFF
    public void addAssignment(String thing)
    {
        assignments.add(0,thing);
    }
    public boolean containsDate(Date thing)
    {
        boolean found=false;
        for(int i=0;i<calendar.size();i++)
        {
            if(calendar.get(i).equals(thing))
            {
                found=true;
            }
        }
        return found;
    }
    public void printAssignments()
    {
        for(int i=0;i<assignments.size();i++)
        {
            System.out.println(assignments.get(i));
        }
    }
}
