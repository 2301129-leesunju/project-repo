import java.io.IOException;
import java.util.Scanner;

public class Member {
    private String name;
    private String model;
    private int year;
    private int inc;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getInc() {
        return inc;
    }

    public void setInc(int inc) {
        this.inc = inc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String readString(String message) throws IOException{
        Scanner keyboard = new Scanner(System.in);
        String strData;
        while (true){
            System.out.print(message);
            strData= keyboard.next();
            System.out.printf("\n%s 선택되었습니다.\n",strData);
            break;
        }
        return strData;
    }
    public int readInt(String message) throws IOException{
        Scanner keyboard = new Scanner(System.in);
        int Data;
        while (true){
            System.out.print(message);
            Data= keyboard.nextInt();
            System.out.printf("\n%d 선택되었습니다.\n",Data);
            break;
        }
        return Data;
    }

    @Override
    public String toString() {
        return String.format("\n%s는(은) %s 에서 만든 %d 년형 %d 인치 %s TV 입니다.",name,model,year,inc,type);
    }
}
