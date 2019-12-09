public class RecursionFun
{
   public static void main(String[]args)
   {
      System.out.println(endX("x helloxxgoodbyexx"));
   }
   
   public static int count7(int n)
   {
      //base case
      if(n==0)
      {
         return 0;
      }
      
      //stuff
      if(n%10==7)
      {
         return(1+count7(n/10));
      }
      else 
         return(0+count7(n/10));      
   }
   
   public static int powerN(int base, int n)
   {
      //base case
      if(n==0)
      {
         return 1;
      }
      //
      return(base*powerN(base, n-1)); 
   }
   
   public static int strCount(String str, String sub)
   {
      //base case
      if(str.length()==0)
         return 0;
      
      if(str.indexOf(sub)!=-1)
      {
         return(1+strCount(str.substring(str.indexOf(sub)+1,str.length()),sub));
      }
      else
         return 0;
   }
   
   public static boolean power2(int a)
   {
      //isn't
      if(a%2!=0)
      {
         return false;
      }
      
      //is
      if(a==2)
      {
         return true;
      }
      
      //meanwhile
      return(power2(a/2));
   }
   
   public static int fibonacci(int n)
   {
      if(n==0)
      {
         return 0;
      }
      
      if(n==1)
      {
         return 1;
      }
      
      else
         return(fibonacci(n-1)+fibonacci(n-2));
   }
   
   public static double gcf(int a, int b)
   {
      if(a<b)
      {
         return(gcf(a,b-a));
      }
      
      else if(b<a)
      {
         return(gcf(a-b,b));
      }
      
      else
         return a;
   }
   
   public static String endX(String a)
   {
      int find=a.indexOf("x");
      if(find!=-1)
      {
         if(find==a.length()-1)
         {
            return(a);
         }
         
         a=a.substring(0,find)+a.substring(find+1,a.length());
         return(endX(a)+"x");
      }
      
      if(find==-1)
      {
         return(a);
      }
      
      if(a.length()==0)
         return(a);  
         
      return("jellybean");   
   }
}