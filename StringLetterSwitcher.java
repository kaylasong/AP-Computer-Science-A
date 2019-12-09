import java.util.*;
public class StringLetterSwitcher
{
	public static void main(String[]args)
	{
		//Gather
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a sentence.");
		String sentence=sc.nextLine();
		System.out.println("Please enter a letter or a character that is found in your sentence.");
		String char1= sc.nextLine();
		System.out.println("Please enter another letter or character that is found in your sentence.");
		String char2=sc.nextLine();
		
		//Meanwhile
		sentence=sentence.replace(char1,"5");
		sentence=sentence.replace(char2,"#");
		
		//Replace
		sentence=sentence.replace("5",char2);
		sentence=sentence.replace("#",char1);
		
		//Print
		System.out.println(sentence);
				
		
	
	}
}