public class Weapon extends Item
{
    private int max;
    private int min;
    
    //Constructor
    public Weapon(String na, double we, int mi, int ma)
    {
        super(na,we);
        max=ma;
        min=mi;
    }
    
    //accessors
    public int getMinDamage()
    {
        return(min);
    }
    public int getMaxDamage()
    {
        return(max);
    }
    
    //etc.
    public int attackDamage()
    {
        int range=max-min+1;
        int damage=(int)(min+range*Math.random());
        return(damage);
    }
    public String toString()
    {
        String ans=new String(super.toString()+" "+min+"-"+max);
        return(ans);
    }
    public boolean equals(Weapon other)
    {
        if(super.equals(other)&& max==other.getMaxDamage() && min==other.getMinDamage())
        {
            return(true);
        }
        else
            return(false);
    }
}