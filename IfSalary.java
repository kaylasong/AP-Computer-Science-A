import java.util.*;
public class IfSalary
{
   public static void main(String[]args)
   {
      //Gather
      Scanner sc=new Scanner(System.in);
      System.out.println("Please enter in your hourly wage");
      double wage=sc.nextDouble();
      System.out.println("Please enter in the numbers of hours you've worked.");
      double hours=sc.nextDouble();
      
      if (hours<40)
      {
         double paycheck1= wage*hours;
         System.out.println("Your paycheck will be $"+ paycheck1);
      }
      
      else if (hours<60)
      {
         double paycheck2= wage*40 + (hours-40)*1.5*wage;
         System.out.println("Your paycheck will be $"+ paycheck2);
      }
      
      else if (hours>60)
      {
         double paycheck3= wage*40 + wage*1.5*20 + (hours-60)*wage*2;
         System.out.println("Your paycheck will be $"+ paycheck3);
      }
      
   }

}