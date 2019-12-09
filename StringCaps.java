import java.util.*;
public class StringCaps
{
	public static void main(String[]args)
	{
		//Gather
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter in a string that is at least 5 characters");
		String thing= sc.nextLine();
		int a= thing.length();
		
		//Caps
		String beginning= new String(thing.substring(0,5));
		beginning= beginning.toUpperCase();
		
		//Lower
		String end=new String(thing.substring(5,a));
		end=end.toLowerCase();		
		
		//Print
		System.out.println(beginning+end);
	
	
	}

}