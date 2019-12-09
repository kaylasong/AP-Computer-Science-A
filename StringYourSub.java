import java.util.*;
public class StringYourSub
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		//String
		System.out.println("Please enter a string");
		String a=sc.nextLine();
		System.out.println(a.length());
		int length=a.length();
		
		//Integer
		System.out.println("Please enter an integer from 1 to "+length);
		int b=sc.nextInt();
		System.out.println("Please enter another integer from 1 to "+length);
		int c=sc.nextInt();
		
		//Print
		System.out.println("The part of the string between "+b+
		" and "+c+" is: "+ a.substring(b,c));
			
		//Stupid lil bro
		System.out.println("For the lil bro, the part of the string between "+b+
		" and "+c+" is: "+a.substring(b-1,c-1));
	
	
	
	
	
	}
}