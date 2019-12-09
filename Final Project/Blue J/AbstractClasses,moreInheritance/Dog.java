//********************************************************************
//  Dog.java       Author: Lewis/Loftus/Cocking
//
//  Represents a dog, which is a pet.
//********************************************************************

public abstract class Dog extends Pet
{

    //-----------------------------------------------------------------
    // Creates a dog with the given name
    //-----------------------------------------------------------------
    public Dog(String dogName)
    {
        super(dogName);

    }

    //-----------------------------------------------------------------
    // Returns a string representation of this dog.
    //-----------------------------------------------------------------
    public String toString()
    {
        return super.toString() + " is a dog";
    }

    //-----------------------------------------------------------------
    // Returns a string indicating what this dog says.
    //-----------------------------------------------------------------
    public String speak()
    {
        return "woof?";
    }

    //-----------------------------------------------------------------
    // Returns a string indicating how this dog moves.
    //-----------------------------------------------------------------
    public String move()
    {
        return "run";
    }
    
    //my stuffs
    //abstract 
    public abstract int avgBreedWeight();
}
