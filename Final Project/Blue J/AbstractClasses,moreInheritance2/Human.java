public abstract class Human
{
    //instance data
    private String name;
    //constructor
    public Human(String nm)
    {
        name=nm;
    }
    
    //accessor
    public String getName()
    {
        return(name);
    }
    
    //abstract methods
    public abstract String toString();
    public abstract boolean canVote();
}   