public class DogTest
{
    public static void main()
    {
        //Dog dog = new Dog("Spike");
        //System.out.println(dog.getName() + " says " + dog.speak());
        Yorkshire doge=new Yorkshire("doge");
        System.out.println(doge.getName()+ " says" +doge.speak());
        Labrador rosie=new Labrador("rosie","tan");
        System.out.println(rosie.getName()+" says "+rosie.speak());
        
        System.out.println("Yorkshire weight: "+doge.avgBreedWeight());
        System.out.println("Labrador weight: "+rosie.avgBreedWeight());
    }
}