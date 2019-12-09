public abstract class StaffMember
{
    //instance variables
    private String name;
    private int id;
    public int salary;
    
    //constructor
    public StaffMember(String na, int ID)
    {
        name=na;
        id=ID;
    }
    
    //accessors
    public String getName()
    {
        return(name);
    }
    public int getSalary()
    {
        return(salary);
    }
    public int getID()
    {
        return(id);
    }
    
    //mutator
    public void changeID(int newID)
    {
        id=newID;
    }
    
    //toString
    public String toString()
    {
        return("Name: "+name+", ID: "+id+", Salary: "+salary);
    }
    
    //inputs any object and returns false if the object is not a StaffMember and true if
    //the object is a StaffMember with the same ID num
    public boolean equals(Object other)
    {
        if(other instanceof StaffMember && ((StaffMember)other).getID()==id)
        {
            return(true);
        }
        else
            return(false);
    }
}
