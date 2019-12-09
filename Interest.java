import java.util.*;
public class Interest
{
	public static void main(String[]args)
	{
		//Get the info
		Scanner sc=new Scanner(System.in);
		System.out.println("How much money are you starting with?");
		double initial=sc.nextDouble();		
		
		System.out.println("What is the interest rate?");
		double theirInterest=sc.nextDouble();
		double interest=(theirInterest/100)+1;
		
		System.out.println("How long are you going to keep the money in the bank?");
		double time=sc.nextDouble();
		
		//Calculate
		double end=initial*Math.pow(interest,time);
		
		//Done
		System.out.println("After "+time+" years, you will have $"+end+" in the bank");
	
	}


}


