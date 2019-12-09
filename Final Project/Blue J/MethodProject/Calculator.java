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
      
      if (thing.equals(
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
}