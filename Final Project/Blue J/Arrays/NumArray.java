public class NumArray
{
    public static void main()
    {

    }
    //a
    public static int[] vectorAdd(int[]a, int[]b)
    {
        int[]sum=new int[a.length];

        if(a.length!=b.length)
        {
            System.out.println("That doesn't work.");
            int[]c=new int[1];
            return c;
        }

        for(int i=0;i<a.length;i++)
        {
            sum[i]=a[i]+b[i];  
        }
        return sum;
    }
    //b
    public static int[] vectorSubtract(int[]a, int[]b)
    {
        int[]diff=new int[a.length];

        if(a.length!=b.length)
        {
            System.out.println("That doesn't work.");
            int[]c=new int[1];
            return c;
        }

        for(int i=0;i<a.length;i++)
        {
            diff[i]=a[i]-b[i];  
        }
        return diff;
    }
    //c
    public static int sumUp(int[]a)
    {
        int total=0;
        for(int i=0;i<a.length;i++)
        {
            total=total+a[i];
        }
        return total;
    }
    //d
    public static int[] scalarMult(int[]a,int b)
    {
        for(int i=0;i<a.length;i++)
        {
            a[i]=a[i]*b;
        }       
        return a;
    }
    //e
    public static int dotProduct(int[]a, int[]b)
    {
        if(a.length!=b.length)
        {
            System.out.println("That doesn't work");
            return Integer.MIN_VALUE;
        }
        int sum=0;
        int[]mult=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            mult[i]=a[i]*b[i];
            sum=sum+mult[i];
        }
        return sum;
    }
    //f
    public static int minArray(int[]a)
    {
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        return min;
    }
    //g
    public static int maxArray(int[]a)
    {
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max; 
    }
    //h
    public static void printArray(int[]a)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==a.length)
            {
                System.out.print(a[i]);
            } 
            else
            System.out.print(a[i]+", ");
        }
    }
    //i
    public static int randomEntry(int[]a)
    {    
        int ran=(int)((a.length)*Math.random());
        return(a[ran]);
    }
    //j
    public static int[] subArray(int[]nums, int start, int end)
    {
        int[]sub=new int[end-start];
        for(int i=0;i<(end-start);i++)
        {
           sub[i]=nums[start+i];
        }
        return sub;
    }
    //k
    public static int[] negEntries(int[]stuff)
    {
       int count=0;
       for(int i=0;i<stuff.length;i++)
       {
           if(stuff[i]<0)
           {
               count++;
           }
       }
       int[]neg=new int[count];
       int thing=0;
       for(int i=0;i<stuff.length;i++)
       {
          if(stuff[i]<0)
          {
              neg[thing]=stuff[i];
              thing++;
          }
       }  
       return neg;
    }
}