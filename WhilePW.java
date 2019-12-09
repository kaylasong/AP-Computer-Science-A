import java.util.*;
public class WhilePW
{
   public static void main(String[]args)
   {
      //Prep
      Scanner sc=new Scanner(System.in);
      final String password = new String("iLoveBakedGoods");
      System.out.println("Please enter the password. It is case sensitive.");
      String attempt = sc.nextLine();
      
      //Correct
      if (attempt.equals(password))
      {
         System.out.println("Congratulations! You deserve a baked good.");
      
      }
      
      //Incorrect
      int tries= 2;
      while(!attempt.equals(password) && tries>0)
      {
         System.out.println("You now have "+tries+" attempts left.");
         tries=tries-1;
         System.out.println("Try again");
         attempt = sc.nextLine();     
      }
      
      if (tries==0)
      {
         System.out.println("You have failed. You bring dishonor on your family.");
      }
      
      
      
      
   }
}