import java.util.*;
public class IfRPS
{
   public static void main(String[]args)
   {
      //Gather
      Scanner sc=new Scanner(System.in);
      System.out.println("Please choose either rock, paper, or scissors.");
      String battle= sc.nextLine();
      int random= (int)(1+3*Math.random());
      
      //1=rock 2=paper 3=scissors
      
      //Rock
      if (battle.equals("rock") && random==2)
      {
         System.out.println("I chose paper. You lost.");
      }         
      if (battle.equals("rock") && random==3)
      {
         System.out.println("I chose scissors. You win!");
      }        
      if (battle.equals("rock") && random==1)
      {
         System.out.println("I chose rock. Stalemate.");
      }  
      
      //Paper
      if (battle.equals("paper") && random==3)
      {
         System.out.println("I chose scissors. You lost");
      }  
      if (battle.equals("paper") && random==2)
      {
         System.out.println("I chose paper. Stalemate.");
      } 
      if (battle.equals("paper") && random==1)
      {
         System.out.println("I chose rock. You win!");
      } 
   
      //Scissors
      if (battle.equals("scissors") && random==3)
      {
         System.out.println("I chose scissors. Stalemate.");
      } 
      if (battle.equals("scissors") && random==2)
      {
         System.out.println("I chose paper. You win!");
      }
      if (battle.equals("scissors") && random==1)
      {
         System.out.println("I chose rock. You lost.");
      }
   
   }



}