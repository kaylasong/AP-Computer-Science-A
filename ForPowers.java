import java.util.*;
public class ForPowers
{
   public static void main(String[]args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Type in a postitive integer.");
      int a=sc.nextInt();
      
      for (int i=1 ; i<=a ; i++)
      {
         for(int j=1 ; j<=a ; j++)
         {
            System.out.print((int)Math.pow(j,i)+"  ");
         }
         System.out.println();
      }
   }
}