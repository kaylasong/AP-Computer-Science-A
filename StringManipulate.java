public class StringManipulate 
{
   public static void main(String[]args)
   {
   
   }
   
   public static String concat(String a, String b)
   {
      String c=new String(a+b);
      return(c);
      
   }
   
   public static void printX(String a, int b)
   {
      for(int i=0;i<b;i++)
      {
         System.out.println(a);
      }
   }
   
   public static String makePlural(String a)
   {
      String end=new String(a.substring(a.length()-1,a.length()));
      if(end.equals("s"))
      {
         a=a+"es";
         return(a);
      }
      else
      {
         a=a+"s";
         return(a);
      }
   }
   
   public static String reverse(String a)
   {
      String e=new String(a);
      String b=new String("");
      int c=e.length()-1;
      
      for(int i=c;i>=0;i--)
      {
         String d=new String(e.substring(i,i+1));
         b=b+d;
      }
      return(b);
   }
   
   public static int countLetter(String a, String b)
   {
      int count=0;
      for(int i=0;i<a.length();i++)
      {
         String letter=new String(a.substring(i,i+1));
         if(letter.equals(b))
         {
            count++;
         }
      }     
      return(count);
   }
   
   
   public static int countSpaces(String a)
	{
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			String part=new String(a.substring(i,i+1));
			if(part.equals(" "))
			{
				count=count+1;
			}
		}
		return(count);
	}
	
   public static boolean firstLetterEqual(String a, String b)
   {
      if(a.substring(0,1).equals(b.substring(0,1)))
      {
         return true;
      }
      else
      return false;      
   }
   
	public static boolean caseEquals(String a, String b)
	{
		a=a.toLowerCase();
		b=b.toLowerCase();
		
		if(a.equals(b))
		{
			return(true);
		}
		else
		return(false);
	}
	
	public static boolean comesBefore(String a, String b)
	{
		if(a.compareTo(b)<0)
		{
			return(true);
		}
		else
			return(false);
	}
   
}