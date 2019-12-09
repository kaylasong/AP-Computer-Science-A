import java.util.*;
public class DiaryFun
{
    public static void main()
    {
    
    }
    public static String firstString(ArrayList<String> words)
    {
        String mark=new String(words.get(0));
        for(int i=1;i<words.size();i++)
        {
            if(words.get(i).compareTo(mark)<0)
            {
                mark=words.get(i);
            }
        }
        return(mark);
    }
    public static int totalEntries(Diary[][]diaries)
    {
        int count=0;
        for(int r=0;r<diaries.length;r++)
        {
            for(int c=0;c<diaries[0].length;c++)
            {
                diaries[r][c].unlock(1713);
                count=+diaries[r][c].numEntries();
            }
        }
        return(count);
    }
}
