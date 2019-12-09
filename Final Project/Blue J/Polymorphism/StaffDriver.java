import java.util.*;
public class StaffDriver
{
    public static void main()
    {
        Staff list=new Staff(); 
        list.add(new Employee("A",1,1));
        list.add(new Employee("b",1,2));
        list.add(new Volunteer("c",2));
        list.add(new Volunteer("Bob",2));
        list.add(new Boss("Bob",3,10));
        list.add(new Boss("f",3,11));
        list.print();
        
        System.out.println(list.allSalary());
        System.out.println(list.countVolunteers());
        System.out.println(list.getBoss("f"));
        System.out.println(list.first());
        
        //second list
        ArrayList<StaffMember> other=new ArrayList<StaffMember>();
        other.add(new Employee("a2",1,1));
        other.add(new Employee("b2",2,2));
        other.add(new Volunteer("c2",3));
        other.add(new Volunteer("Bob2",4));
        other.add(new Boss("Bob2",9,10));
        other.add(new Boss("f2",10,11));
        for(int i=0;i<other.size();i++)
        {
            System.out.println(other.get(i));
        }
        
        System.out.println();
        System.out.println(list.countDupes(other));
        
    }
}
