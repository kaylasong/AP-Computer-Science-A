import java.util.*;
public class IfLazyDays
{
   public static void main(String[]args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Please enter in the temperature in Fahrenheit.");
      int temp=sc.nextInt();
      
      if (temp<60)
      {
         System.out.println("You should definitely stay inside. Go to the library,");
         System.out.println("the cafeterias for hot chocolate, and perhaps the sauna. Visit our shops!");
      }
      
      else if (temp<70)
      {
         System.out.println("This is good weather for active outdoor activities! Try");
         System.out.println("playing tennis, golf, or frisbee golf. Or perhaps enjoy a nice walk.");
      }
      
      else if (temp<80)
      {
         System.out.println("This is fantastic weather to enjoy a nice meal outdoors.");
         System.out.println("Visit one of our many many cafeterias and demand an outdoor table.");
      }
      
      else if (temp<95)
      {
         System.out.println("Since it's rather warm, you may want to go swimming or boating.");
         System.out.println("Or perhaps take a trip to our artificial snow ski slopes!");
      }
      else if (temp>95)
      {
         System.out.println("Stay inside and enjoy the expensive air conditioning that our");
         System.out.println("resort provides. There are some fire TV programs provided here.");
         System.out.println("Also, visit our shops!"); 
      }
      
      
   }
}