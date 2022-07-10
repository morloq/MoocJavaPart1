
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate comparedDate)
    {
        double totaldays = this.day + this.month *30.5 + this.year *366;
        double totaldayscompared = comparedDate.day + comparedDate.month * 30.5 + comparedDate.year * 366;
        double difference = Math.abs(totaldays - totaldayscompared);
        
        return (int)difference / 365;//360 as months only have 30 days
    }
    public int getDay()
    {
        return this.day;
    }
    
    public int getMonth()
    {
        return this.month;
    }
  
    public int getYear()
    {
        return this.year;
    }
    public void setDay(int n)
    {
        this.day = n;
    }
    public void setMonth(int n)
    {
        this.month = n;
    }
    public void increaseYear()
    {
        this.year++;
    }
}
