import java.util.*;
public class ForReplace
{
   public static void main(String[]args)
   {
      //Set up
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter in a string.");
      String thing=sc.nextLine();
      System.out.println("Enter a character that is in your string.");
      String firstthing=sc.nextLine();
      System.out.println("Enter another character.");
      String otherthing=sc.nextLine();
      
      //Replace
      String thingie=new String();
      for(int a=0 ; a<thing.length() ; a++)
      {
         String thingy=new String(thing.substring(a,a+1));
         if(thingy.equals(firstthing))
         {
            thingy=otherthing;
         }
         
         thingie=thingie+thingy;
      }  
      
      System.out.println(thingie);    
   }
}