public class Nullity
{
    public static void main() 
    {
        String a=null;
        System.out.println(nLength(a));
        a=new String("hello");
        System.out.println(a);
        System.out.println(nLength(a));
        
        String b=null;
        System.out.println(shortest(b,a));
        b=new String("helloo");
        System.out.println(shortest(b,a));
        b="hello";
        System.out.println(shortest(b,a));
        
        String c=null;
        String d=null;
        System.out.println(eitherEquals(c,d));
        c=new String("helloo");
        d=c;
        System.out.println(eitherEquals(c,d));
        c=new String("hi");
        d=new String("hi");
        System.out.println(eitherEquals(c,d));
        c=new String("hullo");
        System.out.println(eitherEquals(c,d));
    }
    
    public static int nLength(String str)
    {
        if(str==null)
        {
            System.out.println("The string you inputted is null!");
            return(Integer.MIN_VALUE);
        }
        else
        {
            int length=str.length();
            return(length);
        }
    }
    
    public static String shortest(String s1, String s2)
    {
        if(s1==null || s2==null)
        {
            return(null);
        }
        else
        {
            if(s1.length()>s2.length())
            {
                return(s2);
            }
            else 
                return(s1);
        }
    }
    
    public static boolean eitherEquals(String s1, String s2)
    {
        //check if they be null
        if(s1==null && s2==null)
        {
            return(true);
        }
        else if(s1==null || s2==null)
        {
            return(false);
        }
        //equals
        if(s1.equals(s2) || s1==s2)
        {
            return(true);
        }
        else 
            return(false);
    }
}
