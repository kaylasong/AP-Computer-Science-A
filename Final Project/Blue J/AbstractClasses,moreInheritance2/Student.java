public abstract class Student extends Human
{
    //instance data
    private int grade; 
    private double gpa;
    
    //constructor
    public Student(String name)
    {
        super(name);
    }
    
    //accessors
    public int getGrade()
    {
        return(grade);
    }
    public double getGPA()
    {
        return(gpa);
    }
    
    //mutator
    public void changeGPA(double a)
    {
        gpa=a;
    }
    public void changeGrade(int a)
    {
        grade=a;
    }
    
    //Human: abstract methods: toString, canVote
    public String toString()
    {
        String ans=new String(getName()+" has a grade of "+grade+", and a GPA of "+gpa); 
        return(ans);
    }
    
    //abstract method
    public abstract boolean enjoySchool();    
}