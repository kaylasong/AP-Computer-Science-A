import java.util.*;
public class ForRoulette
{
   public static void main(String[]args)
   {
      Scanner sc=new Scanner(System.in);
      int trfa=0;
      System.out.println("You have $100.");
      int moolah=100;
      
      //Screw the for loops. 
      while(trfa==0)
      {
         int random=(int)(36*Math.random());
         
         //Instant death
         if(random==0)
         {
            System.out.println("The number was 0. You lose.");
            break;
         }
         
         System.out.println("Odd or even?");
         String guess=sc.nextLine();
         System.out.println("How much would you like to bet?");
         int bet=sc.nextInt();
         
         //Odd Correct
         if((random%2==1) && guess.equals("odd"));
         {
            System.out.println("The number was "+random+". You win!");
            moolah=moolah+bet;
            System.out.println("You now have $"+moolah+". Would you like to bet again?");
            String throwaway=sc.nextLine();
            String yn=sc.nextLine();
            if(yn.equals("no"))
            {
               break;
            }
            
         }
         
         //Odd Incorrect
         if((random%2==1) && guess.equals("even"));
         {
            System.out.println("The number was "+random+". You lose.");
            moolah=moolah-bet;
            System.out.println("You now have $"+moolah+". Would you like to bet again?");
            String throwaway=sc.nextLine();
            String yn=sc.nextLine();
            if(yn.equals("no"))
            {
               break;
            }
            
         }
         
         //Even correct
         if((random%2==0) && guess.equals("even"));
         {
            System.out.println("The number was "+random+". You win!");
            moolah=moolah+bet;
            System.out.println("You now have $"+moolah+". Would you like to bet again?");
            String throwaway=sc.nextLine();
            String yn=sc.nextLine();
            if(yn.equals("no"))
            {
               break;
            }
            
         }

         if((random%2==1) && guess.equals("odd"));
         {
            System.out.println("The number was "+random+". You lose.");
            moolah=moolah-bet;
            System.out.println("You now have $"+moolah+". Would you like to bet again?");
            String throwaway=sc.nextLine();
            String yn=sc.nextLine();
            if(yn.equals("no"))
            {
               break;
            }
            
         }

      }
    
    System.out.println("You left the casino with "+moolah+" bucks. Thanks for playing!");
      
      
   }
}