import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TaxPayer extends People{
    private int electNo;
    protected int usage;
    private final int BASIC;
    private boolean suport;

    public TaxPayer(String name, int BASIC, int usage, int electNo) {
        super(name);
        this.BASIC = 1660;
        this.usage = 0;
        this.electNo = electNo;
    }



    protected void inputAll() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("납세하시는 사람의 이름 입력 (3글자) : ");
            name = keyboard.next();
            if (name.length()<4){
                    System.out.printf("\n %s 님의 사용자 번호 입력 (5자리 까지 입력 가능) : ",name);
                    electNo = keyboard.nextInt();
                    if (electNo<=99999){
                        int num = electNo;
                        int a = num/10000;
                        if (a==9){
                            suport=true;
                        }else {
                            suport=false;
                        }
                        System.out.printf("\n %s 님의 전기 사용량 입력 (입력 가능한 최대 사용량 9999) : ",name);
                        usage = keyboard.nextInt();
                        if (usage<=9999){
                            break;
                        }else {
                            System.err.println("오류 전기 사용량 입력량이 최대보다 많습니다.");
                        }
                    }else {
                        System.err.println("오류 사용자 번호가 5글자를 넘어섰습니다.");
                    }
            }else {
                System.err.println("오류 납세자의 이름이 3글자를 넘어섰습니다.");
            }
        }
    }


    protected float usageTax(){
        float result = 0;
        int i=usage;
        if (usage<=100){
            result = i*184.1f;
            if (suport==true){
                result=0;
            }
        }else if (usage<=200){
            if (suport==true)
                result = 0;
            else
                result = i*184.1f;
            i = i-100;
            result =result+(i*223.8f);
        } else if (usage<=300) {
            if (suport==true)
                result = 0;
            else
                result = 100*184.1f;
            i = i-100;
            result =result+(100*223.8f);
            i = i-100;
            result = result + (i*278.3f);
        } else if (usage<=400) {
            if (suport==true)
                result = 0;
            else
                result = 100*184.1f;
            i = i-100;
            result = result + (100*223.8f);
            i = i-100;
            result = result + (100*278.3f);
            i = i -100;
            result = result + (i*353.6f);
        } else if (usage<=500) {
            if (suport==true)
                result = 0;
            else
                result = 100*184.1f;
            i = i-100; result = result + (100*223.8f);
            i = i-100;
            result = result + (100*278.3f);
            i = i -100;
            result = result + (100*353.6f);
            i = i-100;
            result = result + (i*466.4f);
        } else if (usage<=9999) {
            if (suport==true)
                result = 0;
            else
                result = 100*184.1f;
            i = i-100;
            result = result + (100*223.8f);
            i = i-100;
            result = result + (100*278.3f);
            i = i -100;
            result = result + (100*353.6f);
            i = i-100;
            result = result + (100*466.4f);
            i = i-100;
            result = result + (i*643.9f);
        } else{
            System.out.println("오류");
        }
        result = result+BASIC;
        return result;
    }

    protected int tax(){
        int result;
        double resultA;
        resultA = usageTax()*(0.07);
        result = (int) Math.floor(resultA);
        return result;
    }

    protected int submitTax(){
        int result;
        result = (int) (usageTax()+tax());
        return result;
    }
    protected String suportStr(){
        String result = "";
        if (suport==true){
            result = "지원가구";
        }else if (suport==false){
            result = "";
        }else {
            System.err.println("오류");
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("%5d %3s   %,4dKW %,12d %,12d %,12d %4s",electNo,name,usage,(int)usageTax(),tax(),submitTax(),suportStr());
    }
}

