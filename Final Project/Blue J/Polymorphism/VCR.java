/* Required methods:
 * public int getRewindTime();
    public void play();
    public boolean skipPreviews(); */
public class VCR implements PlayMovie
{
    //instance variables
    private int time;
    
    //constructor
    public VCR(int t)
    {
        time=t;
    }
    
    //accessor
    public int getRewindTime()
    {
        return(time);
    }
    
    //prints the name of fav movie
    public void play()
    {
        System.out.println("Major Payne");
    }
    
    public boolean skipPreviews()
    {
        return(false);
    }
}
