public class Item
{
    private double weight;
    private String name;
    
    public Item(String iName,double iWeight)
    {
        weight=iWeight;
        name=iName;
    }
    
    //accessors
    public double getWeight()
    {
        return(weight);
    }
    public String getName()
    {
        return(name);
    }
    
    //mutator
    public void changeName(String s)
    {
        name=s;
    }
    
    //etc
    public String toString()
    {
        String ans=new String(name+"- "+weight);
        return(ans);
    }
    public boolean equals(Item other)
    {
        if(name.equals(other.getName()) && weight==other.getWeight())
            return(true);
        else
            return(false);
    }
}
