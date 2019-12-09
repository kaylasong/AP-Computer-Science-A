public class Car extends Vehicle
{
    public Car(int y, String ma, String mo)
    {
        year=y;
        make=ma;
        model=mo;
    }
    
    public boolean canGo()
    {
        return(true);
    }
    public boolean canTurn()
    {
        return(true);
    }
    public boolean canGoFast()
    {
        if(year>=2000 || make.equals("Ferrari"))
        {
            return(true);
        }
        else 
            return(false);
    }
}
