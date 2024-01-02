package hotel.customer;

// Date.java

public class Date
{
    private int day;
    private int month;
    private int year;

    // constructors
    public Date(int day, int month, int year)
    {
        setYear(year);
        setMonth(month);
        setDay(day);
    }
    public Date(int day, int month)
    {
        this(day, month, 1970);
    }
    public Date(int day)
    {
        this(day, 1, 1970);
    }
    public Date()
    {
        this(1, 1, 1970);
    }
    public Date(Date d)
    {
        this(d.getDay(), d.getMonth(), d.getYear());
    }

 /* classic set methods
 public void setYear(int year)
 {
  this.year = (year >= 0 ? year : 1970);
 }
 public void setMonth(int month)
 {
  this.month = (month < 1 || month > 12 ? 1 : month);
 }
 public void setDay(int day)
 {
  int daysOfMonth[] =
   {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  if(
  (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
   daysOfMonth[2] = 29;

  this.day =
   (day < 1 || day > daysOfMonth[month] ? 1 : day);
 }
 */

    // cascaded set methods
    public Date setYear(int year)
    {
        this.year = (year >= 0 ? year : 1970);
        return this;
    }
    public Date setMonth(int month)
    {
        this.month = (month < 1 || month > 12 ? 1 : month);
        return this;
    }
    public Date setDay(int day)
    {
        int daysOfMonth[] =
                {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(
                (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            daysOfMonth[2] = 29;

        this.day =
                (day < 1 || day > daysOfMonth[month] ? 1 : day);
        return this;
    }

    // get methods
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

    // toString
    public String toString()
    {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}