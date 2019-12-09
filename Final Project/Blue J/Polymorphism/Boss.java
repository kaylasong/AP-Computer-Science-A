public class Boss extends Employee
{
    public Boss(String na, int ID, int sal)
    {
        super(na,ID,sal);
        changeVacationDays(20);
    }
    
    //the boss gets a bonus
    public void awardBonus(int n)
    {
        salary=salary+n;
    }
}
