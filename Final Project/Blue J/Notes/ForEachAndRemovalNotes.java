import java.util.*; 
public class ForEachAndRemovalNotes
{
    public static void main(String[]args)
    {
        ArrayList<Integer> nums=new ArrayList<Integer>();
        nums.add(7);
        nums.add(4);
        nums.add(2);
        nums.add(-9);
        nums.add(0);
        System.out.println(nums);
        //write a loop to go through and remove all of the even numbers 
        //remember .remobe(i) remobes the element in that spot
        for(int i=0;i<nums.size();i++)
        {
            if(nums.get(i)%2==0)
            {
                nums.remove(i);
                //in order to avoid the for loops removal issue, you have to
                //go back every time you remove.
                i--;
            }
            else if(nums.get(i)==2)
            {
                nums.remove(i);
            }
        }
        System.out.println(nums);
        //for loops removal issue:
        //every time you remove from a list, it skips over the next number
        
        //ORRRRRRRRRRRRRRRR
         for(int i=nums.size()-1;i>=0;i--)
        {
            if(nums.get(i)%2==0)
            {
                nums.remove(i);
            }
            else if(nums.get(i)==2)
            {
                nums.remove(i);
            }
        }
    }
}