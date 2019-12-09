import java.util.*;
public class StringTypo
{
	public static void main(String[]args)
		{
			//Gather
			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter a string.");
			String thing=sc.nextLine();
			
			
			//Find number
			int count=thing.length();
			int number=(int)((count-1)*Math.random());
			
			
			//Substring and Print
			System.out.print("You printed: \"");
			System.out.print(thing.substring(0,number));
			System.out.print(thing.substring(number+1,count));
			System.out.println("\"");
					
		
		}
}