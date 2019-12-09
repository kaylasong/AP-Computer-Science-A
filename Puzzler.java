public class Puzzler
{
   public static void main(String[]args)
   {
      System.out.println(countAlike("happy","damp"));
      
   }
   
   public static String firstHalf(String a)
   {
      int labels=a.length()-1;
      int count=a.length();
      if(count%2==0)
      {
         return(a.substring(0,a.length()/2));
      }
      else
      {
         return(a.substring(0,(count/2)+1));
      }
   }
   
   public static boolean firstTwo(String a, String b)
   {
      if(a.length()<2 || b.length()<2)
      {
         return(false);
      }
      
      if(a.equals(b))
      {
         return(true);
      }
      else 
      return(false);
   }
   
   public static int caughtSpeeding(int speed, boolean bday)
   {
      if(speed>=61 && speed<=80 && bday==false)
      {
         return(300);
      }
      
      else if(speed>=61 && speed<=80 && bday==true)
      {
         return(0);
      }
      
      else if(speed>80 && bday==false)
      {
         return(1000);
      }
      else if(speed>80 && bday==true)
      {
         return(300);
      }
      else
      return(0);
   }
   
   public static int countAlike(String a, String b)
  {
      int count=0;   
      for(int i=0;i<a.length() && i<b.length();i++)
      {
         if(a.substring(i,i+1).equals(b.substring(i,i+1)))
         {
            count++;
         }
      }
      return count;
   }
}