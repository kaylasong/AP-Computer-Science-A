import java.util.*;
public class Casters
{
	public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			//Gather
			System.out.println("Give me a number. It can have decimals.");
			double a=sc.nextDouble();
			
			System.out.println("Give me another number. It can also have decimals :).");
			double b=sc.nextDouble();
			
			//Product casted as an int
			double product=(int)(a*b);	
			System.out.println((int)product);
		
			//Divide by 5, cast as a double
			double divide=(double)(product/5);
			System.out.println((double)divide);
			
		}


}