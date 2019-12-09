public class Armor extends Item implements Comparable<Armor>
{
    private int strength;
    private double durability;
    //constructor
    public Armor(String na,double we,int st)
    {
        super(na,we);
        strength=st;
        durability=we*st; 
    }
    
    //accessors
    public int getArmorClass()
    {
        return(strength);
    }
    public double getDurability()
    {
        return(durability);
    }
    public boolean isBroken()
    {
        if(durability<=0)
        {
            strength=0;
            return(true);
        }
        else 
            return(false);
    }
    
    //etc.
    public int getAttacked(int damage)
    {
        int ans=damage-strength;
        if(ans<0)
            return(0);
        else
        {
            durability=durability-ans;
            return(ans);
        }
        //returns the amount of damage from the weapon
    }
    public String toString()
    {
        String ans=new String(super.toString()+" "+strength);
        return(ans);
    }
    public boolean equals(Armor other)
    {
        if(super.equals(other)&&strength==other.getArmorClass())
            return(true);
        else
            return(false);
    }
    public int compareTo(Armor other)
    {
        return(strength-other.getArmorClass());
    }
}