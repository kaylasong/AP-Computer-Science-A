public class RecursionBasics
{
   public static void main(String[]args)   
   {
      System.out.println(sum1N(2));
   }
   
   public static int countX(String str)
   {
      //base case
      if(str.length()==0)
      {
         return(0);
      }  
      
      //other
      if(!str.substring(0,1).equals("x"))
      {
        return(0+countX(str.substring(1,str.length())));
      }
      else
         return(1+countX(str.substring(1,str.length())));
   }
   
   public static int factorial(int a)
   {
      //base case
      if(a==0)
         return 1;
      
      return(a*factorial(a-1));
   }
   
   public static int sumN(int a)
   {
      //base case
      if(a==0)
         return 0;
      
      //sum
      return(a+sumN(a-1));
   }
   
   public static double sum1N(int a)
   {
      //base case
      if(a==1)
      {
         return 1;
      }
      else
         return(((double)1/a)+sum1N(a-1));
   }
   
   public static int sumNalt(int a)
   {
      //base case
      if(a==0)
         return 0;
         
      //even
      if(a%2==0)
      {
         return(-a+sumNalt(a-1));
      }
      //odd
      else
      {
         return(a+sumNalt(a-1));
      }
      
   }
}