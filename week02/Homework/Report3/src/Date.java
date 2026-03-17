import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class Date {
    private int year;
    private int month;
    private int day;

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
    public int readInt(String message) throws IOException{
        Scanner keyboard = new Scanner(System.in);
        int data;
        while (true){
            System.out.println(message);
            data= keyboard.nextInt();
            if (data>0){
                break;
            }else {
                System.err.println("입력 오류");
                System.in.read();
            }
        }
        return data;
    }

    @Override
    public String toString() {
        month = month-1;
        Calendar cal = Calendar.getInstance();
        cal.set(year,month,1);
        System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        int result = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
            if (day>result) {
                System.err.println("입력 오류, 일 수가 해당 달의 최댓값을 벗어났습니다.");
                System.exit(0);
            }
        return String.format("지정된 날짜 : %d 년 %d 월 %d 일",year,month+1,day);
    }
}
