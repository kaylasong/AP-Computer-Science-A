import java.util.*;
public class WhileNumber
{
   public static void main(String[]args)
   {
      //Prep
      Scanner sc=new Scanner(System.in);
      int random= (int)(1+100*Math.random());
      System.out.println("Guess the integer");
      int guess=sc.nextInt();
      
      //Incorrect
      int tries=1;
      while(guess!=random)
      {
         //Compare
         if(guess>random)
         {
            System.out.println("Your guess was too high. Try again!");
         }
         
         if(guess<random)
         {
            System.out.println("Your guess was too low. Try again!");
         }
         
         //Other stuff
         guess=sc.nextInt();
         tries=tries+1;
      }
      
      //Correct
      if(guess==random)
      {
         System.out.println("Correctamungo. That took you "+tries+" try/tries.");
      }
      
      
   }
}