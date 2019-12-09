import java.util.*;
public class Staff
{
    //to keep track of all the Staff Members at the company in an ArrayList
    
    
    //instance variables
    private ArrayList<StaffMember> staff;
    
    //constructor
    public Staff()
    {
        staff=new ArrayList<StaffMember>();
    }
    
    //mutator to add people to the staff
    public void add(StaffMember dude)
    {
        for(int i=0;i<staff.size();i++)
        {
            if(((StaffMember)dude).getID()==((StaffMember)staff.get(i)).getID())
            {
                int newid=highestID(staff)+1;
                dude.changeID(newid);
            }
        }
        staff.add(dude);
    }
    public int highestID(ArrayList<StaffMember> staff)
    {
        int max=0;
        for(int i=0;i<staff.size();i++)
        {
            if(((StaffMember)staff.get(i)).getID()>max)
            {
                max=((StaffMember)staff.get(i)).getID();
            }
        }
        return(max);
    }
    
    //accessors
    //the entire staff's salary as a whole
    public int allSalary()
    {
        int total=0;
        for(int i=0;i<staff.size();i++)
        {
            total=total+((StaffMember)staff.get(i)).getSalary();
        }
        return(total);
    }
    
    //counts the number of volunteers in the staff
    public int countVolunteers()
    {
        int count=0;
        for(StaffMember a: staff)
        {
            if(a instanceof Volunteer)
            {
                count++;
            }
        }
        return(count);
    }
    
    //finds the boss of that name
    public Boss getBoss(String name)
    {
        for(StaffMember a: staff)
        {
            if(a instanceof Boss && ((StaffMember)a).getName().equals(name))
            {
                return((Boss)a);
            }
        }
        return(null);
    }
    
    //ignore volunteers. returns Employee whose name comes first alphabetically.
    public Employee first()
    {
        String n=((StaffMember)staff.get(0)).getName();
        int mark=0;
        for(int i=1;i<staff.size();i++)
        {
            if(staff.get(i) instanceof Employee || staff.get(i) instanceof Boss)
            {
                if(((StaffMember)staff.get(i)).getName().compareTo(n)<0)
                {
                    n=((StaffMember)staff.get(i)).getName();
                    mark=i;
                }   
            }
        }
        return((Employee)staff.get(mark));
    }
    
    //finds the number of staffMembers who are in both lists.
    public int countDupes(ArrayList<StaffMember> other)
    {
        int count=0;
        for(int i=0;i<staff.size();i++)
        {
            for(int ot=0;ot<other.size();ot++)
            {
                if(staff.get(i).equals(other.get(ot)))
                {
                    count++;
                }
            }
        }
        return(count);
    }
   
    public void print()
    {
        for(int i=0;i<staff.size();i++)
        {
            System.out.println(staff.get(i));
        }
    }
}