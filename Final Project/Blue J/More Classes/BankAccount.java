import java.util.*;
public class BankAccount
{
    private String name;
    private double rate;
    private double money;
    
    //CONSTRUCTOR
    public BankAccount()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name.");
        name=sc.nextLine();
        rate=1.05;
        money=sc.nextDouble();
    }
    
    //MUTATORS
    public void deposit(int n)
    {
        if(n<0)
        {
            System.out.println("That's not allowed.");
        }
        else
        {
            money=money+n;
        }
    }
    public void withdraw(int n)
    {
        if(n<0 || n>money)
        {
            System.out.println("That's not allowed.");
        }
        else
        {
            money=money-n;
        }
    }
    public void addInterest()
    {
        money=money*rate;
    }
    public void addMultipleInterest(int n)
    {
        for(int i=0;i<n;i++)
        {
            money=money*rate;
        }
    }
    
    //ACCESSORS
    public double getBalance()
    {
        return(money);
    }
    public double accountStatement()
    {
        money--;
        System.out.println("Your balance is $"+money);
        System.out.println("Your name is "+name);
        return(money);
    }
}
