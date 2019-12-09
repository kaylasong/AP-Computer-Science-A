import java.util.*;
public class Casino
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        //Front door
        System.out.println("Welcome to Kayla's Kasino!");
        System.out.println("Here is $100");
        int wallet=100;

        while(true)
        {
            System.out.println("What game would you like to play?");
            System.out.println("[blackjack] or [poker]?");
            String game=sc.nextLine();
            if(game.equals("blackjack"))
            {
                wallet= Blackjack(wallet);
                System.out.println("You have left Blackjack. You have $"+wallet+" in your wallet.");
            }

            if(game.equals("poker"))
            {
                wallet=Poker(wallet);
                System.out.println("(Poker? I barely know her!)");
                System.out.println("You have left Poker. You have $"+wallet+" in your wallet.");
            }
            
            System.out.println("You have $"+wallet+" in your wallet. Would you like to play another game? [yes/no]");
            String decision=sc.nextLine();
            if(decision.equals("no"))
            {
                if(wallet<0)
                {
                    System.out.println("But hold on a minute there, fren. You owe us $"+(0-wallet)+".");
                    System.out.println("In order to pay off your debt, you must clean up our casino!");
                    int debt=0-wallet;
                    for(int i=0;i<debt;i++)
                    {
                        
                    }
                }
                break;
            }
        }
        System.out.println("Thank you for visiting Kayla's Kasino. Have a nice day!");
    }

    public static int  Blackjack(int wallet)
    {
        //front door
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Bendy Blackjack!");
        while (true)
        {
            System.out.println("How much would you like to bet?");
            int wager=sc.nextInt();
            sc.nextLine();

            wallet=Blackjack.main(wallet, wager);
            System.out.println();
            System.out.println("The value of your wallet is "+wallet);
            System.out.println("Would you like to play again? (yes/no)");

            String choice=sc.nextLine();
            if(choice.equals("no"))
            {
                break;
            }
        }
        return wallet;
    }

    public static int Poker(int wallet)
    {
        //front door
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Prestigious Poker");
        while(true)
        {
            System.out.println("How much would you like to bet?");
            int wager=sc.nextInt();
            sc.nextLine();

            wallet=Poker.main(wallet,wager);
            System.out.println();
            System.out.println("The value of your wallet is "+wallet);
            System.out.println("Would you like to play again? (yes/no)");

            String choice=sc.nextLine();
            if(choice.equals("no"))
            {
                break;
            }
        }
        return wallet;
    }
}
