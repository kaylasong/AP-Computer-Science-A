public class Employee extends StaffMember
{
    //instance variables
    private int vacationDays;
    
    //constructor
    public Employee(String na, int ID, int sal)
    {
        super(na,ID);
        vacationDays=10;
        //doesn't set up salary?
        salary=sal;
    }
    
    //accessors
    public int getVDays()
    {
        return(vacationDays);
    }
    
    //mutators
    public void vacation()
    {
        if(vacationDays==0)
        {
            throw new ArithmeticException();
        }
        vacationDays--;
    }
    public void vacation(int n)
    {
        if(vacationDays>=n)
        {
            throw new ArithmeticException();
        }
        vacationDays=vacationDays-n;
    }
    
    //to change vacationDays
    public void changeVacationDays(int x)
    {
        vacationDays=x;
    }
}