public class PersonDriver
{
    public static void main()
    {
        //CREATING HUMAN BEANS
        Person kayla=new Person("Kayla","Song","female",17);
        Person tarjei=new Person("Tarjei","Sandvik Moe","male",18);
        
        //CALLING THE METHODS PARA KAYLA
        System.out.println(kayla.getFirstName());
        System.out.println(kayla.getLastName());
        System.out.println(kayla.getGender());
        System.out.println("Age is "+kayla.getAge());
        System.out.println("There are "+kayla.numLetters()+" letters in your name");
        System.out.println();
        System.out.println(kayla.changeFirstName("Even"));
        System.out.println(kayla.changeLastName("Bech Naesheim"));
        System.out.println(kayla.genderSwap());
        System.out.println(kayla.birthday());
        System.out.println(kayla.getFirstName());
        System.out.println(kayla.getLastName());
        System.out.println(kayla.getGender());
        System.out.println("Age is "+kayla.getAge());
        System.out.println("There are "+kayla.numLetters()+" letters in your name");
        
        //CALLING THE METHODS PARA TARJEI
        System.out.println("----------------------------");
        System.out.println(tarjei.getFirstName());
        System.out.println(tarjei.getLastName());
        System.out.println(tarjei.getGender());
        System.out.println("Age is "+tarjei.getAge());
        System.out.println("There are "+tarjei.numLetters()+" letters in your name");
        System.out.println();
        System.out.println(tarjei.changeFirstName("Noora"));
        System.out.println(tarjei.changeLastName("Amalie Saetre"));
        System.out.println(tarjei.genderSwap());
        System.out.println(tarjei.birthday());
        System.out.println(tarjei.getFirstName());
        System.out.println(tarjei.getLastName());
        System.out.println(tarjei.getGender());
        System.out.println("Age is "+tarjei.getAge());
        System.out.println("There are "+tarjei.numLetters()+" letters in your name");
    }
}
