import java.time.LocalDate;
public class StudentsList{
    public void birth(int bth){
        int data = bth;
        data = data/10000;
        LocalDate now = LocalDate.now();
        int result;
        int exResult = now.getYear();
        result = exResult - data;
        System.out.printf("나이 : %d",result);
    }
}
