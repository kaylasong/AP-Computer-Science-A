/*The three output statments printed the way they did because of the order they
were written.
The first statement is printed as such because the statement is read
from left to right. The string is first read, and the computer then thinks that the
8 and the 5 are part of the statement, thus printing 85. 
The second one is different because the numbers are placed in parentheses. The parentheses
indicate that integers are being added. 
The third one is also different because when the computer just sees the integers, it
assumes that it has to add two integers together, so it adds it together before getting
the String down. */

public class StringPlus
{ 
     public static void main (String[] args)
    {  
	 		//Borish's code
             System.out.println ("This is a long string that is the " +
                             "concatenation of two shorter strings.");
 
             System.out.println ("The first computer was invented about" + 60 +
                            "years ago.");
 

             //8 plus 5 is 85
				 System.out.println ("8 plus 5 is " + 8 + 5);
 
     			//8 plus 5 is 13    
				 System.out.println ("8 plus 5 is " + (8 + 5));
 
     			//13 8 equals 5        
				 System.out.println (8 + 5 + " equals 8 plus 5.");
				 
				 System.out.println(2+4+""+6+8);
				 
				 
		//My code
		int robins = 10;
		int canaries = 13;
		System.out.println(robins+" robins plus "+canaries+" canaries is "+
		(robins+canaries)+" birds.");
    }
} 