public class Vehicle
{
    public int year;
    public String make;  
    public String model;

    public Vehicle()
    {
        make = new String();
        year = 0;
        model = new String();
    } // end constructor Vehicle

    public boolean canGo() 
    {
        return false;
    }

    public boolean canStop() 
    {
        return true;
    }

    public boolean canTurn() 
    {
        return false;
    }
} 
// end class Vehicle