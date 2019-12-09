public class Fraction
{
    private int num;
    private int den;

    //CONSTRUCTOR
    public Fraction(int n,int d)
    {
        num=n;
        den=d;
    }
    
    //ACCESSORS
    public String toString()
    {
        String ans=new String(num+"/"+den);
        return(ans);
    }
    public int getNum()
    {
        return(num);
    }
    public int getDen()
    {
        return(den);
    }
    
    //MUTATORS
    public void simplify()
    {
        num=num/(gcf(num,den));
        den=den/(gcf(num,den));
    }

    public int gcf(int a,int b)
    {
        if(a<b)
        {
            return(gcf(a,b-a));
        }
        else if(b<a)
        {
            return(gcf(a-b,b));
        }
        else
        return a;
    }
    public Fraction multiply(Fraction other)
    {
        int a=num*(other.getNum());
        int b=den*(other.getDen());
        Fraction ans=new Fraction(a,b);
        ans.simplify();
        return(ans);
    }
    public Fraction divide(Fraction other)
    {
        int a=num*(other.getDen());
        int b=den*(other.getNum());
        Fraction ans=new Fraction(a,b);
        ans.simplify();
        return(ans);
    }
    public Fraction add(Fraction other)
    {
        int num1=num*(other.getDen());
        int num2=(other.getNum())*den;
        int dentot=den*(other.getDen());
        int numtot=num1+num2;
        
        Fraction ans=new Fraction(numtot,dentot);
        ans.simplify();
        return(ans);        
    }
    public Fraction subtract(Fraction other)
    {
        int num1=num*(other.getDen());
        int num2=(other.getNum())*den;
        int dentot=den*(other.getDen());
        int numtot=num1-num2;
        
        Fraction ans=new Fraction(numtot,dentot);
        ans.simplify();
        return(ans);        
    }
    public boolean equals(Fraction other)
    {
        other.simplify();
        if(num==other.getNum() && den==other.getDen())
        {
            return true;
        }
        else
        return false;
    }
}
