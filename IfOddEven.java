import java.util.*;
public class IfOddEven 
{
   public static void main(String[]args)
   {
      //Gather
      Scanner sc= new Scanner(System.in);
      System.out.println("Please enter in an integer.");
      int a=sc.nextInt();
      
      if(a%2==1)
      {
         System.out.println("Your integer is an odd number.");
      }
      
      if(a%2==0)
      {
         System.out.println("Your integer is an even number.");
      }
   }
}