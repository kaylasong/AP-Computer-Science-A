public class Song
{
    //it meeeeeeeeeeeeee
    private String artist;
    private String name;
    private double length;
    //Constructor
    public Song(String ar,String na, double le)
    {
        artist=ar;
        name=na;
        length=le;
    }
    //Accessor
    public String getArtist()
    {
        return(artist);
    }
    public String getName()
    {
        return(name);
    }
    public double getLength()
    {
        return(length);
    }
    //ToString
    public String toString()
    {
        String stuff=new String(artist+" - "+name);
        return(stuff);
    }
    //equals method
    public boolean equals(Song other)
    {
        if(other.getName().equals(name)&&other.getArtist().equals(artist))
        {
            return(true);
        }
        else 
            return(false);
    }
}