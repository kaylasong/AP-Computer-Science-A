import java.util.*;
public class QuadraticFormula
{
	public static void main(String[] args)
	{
		//gather
		System.out.println("Your equation should follow the format ax2 + bx + c = 0.");
		System.out.println("What is the first coeffeicient (a) in your equation?");
		Scanner sc=new Scanner(System.in);
		double firstCoefficient=sc.nextDouble();
		double a=firstCoefficient;
		
		
		System.out.println("What is the second coeffeicient (b) in your equation?");
		double secondCoefficient=sc.nextDouble();
		double b=secondCoefficient;
		
		System.out.println("What is the third coefficient (c) in your equation?");
		double thirdCoefficient=sc.nextDouble();
		double c=thirdCoefficient;
		
		//this is where the coefficients go into the equation
      double Sqrt= Math.sqrt((b*b)-(4*a*c));
      
      double top= -b+Sqrt;
      double divide= top/(2*a);
		System.out.println(divide);
      
      double OtherTop= -b-Sqrt;
      double OtherDivide=OtherTop/(2*a);
      System.out.println(OtherDivide);
      
		
	}

}