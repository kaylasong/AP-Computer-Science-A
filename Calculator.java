import java.util.*;
public class Calculator
{
   public static void main(String[]args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Which method would you like to use?");
      String thing=sc.nextLine();
      
      if(thing.equals("sum"))
      {
         System.out.println("Please enter in two numbers");
         double first=sc.nextInt();
         double second=sc.nextInt();
         System.out.println(sum(first, second));
      }
      
      if(thing.equals("quotientDouble"))
      {
         System.out.println("Please enter in two integers");
         int first=sc.nextInt();
         int second=sc.nextInt();
         System.out.println(quotientDouble(first,second));
      }
      
      if(thing.equals("cube"))
      {
         System.out.println("Please enter in an integer");
         int a=sc.nextInt();
         System.out.println(cube(a));
      }
      
      if(thing.equals("distance"))
      {
         System.out.println("Please enter in x1");
         double x1=sc.nextDouble();
         System.out.println("Please enter in y1");
         double y1=sc.nextDouble();
         System.out.println("Please enter in x2");
         double x2=sc.nextDouble();
         System.out.println("Please enter in y2");
         double y2=sc.nextDouble();
         System.out.println(distance(x1,y1,x2,y2));
      }
      
      if(thing.equals("nRoot"))
      {
         System.out.println("What number would you like to find the root of?");
         double x=sc.nextDouble();
         System.out.println("What is the root you would like to find?");
         int n=sc.nextInt();
         System.out.println(nRoot(x,n));
      }
      
      if(thing.equals("abs"))
      {
         System.out.println("Please enter in a number");
         double x=sc.nextDouble();
         System.out.println(abs(x));
      }
      
      if(thing.equals("absDifference"))
      {
         System.out.println("Please enter in two numbers");
         double a=sc.nextDouble();
         double b=sc.nextDouble();
         System.out.println(absDifference(a,b));
      }
      
      if(thing.equals("factorial"))
      {
         System.out.println("Please enter in a number");
         int num=sc.nextInt();
         System.out.println(factorial(num));
      }
      
      if(thing.equals("isAwesome"))
      {
         System.out.println("How many times would you like to print the message?");
         int times=sc.nextInt();
       
      }
      
      if(thing.equals("max"))
      {
         System.out.println("Please enter in two numbers");
         int a=sc.nextInt();
         int b=sc.nextInt();
         System.out.println(max(a,b));
      }
      
      if(thing.equals("min"))
      {
         System.out.println("Please enter in two numbers.");
         int a=sc.nextInt();
         int b=sc.nextInt();
         System.out.println(min(a,b));
      }
      
      if(thing.equals("average"))
      {
         System.out.println("Please enter in two numbers.");
         double a=sc.nextDouble();
         double b=sc.nextDouble();
         System.out.println(average(a,b));
      }
      
      if(thing.equals("oddOrEven"))
      {
         System.out.println("Please enter in a number.");
         int a=sc.nextInt();
         System.out.println(oddOrEven(a));
      }
      
      if(thing.equals("isMult10"))
      {
         System.out.println("Please enter in a number.");
         int a=sc.nextInt();
         System.out.println(isMult10(a));
      }
   }  
   
   public static double sum(double a, double b)
   {
      return(a+b);
   }
   
   public static double quotientDouble(int a, int b)
   {
      return((double)a/b);
   }
   
   public static int cube(int a)
   {
      return((int)Math.pow(a,3));
   }
   
   public static double distance(double x1, double y1, double x2, double y2)
   {
      double x=Math.pow(x2-x1,2);
      double y=Math.pow(y2-y1,2);
      double sqrt=Math.sqrt(x+y);
      return(sqrt);
   }
   
   public static double nRoot(double x, int n)
   {
      return(Math.pow(x,1/(double)n));
   }
   
   public static double abs(double x)
   {
      return(Math.abs(x));
   }
   
   public static double absDifference(double a,double b)
   {
      return(Math.abs(a-b));
   }
   
   public static int factorial(int x)
   {
      int a=x;
      for(int i=x-1 ; i>=1 ; i--)
      {
         a=a*i;
      }
      return(a);
   }
   
   public static void isAwesome(int x)
   {
      if(x>0)
      {
         for(int i=0 ; i<x ; i++)
         {
            System.out.println("computer science is awesome!");
         }
      }
      else
      System.out.println("You stink.");
   }
   
   public static int max(int a, int b)
   {
      if(a>b)
      {
         return(a);
      }
      else
      return(b);
   }
   
   public static int min(int a, int b)
   {
      if(a<b)
      {
         return(a);
      }
      else
      return(b);
   }
   
   public static double average(double a, double b)
   {
      return((a+b)/2);
   }
   
   public static String oddOrEven(int a)
   {
      if(a%2==0)
      {
          return("even");      
      }
      else 
         return("odd");
   }
   
   public static boolean isMult10(int a)
   {
      if(a%10==0)
      {
         return(true);
      }
      else
         return(false);
   }
}