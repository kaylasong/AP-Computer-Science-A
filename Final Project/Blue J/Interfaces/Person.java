// ****************************************************************
//   Person.java
//
//   A simple class representing a person.
// ***************************************************************

public class Person implements Comparable<Person>
{
    private String name;
    private int age;
    // ------------------------------------------------------------
    //  Sets up a Person object with the given name and age.
    // ------------------------------------------------------------
    public Person (String iname,  int iage)
    {
        this.name = iname;
        this.age = iage;
    }
    
    public String getName()
    {
        return(name);
    }
    public int getAge()
    {
        return(age);
    }
    // ------------------------------------------------------------
    //   Changes the name of the Person to the parameter newName.
    // ------------------------------------------------------------
    public void changeName(String newName)
    {
        name = newName;
    }

    // -----------------------------------------------------------
    //   Changes the age of the Person to the parameter newAge.
    // -----------------------------------------------------------
    public void changeAge (int newAge)
    {
        age = newAge;
    }

    // -----------------------------------------------------------
    //   Returns the person's name and age as a string.
    // -----------------------------------------------------------
    public String toString()
    {
        return name + " - Age " + age;
    }

    public int compareTo(Person other)
    {
        if(name.compareTo(other.getName())>0)
        {
            return(1);
        }
        else if(name.compareTo(other.getName())<0)
        {
            return(-1);
        }
        else
        {
            if(age>other.getAge())
            {
                return(2);
            }
            else if(age<other.getAge())
            {
                return(-2);
            }
            else
                return(0);
        }
    }
}
