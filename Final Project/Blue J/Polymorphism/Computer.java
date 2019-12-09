/* Required methods:
 * public int getRewindTime();
    public void play();
    public boolean skipPreviews(); */
public class Computer extends DVDPlayer implements PlayMovie
{
    //instance variables
    private String name;
    private int num;
    //constructor
    public Computer(String nm,int nu)
    {
        name=nm;
        num=nu;
    }
    //accessors
    public String getName()
    {
        return(name);
    }
    public int getProcs()
    {
        return(num);
    }
    //required methods
    public int getRewindTime()
    {
        return(0);
    }
    public boolean skipPreviews()
    {
        return(true);
    }
}
