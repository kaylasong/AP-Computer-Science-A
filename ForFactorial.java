import java.util.*;
public class ForFactorial
{
   public static void main(String[]args)
   {
      //Gather
      Scanner sc=new Scanner(System.in);
      System.out.println("Please enter in a non-negative integer");
      int a=sc.nextInt();
      
      if(a<0)
      {
         System.out.println("You disrespectful bagel. Enter in a non-negative integer.");
         a=sc.nextInt();
      }
      
      //Factorial
      int c=1;
      if(a!=0)
      {
          for(int b=1 ; b<=a ; b++)
          {            
                c=c*b;
          }
          
      System.out.println(c);
      }
      
      else
      System.out.println(c);
      
   }
}