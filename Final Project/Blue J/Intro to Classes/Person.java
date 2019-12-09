public class Person
{
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    
    //CONSTRUCTOR
    public Person(String inFName, String inLName, String inGender, int inAge)
    {
        firstName=inFName;
        lastName=inLName;
        gender=inGender;
        age=inAge;
    }
    
    //ACCESSORS
    public String getFirstName()
    {
        return(firstName);
    }
    public String getLastName()
    {
        return(lastName);
    }
    public String getGender()
    {
        return(gender);
    }
    public int getAge()
    {
        return(age);
    }
    
    //MUTATORS
    public String changeFirstName(String newName)
    {
        firstName=newName;
        return(firstName);
    }
    public String changeLastName(String newName)
    {
        lastName=newName;
        return(lastName);
    }
    public String genderSwap()
    {
        if(gender.equals("male"))
        {
            gender="female";
            return(gender);
        }
        else 
        gender="male";
        return(gender);
    }
    
    //OTHER METHODS
    public int birthday()
    {
        age++;
        System.out.println("Happy Birthday, my frenn! Here is a large nostril man with cool"+
        " eyebrows. ,':8)");
        return(age);
    }
    public int numLetters()
    {
        int count=firstName.length()+lastName.length();
        return(count);
    }
}
