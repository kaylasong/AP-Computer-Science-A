import java.util.*;
public class RandomNumbers
{
	public static void main(String[]args)
	{
		//Gather
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter in an integer.");
		int a=sc.nextInt();
		
		System.out.println("Enter in another integer that is bigger than the one you just entered.");
		int b=sc.nextInt();
		
		//Print
		System.out.println((int)(a + (b-a+1)*Math.random()));
			
	}
}