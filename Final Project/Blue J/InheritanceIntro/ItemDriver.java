import java.util.*;
public class ItemDriver
{
    public static void main()
    {
        Item[] stufffff=new Item[5];
        Weapon a=new Weapon("farlig ting", 5.3,10,0);
        Armor b=new Armor("potionthing", 6.4, 5);
        Weapon c=new Weapon("annen ting", 5.4,100, 10);
        Armor d=new Armor("gulegardiner",20,80);
        Weapon e=new Weapon("delig", 36,24,12);
        stufffff[0]=a;
        stufffff[1]=b;
        stufffff[2]=c;
        stufffff[3]=d;
        stufffff[4]=e;
        System.out.println(totalWeight(stufffff));
        System.out.println();
        for(int i=0;i<20;i++) 
        {
            System.out.println(attack(a,b));
            System.out.println(b.getDurability());
            System.out.println(b.isBroken());
        }
        System.out.println();
        System.out.println(countWeapons(stufffff));
        ArrayList<Item> isak=new ArrayList<Item>();
        isak.add(a);
        isak.add(b);
        isak.add(c);
        isak.add(d);
        isak.add(e);
        System.out.println(countPotions(isak));
        System.out.println(averageAttack(a,5));
        System.out.println(heavyArmor(stufffff)); 
    }

    public static double totalWeight(Item[] stuff)
    {
        double total=0;
        for(int i=0;i<stuff.length;i++)
        {
            total=total+stuff[i].getWeight();
        }
        return(total);
    }

    public static int attack(Weapon w,Armor a)
    {
        int damage=a.getAttacked(w.attackDamage());
        return(damage);
    }

    public static int countWeapons(Item[] stuff)
    {
        int count=0;
        for(int i=0;i<stuff.length;i++)
        {
            if(stuff[i] instanceof Weapon)
            {
                count++;
            }
        }
        return(count);
    }

    public static int countPotions(ArrayList<Item> stuff)
    {
        int count=0;
        for(Item i:stuff)
        {
            if(i.getName().indexOf("potion")!=-1)
            {
                count++;
            }
        }
        return(count);
    }

    public static double averageAttack(Weapon w,int reps)
    {
        if(reps==0)
        {
            System.out.println("You said zero reps! That ain't gonna work");
        }
        double total=0;
        for(int i=0;i<reps;i++)
        {
            total=total+w.attackDamage();
        }
        double avg=total/reps; 
        return(avg);
    }

    public static Item heavyArmor(Item[] stuff)
    {
        if(stuff==null)
        {
            return(null);
        }
        double max=0;
        int mark=0;
        for(int i=0;i<stuff.length;i++)
        {
            if(stuff[i].getWeight()>max)
            {
                max=stuff[i].getWeight();
                mark=i;
            }
        }
        return(stuff[mark]);
    }
}