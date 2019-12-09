import java.util.*;
public class ForMaxMin
{
   public static void main(String[]args)
   {
      //Prep
      Scanner sc=new Scanner(System.in);
      System.out.println("How many numbers would you like to enter?");
      int a=sc.nextInt();
      System.out.println("Please enter them in now.");
      int b=sc.nextInt();
      int c=b;
      int d=b;
      
      
      
      //Gathering
      for(int e=1 ; e<a ; e++)
      {
         int f=sc.nextInt();
         
         if(f<c)
         {
            c=f;
         }
         if(f>d)
         {
            d=f;
         }
      }  
      
      System.out.println("The max is "+d+", and the min is "+c+".");
      
       
   }
}