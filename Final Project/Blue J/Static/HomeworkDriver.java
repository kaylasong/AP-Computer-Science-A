public class HomeworkDriver
{
    public static void main()
    {
        Homework a=new Homework("do a thing", 1);
        Homework b=new Homework("do two things", 2);
        Homework c=new Homework("do three things", 3);
        System.out.println("total points: "+Homework.getTotalPoints());
        System.out.println("number of assignments :"+Homework.numAssignments());
        System.out.println(b.getDescription());
        System.out.println(b.getPoints());
        b.changePoints(4);
        System.out.println("total points: "+Homework.getTotalPoints());
        System.out.println(b);
        Homework.printAssignments();
        System.out.println("The one with the fewest points");
        System.out.println(Homework.fewestPoints(b,c));
    }
}
