import java.util.*;
public class SearchSort
{
    public static void main()
    {
        ArrayList<String> a=new ArrayList<String>();
        a.add("one");
        a.add("two");
        a.add("three");
        System.out.println(seqSearch(a,"two"));
        System.out.println(seqSearch(a,"four"));
        System.out.println();

        ArrayList<Double> b=new ArrayList<Double>();
        b.add(1.5);
        b.add(56.0);
        b.add(13.8);
        b.add(-5.5);
        b=selSort(b);
        System.out.println(b);
        System.out.println();

        ArrayList<Integer> c=new ArrayList<Integer>();
        c.add(5);
        c.add(965);
        c.add(-1);
        c.add(0);
        c.add(62);
        c.add(4);
        c.add(3);
        c=insertSort(c);
        System.out.println(c);
        System.out.println();

        int[] d=new int[6];
        d[0]=0;
        d[1]=2;
        d[2]=10;
        d[3]=80;
        d[4]=100;
        d[5]=101;

        int[] d2=takePart(d,2,5);
        for(int i=0;i<3;i++)
        {
            System.out.println(d2[i]);
        }
        System.out.println();
        
        int[] e=totalOrder(d,d2);
        for(int i=0;i<e.length;i++)
        {
            System.out.println(e[i]);
        }
        System.out.println();
        
        int[]f0=new int[5];
        f0[0]=2;
        f0[1]=91;
        f0[2]=-6;
        f0[3]=15;
        f0[4]=6;
        
        int[] f=merSort(f0);
        for(int i=0;i<f.length;i++)
        {
            System.out.println(f[i]);
        }
        System.out.println();
        
        System.out.println(binSearch(d,0));
        System.out.println(binSearch(d,2));
        System.out.println(binSearch(d,10));
        System.out.println(binSearch(d,-6));
        System.out.println(binSearch(d,80));
        System.out.println(binSearch(d,100));
        System.out.println(binSearch(d,101));
    }   

    //1 tested :)
    public static boolean seqSearch(ArrayList<String> list, String a)
    {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).equals(a))
            {
                return(true);
            }
        }
        return(false);
    }

    //2 tested :)
    public static ArrayList<Double> selSort(ArrayList<Double> list)
    {
        ArrayList<Double> ans=new ArrayList<Double>();
        for(int i=0;i<list.size();i++)
        {   
            Double min=new Double(list.get(0));
            int mark=0;
            for(int j=0;j<list.size();j++)
            {
                if(list.get(j)<min)
                {
                    min=list.get(j);
                    mark=j;
                }
            }
            ans.add(min);
            list.remove(mark);
            i--;
        }
        return(ans);
    }

    //3 tested :)
    public static ArrayList<Integer> insertSort(ArrayList<Integer> list)
    {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        ans.add(list.get(0));
        boolean added=false;
        for(int i=1;i<list.size();i++)
        { //in order to select the first element from "list"
            for(int j=0;j<ans.size();j++)
            {   //in order to sort where the i element should go.
                if(list.get(i)<=ans.get(j))
                {
                    ans.add(j,list.get(i));
                    added=true;
                    break;
                }
            }
            if(added==false)
            {
                ans.add(list.get(i));
            }   
            added=false;
        }
        return(ans);
    }

    //4 tested :)
    public static int[] takePart(int[] nums,int index1,int index2)
    {
        int size=index2-index1;
        int[] ans=new int[size];
        int j=0;
        for(int i=index1;i<index2;i++)
        {
            ans[j]=nums[i];
            j++;
        }
        return(ans);
    }

    //5 tested and approved by the man himself, Leo Ouyang.
    public static int[] totalOrder(int[] nums1,int[] nums2)
    {
        int[] all=new int[nums1.length+nums2.length];
        boolean thing=false;
        //the space in the all list
        int count=0;
        while(thing==false)
        {
            if(nums1.length==0)
            {
                for(int i=0;i<nums2.length;i++)
                {
                    all[count]=nums2[i];
                    count++;
                }
                thing=true;
            }
            else if(nums2.length==0)
            {
                for(int i=0;i<nums1.length;i++)
                {
                    all[count]=nums1[i];
                    count++;
                }
                thing=true;
            }
            else if(nums1[0]<nums2[0])
            {
                all[count]=nums1[0];
                count++;
                nums1=takePart(nums1,1,nums1.length);
            }
            else if(nums1[0]>nums2[0])
            {
                all[count]=nums2[0];
                count++;
                nums2=takePart(nums2,1,nums2.length);
            }
            else if(nums1[0]==nums2[0])
            {
                all[count]=nums1[0];
               nums1=takePart(nums1,1,nums1.length);
                count++;
                all[count]=nums2[0];
                count++;
                nums2=takePart(nums2,1,nums2.length);
            }
        }
        return(all);
    }

    //6 tested :)
    public static int[] merSort(int[] a)
    {
        if(a.length<2)
        {
            return(a);
        }
        return(totalOrder(merSort(takePart(a,0,a.length/2)),merSort(takePart(a,a.length/2,a.length))));
    }

    //7 tested :) 
    public static boolean binSearch(int[] a, int b) //assume it's already sorted
    {
        if(a.length<2 && a[0]!=b)
        {
            return(false);
        }
        else if(a.length<2 && a[0]==b)
        {
            return(true);
        }
        
        //comparisons
        if(a[a.length/2]<b)
        {
            return binSearch(takePart(a,a.length/2,a.length),b);
        }
        else if(a[a.length/2]>b)
        {
            return binSearch(takePart(a,0,a.length/2),b);
        }
        else if(a[a.length/2]==b)
        {
            return(true);
        }
        else
            return(false);
    }
}