public class TwoArray
{
    public static void main()
    {
    }
    //a
    public static int[][] zeroNegs(int[][]a)
    {
        for(int r=0;r<a.length;r++)
        {
            for(int c=0;c<a[r].length;c++)
            {
                if(a[r][c]<0)
                {
                    a[r][c]=0;
                }
            }
        }
        return(a);
    }
    //b
    public static int sumAll(int[][]a)
    {
        int sum=0;
        for(int r=0;r<a.length;r++)
        {
            for(int c=0;c<a[r].length;c++)
            {
                sum=sum+a[r][c];
            }
        }
        return(sum);
    }
    //c
    public static int[][] oneTwo(int a, int b)
    {
        int[][]thing=new int[a][b];
        for(int r=0;r<a;r++)
        {
            for(int c=0;c<b;c++)
            {
                if(r%2==0)
                {
                    if(c%2==0)
                    {
                        thing[r][c]=1;
                    }
                    else
                    thing[r][c]=2;
                }
                if(r%2==1)
                {
                    if(c%2==0)
                    {
                        thing[r][c]=2;
                    }
                    else
                    thing[r][c]=1;
                }
            }
        }
        return(thing);
    }
}
