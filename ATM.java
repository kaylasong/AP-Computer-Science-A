import java.util.*;
public class ATM
{
	public static void main(String[] args)
	{
		System.out.println("How old are you?");
		Scanner sc =new Scanner (System.in);
		int age=sc.nextInt ();
		int a=age;
		
		System.out.println("How much money do you have in your bank account?");
		double moneyInBank=sc.nextDouble();
		double b=moneyInBank;
		
		System.out.println("How much money do you want?");
		double howMuch=sc.nextDouble();
		double c=howMuch;
		
		double d= (moneyInBank - howMuch)-2;
		System.out.println("Take your money, you "+a+" year-old, absolute bagel. Now you only have $"+d+" in the bank.");
		
	
	
	}


}