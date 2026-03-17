import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public int getAge(){
        int curYear = Calendar.YEAR;
        int curMonth = Calendar.MONTH;
        int curDay = Calendar.DAY_OF_MONTH;
        return year-curYear;
    }

    @Override
    public String toString() {
        return String.format("%d 세",getAge());
    }
}
