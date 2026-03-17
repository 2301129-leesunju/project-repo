import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Date date = new Date();
        date.setYear(date.readInt("\n년 설정 :"));
        date.setMonth(date.readInt("\n월 설정 :"));
        date.setDay(date.readInt("\n일 설정 :"));

        System.out.println(date);
    }
}