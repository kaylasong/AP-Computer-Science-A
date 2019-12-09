public class StringArray
{
    public static void main()
    {

    }
    //a
    public static String[] capsLock(String[]a)
    {
        for(int i=0;i<a.length;i++)
        {
            a[i]=a[i].toUpperCase();
        }
        return a;
    }
    //b
    public static boolean allEqual(String[]a,String[]b)
    {
        if(a.length!=b.length)
        {
            System.out.println("fool, these aren't equal");
            return(false);
        }
        for(int i=0;i<a.length;i++)
        {
            if(!a[i].equals(b[i]))
            {
                return(false);
            }
        }
        return(true);
    }
    //c
    public static String[] swap(String[]words, int spot1, int spot2)
    {
        String meantime=new String(words[spot1]);
        words[spot1]=words[spot2];
        words[spot2]=meantime;
        return(words);
    }
    //d
    public static String[] reverse(String[]a)
    {
        String[] reverse=new String[a.length];
        for(int i=0;i<a.length;i++)
        {
            reverse[a.length-(1+i)]=a[i];
        }
        return(reverse);
    }
    //e
    public static int searchString(String[]terms, String search)
    {
        int count=0;
        for(int i=0;i<terms.length;i++)
        {
            if(terms[i].indexOf(search)!=-1)
            {
                System.out.println(terms[i]);
                count++;
            }
        }
        return(count);
    }
    //f
    public static String longest(String[]a)
    {
        int max=a[0].length();
        int marker=0;
        for(int i=0;i<a.length;i++)
        {
           if(a[i].length()>max)
           {
               max=a[i].length();
               marker=i;
           }
        }
        return a[marker];
    }
    //g
    public static int countLetter(String[]a, String b)
    {
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length();j++)
            {
                if(a[i].substring(j,j+1).equals(b))
                {
                    count++;
                }
            }
        }
        return(count);
    }
}

