public class Convertible extends Car
{
    private boolean isTopDown;
    
    public Convertible(int y,String ma, String mo)
    {
        super(y,ma,mo);
        isTopDown=false;
    }
    
    public boolean canGoFast()
    {
        return(true);
    }
    public boolean topDown()
    {
        return(isTopDown);
    }
    
    public void raiseTop()
    {
        isTopDown=false;
    }
    public void lowerTop()
    {
        isTopDown=true;
    }
}