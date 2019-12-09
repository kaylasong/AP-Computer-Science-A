public class Freshman extends Student
{
    //constructor
    public Freshman(String nm,double g)
    {
        super(nm);
        changeGPA(g);        
        changeGrade(9);
    }
    
    //abstract methods: canVote, enjoySchool
    public boolean enjoySchool()
    { 
        return(false);
    }
    public boolean canVote()
    {
        return(false);
    }
}