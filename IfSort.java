import java.util.*;
public class IfSort
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter in three doubles.");
		double a= sc.nextDouble();
		double b= sc.nextDouble();
		double c= sc.nextDouble();
		
      //Long stuff 
		if (a>b&&b>c)
			{
				System.out.println("The max is "+ a+", and the min is "+ c+".");
			}
		
		
		if (b>c&&c>a)
			{
				System.out.println("The max is "+ b+", and the min is "+ a+".");
			}
		
		
		if (c>a&&a>b)
			{
				System.out.println("The max is "+ c+", and the min is "+ b+".");
			
			}
		
		
		if (a<b&&b<c)
			{
				System.out.println("The max is "+ c+", and the min is "+ a+".");
			}
		
		
		if (b<c&&c<a)
			{
				System.out.println("The max is "+ a+", and the min is "+ b+".");
			}
		
		
		if (c<a&&a<b)
			{
				System.out.println("The max is "+ b+", and the min is "+ c+".");
			
			}
      
      
      //one equals the other
		if(c==a || c==b || b==a)
      {
         if (a>b)
         {
            System.out.println("The max is "+ a+", and the min is "+ b+".");
         }
         else if (b>a)
         {
            System.out.println("The max is "+ b+", and the min is "+ a+".");
         }
         else if (a>c)
         {
            System.out.println("The max is "+ a+", and the min is "+ c+".");
         }
      }
      
      //all equal
      if (a==c && c==b)
      {
         System.out.println("Screw you, chump.");
      }
		
	}
}