public class FractionMath
{
    public static void main()
    {
    }
    public static Fraction fadd(Fraction a, Fraction b)
    {
        return(a.add(b));
    }
    public static Fraction fsubtract(Fraction a, Fraction b)
    {
        return(a.subtract(b));
    }
    public static Fraction fmultiply(Fraction a, Fraction b)
    {
        return(a.multiply(b));
    }
    public static Fraction fdivide(Fraction a, Fraction b)
    {
        return(a.divide(b));
    }
    public static boolean fequals(Fraction a, Fraction b)
    {
        return(a.equals(b));
    }
    public static Fraction maxDenom(Fraction[] fracs)
    {
        int max=fracs[0].getDen();
        int marker=0;
        for(int i=0;i<fracs.length;i++)
        {
            if(fracs[i].getDen()>max)
            {
                max=fracs[i].getDen();
                marker=i;
            }
        }
        return(fracs[marker]);
    }
}
