/* Required methods:
 * public int getRewindTime();
    public void play();
    public boolean skipPreviews(); */
public class DVDPlayer implements PlayMovie 
{
    public DVDPlayer()
    {
    }
    
    public void play()
    {
        System.out.println("Major Payne");
    }
    public int getRewindTime()
    {
        return(0);
    }
    public boolean skipPreviews()
    {
        return(true);
    }
}
