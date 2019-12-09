public class Cardz
{
    private String suit;
    private int value;
    public Cardz(String suuit, int vaalue)
    {
        suit=suuit;
        value=vaalue;
    }
    //accessor ish
    public String getSuit()
    {
        return(suit);
    }

    public int getValue()
    {
        return(value);
    }

    public String toString()
    {
        String val=new String();
        String ans=new String();
        if(value==1)
        {
            val="ace";
            ans=val+" of "+suit;
        }
        else if(value==13)
        {   val="king";
            ans=val+" of "+suit;
        }
        else if(value==12)
        { 
            val="queen";
            ans=val+" of "+suit;
        }
        else if(value==11)
        {  
            val="jack";
            ans=val+" of "+suit;
        }
        else
            ans=value+" of "+suit;
        return(ans);
    }
}
