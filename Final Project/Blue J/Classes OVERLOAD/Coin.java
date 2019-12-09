public class Coin
{
    private String face;
    private double bias;
    
    //CONSTRUCTORS
    public Coin()
    {
        face="Heads";
        bias=.5;
    }
    public Coin(double inputBias)
    {
        face="Heads";
        bias=inputBias;    
    }
    
    //ACCESSORS
    public boolean isHeads()
    {
        if(face.equals("Heads"))
        {
            return true;
        }
        else
        return false;
    }
    public boolean isTails()
    {
        if(face.equals("Tails"))
        {
            return true;
        }
        else 
        return false;
    }
    
    //OTHER STUFF
    public void flip()
    {
        double side=Math.random();
        if(side<bias)
        {
            face="Heads";
            System.out.println(face);
        }
        else
        face="Tails";
        System.out.println(face);
    }
    public int flip(int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            flip();
            if(face.equals("Heads"))
            {
                count++;
            }
        }
        return count;
    }
    public String toString()
    {
        return(face);
    }
    
    public String getFace()
    {
        return(face);
    }
    public double getBias()
    {
        return(bias);
    }
    public boolean equals(Coin x)
    {
        if(x.getFace().equals(face) && x.getBias()==bias)
        {
           return true;
        }
        else return false;
    }
}
