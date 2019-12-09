public class ForMilk
{
   public static void main(String[]args)
   {
      for(int a=99;a>0;a--)
      {
         if(a!=1)
         {
         System.out.println(a+" bottles of milk on the wall, "+a+
         " bottles of milk. Take one down, pass it around, "+(a-1)+
         " bottles of milk on the wall!");
         }
         
         if(a==1)
         {
         System.out.println(a+" bottle of milk on the wall, "+a+
         " bottle of milk. Take one down, pass it around, "+(a-1)+
         " bottles of milk on the wall!");
         }
         
      }
   }
}