import java.io.IOException;
import java.util.Scanner;

public class Adder {
    private int start;
    private int last;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }

    public int readData(String message) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int data;
        while (true){
            System.out.print(message);
            data= keyboard.nextInt();
            if (data>=0)
                break;
            else {
                System.err.print("입력 오류");
                System.in.read();
            }
        }
        return data;
    }
    private int add(){
        int result = 0;
        for (int i = start;i<=last;i++)
            result +=i;
        return result;
    }

    @Override
    public String toString() {
        return String.format("%d + %d + ...... + %d = %d %d\n", start, start+1, last-1,last, add());
    }
}

