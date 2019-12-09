public class Date
{
    private int month;
    private int day;
    private int year;

    public Date(int m, int d, int y)
    {
        month = m;
        day = d;
        year = y;
    }

    public int getDay()
    {
        return day;
    }

    public int getMonth()
    {
        return month;
    }

    public int getYear()
    {
        return year;
    }

    public void nextYear()
    {
        year++;
    }

    public void nextDay()
    {
        if (month == 12 && day == 31)
        {
            month = 1;
            day = 1;
            year++;
        }
        else if (month == 2 && day == 28)
        {
            month = 3;
            day = 1;
        }
        else if ( day == 31)
        {
            month++;
            day = 1;
        }
        else if (day == 30 && (month == 4 || month == 6 || month == 9 || month == 11))
        {
            month++;
            day = 1;
        }
        else
            day++;
    }

    public void nextDays(int n)
    {
        for (int i = 0 ; i < n ; i++)
            nextDay();

    }

    public String toString()
    {
        return "" + month + "/" + day + "/" + year;
    }

    public Boolean equals(Date b)
    {
        //comparing day (the current object's day) to b's getDay
        if (day == b.getDay() && month == b.getMonth() && year == b.getYear() )
            return true;
        //if (this.getDay() == b.getDay() && this.getMonth() == b.getMonth() ...
        //if (this.day == b.day && this.month == b.month && this.year == b.year)

        else
            return false;

    }
}
