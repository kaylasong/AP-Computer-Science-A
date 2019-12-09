import java.util.*;
public class Fight
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        //Get the name for the other guy
        System.out.println("What's your name?");
        String nm=sc.nextLine();
        //Create the characters and set it all up
        Character user=new Character(nm);
        Character cpu=new Character();
        int count=1;
        //Print out both statuses first
        status(user);
        System.out.println();
        status(cpu);
        System.out.println();

        while(true)
        {
            //Player's move
            System.out.println("Your turn :8)!");
            if(ifSpecial(count, cpu, user)==false)
            {
                System.out.println("Would you like to \"attack\", cast a \"heal spell\","+ 
                    "or cast a \"fireball\"?");           
                System.out.println("You do a(n)"+playerMove(user,cpu)+"!");
            }
            //Display effects
            status(user);
            System.out.println();
            status(cpu);
            //Check ded
            if(cpu.isDead()==true)
            {
                System.out.println("You won!");
                break;
            }
            System.out.println();
            System.out.println("These are your results. Pleez press Enter to proceed");
            sc.nextLine();
            System.out.println("My turn :8)");
            System.out.println("I attack!");
            cpu.attack(user);
            if(user.isDead()==true)
            {
                System.out.println("You lose");
                break;
            }
            //Print out both statuses
            status(user);
            System.out.println();
            status(cpu);
            System.out.println();
            System.out.println("These are the results. Pleez press Enter to proceed");
            sc.nextLine();
            //A boooost
            System.out.println("A boost!");
            user.aBoost();
            cpu.heal(5);
            //Status
            status(user);
            System.out.println();
            status(cpu);
            System.out.println();
            //count
            count++;
        }
    }

    public static void status(Character guy)
    {
        System.out.println("Name: "+guy.getName());
        System.out.println("Health: "+guy.getHealth());
        System.out.println("Mana: "+guy.getMana());
    }

    public static String playerMove(Character user, Character cpu)
    {
        Scanner sc=new Scanner(System.in);
        int a=cpu.getHealth();
        int b=user.getMana();
        String choice=sc.nextLine();
        while(true)
        {
            if(choice.equals("attack"))
            {
                user.attack(cpu);
                if(a!=cpu.getHealth())
                {
                    break;
                }
            }
            if(choice.equals("heal spell"))
            {
                user.healSpell();
                if(b!=user.getMana())
                {
                    break;
                }
            }
            if(choice.equals("fireball"))
            {
                user.fireball(cpu);
                if(b!=user.getMana())
                {
                    break;
                }
            }
            System.out.println("Please pick another move.");
            choice=sc.nextLine();
        }
        return choice;
    }

    public static boolean ifSpecial(int count, Character cpu, Character user)
    {
        Scanner sc=new Scanner(System.in);
        boolean didRun=false;
        if(count==3)
        {
            System.out.println("Thievish Third Turn!");
            System.out.println("Would you like to spend 5 mana to steal 10 health from the "+
                "enemy? (yes/no)");
            System.out.println("(When you do a special move, you are not allowed to do your"+
            "regular move for that turn)");
            String answer=sc.nextLine();
            if(answer.equals("yes"))
            {
                user.third(cpu);
                didRun=true;
            }
        }
        if(count==5)
        {
            System.out.println("Fatal Flask Fifth Turn!");
            System.out.println("Would you like to hit the enemy with a Hydroflask for 3 mana? (yes/no)");
            String answer=sc.nextLine();
            if(answer.equals("yes"))
            {
                cpu.takeDamage(30);
                user.useMana(3);
                didRun=true;
                System.out.println("The Hydroflask was discarded.");
            }
        }
        if(count==10)
        {
            System.out.println("Tedious Tariff Tenth Turn");
            System.out.println("Sorry, but you get 5 damage for importing this game.");
            user.takeDamage(5);
            didRun=true;
        }
        return didRun;
    }
}
