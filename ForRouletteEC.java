/* for this ec, I made sure no one could enter in a negative bet (cuz it's 
wack), and I made the casino corrupt because this world is corrupt. 
#keepingitreal */

import java.util.*;
public class ForRouletteEC
{
   public static void main(String[]args)
   {
      Scanner sc=new Scanner(System.in);
      int trfa=0;
		System.out.println("Welcome to Kayla's Kasino.");
      System.out.println("You have $100.");
      int moolah=100;
		int win=0;
		int loss=0;
		int played=0;

		

      //Screw the for loops. 
      while(trfa==0)
      {
         int random=(int)(36*Math.random());
         
         System.out.println("Odd or even?");
         String guess=sc.nextLine();
         System.out.println("How much would you like to bet?");
         int bet=sc.nextInt();
			sc.nextLine();
			int corrupt=1;
			
			//Let the corruption begin
			
			if(played>4 && win>loss)//maximize the profits
			{
				System.out.println("LUCKY YOU!");
				System.out.println("You'be played "+played+" games, and you've won "+
				win+" games and lost "+loss+" games.");
				System.out.println("You've won more than you've lost! Would you like to "+
				"bet all your money?");
				String yn=sc.nextLine();
				
				if(yn.equals("yes"))
				{
					random=0;
					bet=moolah;
					corrupt=0;
				}				
			}
			
			//Instant death
			if(corrupt==0)
			{
				int ran=(int)(36*Math.random());
				System.out.println("The number was "+ran+". You lose.");
				System.out.println("You now owe me $"+bet+". Woe is you.");
				break;			
			}
     
	  
	      else if(random==0)
         {
            System.out.println("The number was 0. You lose."); 
            break;
         }
			
			
			//Sly Dog
			if (bet<0)
			{
				System.out.println("You sly dog. That's wack. Not in my casino. You lose, and I demand $1000.");
				System.out.println("You have been kicked out of Kayla's Kasino.");
				break; 
			}
			
			        
         //Odd Correct
         if((random%2==1) && guess.equals("odd"))
         {
            System.out.println("The number was "+random+". You win!");
            moolah=moolah+bet;
				win=win+1;
            System.out.println("You now have $"+moolah+". Would you like to bet again?");
            String yn=sc.nextLine();
            if(yn.equals("no"))
            {
               trfa=1;
            }
            
         }
         
         //Odd Incorrect
         else if((random%2==1) && guess.equals("even"))
         {
            System.out.println("The number was "+random+". You lose.");
            moolah=moolah-bet;
				loss=loss+1;
            System.out.println("You now have $"+moolah+". Would you like to bet again?");
            String yn=sc.nextLine();
            if(yn.equals("no"))
            {
               trfa=1;
            }
            
         }
         
         //Even correct
         else if((random%2==0) && guess.equals("even"))
         {
            System.out.println("The number was "+random+". You win!");
            moolah=moolah+bet;
				win=win+1;
            System.out.println("You now have $"+moolah+". Would you like to bet again?");
            String yn=sc.nextLine();
            if(yn.equals("no"))
            {
               trfa=1;
            }
            
         }
			
			//Even incorrect
         else if((random%2==0) && guess.equals("odd"))
         {
            System.out.println("The number was "+random+". You lose.");
            moolah=moolah-bet;
				loss=loss+1;
            System.out.println("You now have $"+moolah+". Would you like to bet again?");
            String yn=sc.nextLine();
            if(yn.equals("no"))
            {
               trfa=1;
            }
            
         }
						
		played=played+1;
		

      }
    if(trfa==1)
	 {
    		System.out.println("You left the casino with "+moolah+" bucks. Thanks for playing!");
	 }
	 
      
      
   }
}