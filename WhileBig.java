import java.util.*;
public class WhileBig
{
   public static void main(String[]args)
   {
      //Prep
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter an int. If you want to find the average, enter 0.");
      int thing=sc.nextInt();
      double sum=0;
      int count=0;
      
      //Rad loop
      while(thing!=0)
      {
         //Build up
         sum=sum+thing;
         System.out.println("Enter in another int.");
         thing=sc.nextInt();
      
         //Counting
         count=count+1;      
      }
      
      if(thing==0)
      {
         System.out.println("You entered "+count+" numbers. The sum is "+sum+
         ", and the average is "+(sum/count)); 
      }    
   }
}