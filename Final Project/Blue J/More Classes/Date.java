public class Date
{
    //INSTANCE VARIABLES
    private int month;
    private int day;
    private int year;

    //CONSTRUCTOR
    public Date(int mo,int d,int yr)
    {
        month=mo;
        day=d;
        year=yr;
    }

    //ACCESSORS
    public int getMonth()
    {
        return(month);
    }

    public int getDay()
    {
        return(day);
    }

    public int getYear()
    {
        return(year);
    }

    //MUTATORS
    public void nextYear(int ogyr)
    {
        year=ogyr+1;
    }

    public void nextDay()
    {
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
        {
            if(day==31)
            {
                if(month==12)
                {
                    month=1;
                    year++;
                }
                else 
                    month++;
                day=1;
            }
        }
        else if(month==2 && day==28)
        {
            month++;
            day=1;
        }
        else 
        {
            if(day==30)
            {
                month++;
                day=1;
            }
        }
    }   

    public void nextDays(int n)
    {
        for(int i=0;i<n;i++)
        {
            if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
            {
                if(day==31)
                {
                    if(month==12)
                    {
                        month=1;
                        year++;
                    }
                    else 
                        month++;
                    day=1;
                }
            }
            else if(month==2 && day==28)
            {
                month++;
                day=1;
            }
            else 
            {
                if(day==30)
                {
                    month++;
                    day=1;
                }
                else 
                    day++;
            }
        }
    }

    public boolean equals(Date other)
    {
        if(month==other.getMonth()&&day==other.getDay()&&year==other.getYear())
        {
            return true;
        }
        else 
            return false;
    }

    public String toString()
    {
        String ans=new String(month+"/"+day+"/"+year);
        return(ans);
    }
}
