import java.util.*;
public class PlayList
{
    private ArrayList<Song> tunes;
    //constructors
    public PlayList()
    {
        tunes=new ArrayList<Song>();
    }

    public PlayList(ArrayList<Song> thing)
    {
        tunes=thing;
    }
    //other thingies
    public void add(Song newthing)
    {
        tunes.add(newthing);
    }

    public int numberOfSongs()
    {
        int num=tunes.size();
        return num;
    }

    public double totalLength()
    {
        double total=0;
        for(Song thing:tunes)
        {
            double a=thing.getLength();
            total=total+a;
        }
        return total;
    }

    public Song playSong()
    {
        Song play=tunes.get(0);
        tunes.remove(0);
        return(play);
    }

    public void removeLength(double hi)
    {
        for(int i=0;i<tunes.size();i++)
        {
            if(tunes.get(i).getLength()>=hi)
            {
                tunes.remove(i);
                i--;
            }
        }
    }

    public void shuffle()
    {
        ArrayList<Song> ans=new ArrayList<Song>();
        int forthingie=tunes.size();
        for(int i=0;i<forthingie;i++)
        {
            int ran=(int)(tunes.size()*Math.random());
            ans.add(tunes.get(ran));
            tunes.remove(ran);
        }
        tunes=ans; 
    }
    
    public String toString()
    {
       String ans=new String();
       for(Song thing:tunes)
       {
           ans=ans+"\n"+thing;
       }
       return(ans);
    }
}