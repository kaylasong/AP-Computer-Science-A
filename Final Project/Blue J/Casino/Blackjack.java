import java.util.*;
public class Blackjack
{
    public static int main(int wallet, int wager)
    {
        Scanner sc=new Scanner(System.in);
        //set up darn deck
        DeckOCardz deck=new DeckOCardz();
        deck.shuffle();
        int won=0;

        //set up darn hands
        ArrayList<Cardz> userhand=new ArrayList<Cardz>();
        ArrayList<Cardz> cpuhand=new ArrayList<Cardz>();

        //The Darn Loop

        //deal
        System.out.println("Here is your hand.");
        userhand.add(deck.pickCard());
        userhand.add(deck.pickCard());
        System.out.println(userhand);
        System.out.println();
        
        System.out.println("The value of your hand is "+checkValue(userhand));
        System.out.println("Would you like to double down? [yes/no]");
        String ddn=sc.nextLine();
        if(ddn.equals("yes"))
        {
            wager=wager*2;
        }

        //cpu hand
        cpuhand.add(new Cardz("diamonds",3));
        cpuhand.add(new Cardz("diamonds", 1));
        System.out.println("The CPU has been dealt 2 cards.");
        System.out.println("This is one of them :)");
        System.out.println(cpuhand.get(0));
        System.out.println();

        //THE CPU TURN-----------------------------------------------------------------
        //to hit or not to hit, that is the question
        System.out.println("The value of your hand is $"+checkValue(userhand));
        System.out.println("Would you like to hit or stay?");
        String choice=sc.nextLine();
        System.out.println();

        //they hit
        if(choice.equals("hit"))
        {
            while(true)
            {
                userhit(userhand,deck);
                if(checkLoss(userhand)==true)
                {
                    System.out.println(userhand);
                    System.out.println("You busted.");
                    return(wallet-wager);
                }
                System.out.println("Would you like to hit again? [yes/no]");
                String a=sc.nextLine();
                if(a.equals("no"))
                {
                    break;
                }
            }
        }
        //==========================================================================

        //USER'S TURN DONE CPU TURN NOW
        System.out.println("This is the cpu's full hand.");
        System.out.println(cpuhand);

        if(checkValue(cpuhand)<=16)
        {
            cpuhit(cpuhand, deck);
        }

        //CHECK WHO WINS
        if(checkValue(cpuhand)>21)
        {
            System.out.println("You win!");
            wallet=wallet+wager;
        }
        else if((21-checkValue(userhand))>(21-checkValue(cpuhand)))
        {
            System.out.println("You lose.");
            wallet=wallet-wager;
        }
        else if((21-checkValue(cpuhand))>(21-checkValue(userhand)))
        {
            System.out.println("You win!!");
            wallet=wallet+wager;
        }
        else
        {
            System.out.println("That's a tie.");
            System.out.println("There is no change to your wallet.");
        }
        return wallet;
    }

    public static boolean checkLoss(ArrayList<Cardz> userhand)
    {
        if(checkValue(userhand)>21)
        {
            System.out.println("You lose");
            return true;
        }
        else return false;
    }

    public static ArrayList<Cardz> userhit(ArrayList<Cardz> userhand, DeckOCardz deck)
    {
        userhand.add(deck.pickCard());
        System.out.println(userhand);
        System.out.println("The value of your hand is "+checkValue(userhand));
        return(userhand);
    }

    public static int checkValue(ArrayList<Cardz> hand)
    {
        int total=0;
        boolean ace=false;
        for(Cardz c: hand)
        {
            int num=c.getValue();
            if(num==13||num==12||num==11)
            {
                num=10;
            }
            else if(num==1)
            {
                num=1;
                ace=true;
            }
            total=total+num;
        }
        if((total+10<=21) && ace==true)
        {
            total=total+10;
        }
        return total;
    }

    public static boolean bust(int total)
    {
        if(total>21)
        {
            return true;
        }
        else return false;
    }

    public static boolean ace(ArrayList<Cardz> hand)
    {
        for(Cardz c: hand)
        {
            if(c.getValue()==1)
            {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Cardz> cpuhit(ArrayList<Cardz> hand, DeckOCardz deck)
    {
        int num=0;
        if(ace(hand)==true)
        {
            num=1;
        }
        while(checkValue(hand)<=17+num)
        {
            hand.add(deck.pickCard());
            if(bust(checkValue(hand))==true)
            {
                System.out.println("The cpu tried to hit, but he done messed up.");
                System.out.println("His hand is "+hand+", and the value is "+checkValue(hand));
                hand.add(new Cardz("",900));
                return(hand);
            }       
        }
        System.out.println("The cpu hit, and the new value of the cpu's hand value is "+checkValue(hand));
        System.out.println(hand);
        return(hand);
    }
}
