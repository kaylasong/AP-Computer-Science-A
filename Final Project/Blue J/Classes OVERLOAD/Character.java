public class Character
{
    //THIS IS THE CHARACTER CONSTRUCTOR THINGY
    private String name;
    private int health;
    private int maxHealth;
    private int mana;
    private int maxMana;
    private int minDamage;
    private int maxDamage;
    
    //CONSTRUCTOR THINGS
    public Character(String nm)
    {
        name=nm;
        health=100;
        maxHealth=100;
        mana=100;
        maxMana=100;
        //this is the damage that the character inflicts on other people
        minDamage=12;
        maxDamage=16;
    }
    public Character()
    {
        name="CPU";
        health=120;
        maxHealth=120;
        maxMana=0;
        mana=0;
        //this is the damage that the character inflicts on other people
        minDamage=15;
        maxDamage=20;
    }
    
    //ACCESSORS
    public String getName()
    {
        return name;
    }
    public int getHealth()
    {
        return health;
    }
    public int getMana()
    {
        return mana;
    }
    
    //OTHER METHODS
    public void heal(int n)
    {
        if(n>0)
        {
            for(int i=0;i<n&&health<=maxHealth;i++)
            {
                health++;
            }
        }
    }
    public void heal()
    {
        health=maxHealth;
    }
    public void takeDamage(int n)
    {
        health=health-n;
    }
    public boolean isDead()
    {
        if(health<=0)
        {
            return true;
        }
        else return false;
    }
    public void attack(Character enemy)
    {        
        int damage=(int)(minDamage+(1+maxDamage-minDamage)*Math.random());
        enemy.takeDamage(damage);
    }
    public void useMana(int a)
    {
        mana=mana-a;
    }
    
    //SPECIFIC ATTACKS'N'STUFF
    public void fireball(Character enemy)
    {
        if(mana>=43)
        {
            mana=mana-43;
            enemy.takeDamage(30);
            System.out.println("The enemy took 30 damage");
        }
        else System.out.println("There is not enough mana!");
    }
    public void healSpell()
    {
        if(mana>=18)
        {
            mana=mana-18;
            heal(35);
            System.out.println("You have been healed by 35 pts");
        }
        else System.out.println("There is not enough mana!");
    }
    
    //A Boost!
    public void aBoost()
    {
        health=health+5;
        mana=mana+5;
    }
    
    //fancy schmancy attacks
    public void third(Character dude)
    {
        dude.takeDamage(10);
        heal(10);
        mana=mana-5;
    }
}
