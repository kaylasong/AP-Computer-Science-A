import java.util.*;
public class IfMiddleStart
{
   public static void main(String[]args)
   {
      //Set up
      Scanner sc=new Scanner(System.in);
      System.out.println("Please enter in a string.");
      String string= sc.nextLine();
      int count= string.length();
      int half= (int)(count/2);
      
      //Even
  		String even=string.substring(half-1,half+1);	
		int placea= string.indexOf(even);	
		if (count%2==0)
      {
         System.out.println("The middle of this word is "+even);
		   
		if (placea==0)
		{
			System.out.println("The middle also starts the String!");
		}
		else 
		{
			System.out.println("The middle does not start the String.");
		}
		}

		      
		//Odd
		String odd=string.substring(half,half+1);
		int placeb= string.indexOf(odd);
		
		if (count%2==1)
		{
		System.out.println("The middle of this word is "+ odd);
				   
		if (placeb==0)
		{
			System.out.println("The middle also starts the String!");
		}
		else 
		{
			System.out.println("The middle does not start the String.");
		}
		}
   }
}