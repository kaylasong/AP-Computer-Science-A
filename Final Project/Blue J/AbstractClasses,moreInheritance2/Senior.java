public class Senior extends Student
{
    //constructor
    public Senior(String nm,double g)
    {
        super(nm);
        changeGPA(g);
        changeGrade(12);
    }
    
    //abstract methods: canVote, enjoySchool
    public boolean enjoySchool()
    {
        if(getGPA()>4.0)
        {
            return(true);
        }
        else
        {
            if(Math.random()<=.24)
            {
                return(true);
            }
            else
                return(false);
        }
    }
    public boolean canVote()
    {
        if(getGPA()<1.0)
        {
            return(false);
        }
        else 
            return(true);
    }
    
    public void graduate()
    {
        changeGrade(0);
        System.out.println("Congratulations! You've survived!");
    }
}