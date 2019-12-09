import java.util.*;
public class ForSum
{
   public static void main(String[]args)
   {
      //Prep
      Scanner sc=new Scanner(System.in);
      System.out.println("Please enter in a non-negative integer");
      int a=sc.nextInt();
      
      if(a<0)
      {
         System.out.println("You disrespectful bagel. Enter in a non-negative integer.");
         a=sc.nextInt();
      }
      
      //Add
      int c=0;
      for(int b=1 ; b<=a ; b++)
      {
         c=c+b;
      }
      System.out.println(c);
   }
}