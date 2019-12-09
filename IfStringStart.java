import java.util.*;
public class IfStringStart
{
	public static void main(String[]args)
	{
		//Gather
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter in a string.");
		String thing= sc.nextLine();
		System.out.println("Please enter in a string that is contained in the first.");
		String flag= sc.nextLine();
		
		//Find lengths
		int count= thing.length();
		int spot = thing.indexOf(flag);
		
      
		if (spot >= 0)
      {
		   System.out.println(thing.substring(spot,count));
      }
      
		
      if (spot==-1)
      {
         System.out.println("You chump. That string isn't contained in the first.");
      }
	
	
	}

}
