import java.util.*;
public class ForDice
{
   public static void main(String[]args)
   {
      //Prep
      Scanner sc=new Scanner(System.in);
      System.out.println("How many times would you like to roll the dice?");
      double roll=sc.nextDouble();
      int one=0;
      int two=0;
      int three=0;
      int four=0;
      int five=0;
      int six=0;
      
      for(int a=0 ; a<roll ; a++)
      {
         
         int result=(int)(1+5*Math.random());
         if(result==1)
         {
            one=one+1;
         }
         
         if(result==2)
         {
            two=two+1;
         }

         if(result==3)
         {
            three=three+1;
         }
         
         if(result==4)
         {
            four=four+1;
         }

         if(result==5)
         {
            five=five+1;
         }
         
         if(result==6)
         {
            six=six+1;
         }
      }
         
         System.out.println("Ones: "+one+" ("+one/roll+")");
         System.out.println("Twos: "+two+" ("+two/roll+")");
         System.out.println("Threes: "+three+" ("+three/roll+")");
         System.out.println("Fours: "+four+" ("+four/roll+")");
         System.out.println("Fives: "+five+" ("+five/roll+")");
         System.out.println("Six: "+six+" ("+six/roll+")");
         

      
      
      
   
   
   
   }
}