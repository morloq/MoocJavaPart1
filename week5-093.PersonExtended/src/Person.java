import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    
    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        int day = Calendar.getInstance().get(Calendar.DATE);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int year = Calendar.getInstance().get(Calendar.YEAR);
        MyDate current = new MyDate(day, month, year);
        int counter = 0;
        while(birthday.getDay() != current.getDay() && birthday.getMonth() != current.getMonth()
                && birthday.getYear() != current.getYear())
        {
            if(birthday.getDay() < 28 && birthday.getMonth() == 2)
            {
                birthday.setDay(birthday.getDay() +1);
                counter++;
            }
            else if (birthday.getDay() < 29 && birthday.getMonth() == 2 && (birthday.getYear() % 4 == 0 && birthday.getYear() % 100 == 0 && birthday.getYear() % 400 == 0))
            {
                birthday.setDay(birthday.getDay() +1);
                counter++;
            }
            else if(birthday.getDay() < 30 && (birthday.getMonth() ==4 || birthday.getMonth() == 6
                    || birthday.getMonth() == 9 || birthday.getMonth() == 11))
            {
                birthday.setDay(birthday.getDay() +1);
                counter++;
            }
            else if(birthday.getDay() < 31 &&(birthday.getMonth() == 1 || birthday.getMonth() == 3
                    || birthday.getMonth() == 5 || birthday.getMonth() == 7 || birthday.getMonth() == 8
                    || birthday.getMonth() == 10 || birthday.getMonth() == 12))
            {
                birthday.setDay(birthday.getDay() +1);
                counter++;
            }
            else
            {
                birthday.setDay(1);
                birthday.setMonth(birthday.getMonth() +1);
                if(birthday.getMonth() == 13)
                {
                    birthday.setMonth(1);
                    birthday.increaseYear();
                }
            }
        }
        return counter;
    }
    
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        
        return false;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
