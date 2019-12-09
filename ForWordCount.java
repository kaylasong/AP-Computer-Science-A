import java.util.*;
public  class ForWordCount
{
   public static void main(String[]args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Please enter in a sentence.");
      String a=sc.nextLine();
      
      int words=1;
      int tf=0;
      
      for(int b=0 ; b<a.length(); b++)
      {
         String sample=new String(a.substring(b,b+1));
         if(sample.equals(" ") && tf==0)
         {
            words=words+1;
            tf=1;
         }
         
         if(!sample.equals(" "))
         {
            tf=0;
         }
      }
      
      System.out.println("Your sentence has "+words+" words in it.");
   }  
}