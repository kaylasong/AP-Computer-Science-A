import java.util.*;
public class StringList
{
    public static void main()
    {
        ArrayList<String> stuff=new ArrayList<String>();
        stuff.add("apple");
        stuff.add("banana");
        stuff.add("drag");
        System.out.println(length(stuff));
        System.out.println(totalLength(stuff));
        for(int i=0;i<stuff.size();i++)
        {
            System.out.println(stuff.get(i));
        }
        System.out.println(indexOf(stuff,"guy"));
        System.out.println(count(stuff,"happy"));
        System.out.println(addOrder(stuff,"carrog"));
        for(int i=0;i<stuff.size();i++)
        {
            System.out.println(stuff.get(i));
        }
    }

    public static int length(ArrayList<String>words)
    {
        //checked
        return(words.size());
    }

    public static int totalLength(ArrayList<String>thing)
    {
        //checked
        int total=0;
        for(int i=0;i<thing.size();i++)
        {
            total=total+thing.get(i).length();
        }
        return total;
    }

    public static ArrayList<String> add(ArrayList<String> words, String newWord)
    {
        //checked
        words.add(newWord);
        return words;
    }

    public static int indexOf(ArrayList<String> things, String thing)
    {
        //checked
        int mark=0;
        boolean found=false;
        for(int i=0;i<things.size();i++)
        {
            if(things.get(i).equals(thing))
            {
                found=true;
                break;
            }
            mark++;
        }
        if(found==true)
        {
            return mark;
        }
        else
            return(-1);
    }

    public static int count(ArrayList<String> things, String thing)
    {
        //checked
        int count=0;
        for(int i=0;i<things.size();i++)
        {
            if(things.get(i).equals(thing))
            {
                count++;
            }
        }
        return count;
    }

    public static ArrayList<String> addOrder(ArrayList<String> words, String newWord)
    {
        boolean finished=false;
        for(int i=0; i<words.size();i++)
        {
            if(newWord.compareTo(words.get(i))<0)
            {
                words.add(i, newWord);
                finished=true;
                break;
            }

        }
        if(finished==false)
        {
            words.add(newWord);
        }
        return words;
    }
}
