import java.util.Objects;
import java.util.Scanner;

public class Member {
    private int memberNum;
    private String name;
    private String bookname;
    private int birth;
    private String email;

    public Member(int memberNum, String name, String bookname, int birth, String email) {
        this.memberNum = memberNum;
        this.name = name;
        this.bookname = bookname;
        this.birth = birth;
        this.email = email;
    }

    public int getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(int memberNum) {
        this.memberNum = memberNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Member() {
    }

    public void SignUp(){
        Scanner scanner = new Scanner(System.in);
        String data;
        System.out.println("회원가입 정보 확인");
        System.out.printf(" 이름 : %s , 생년월일 : %d , 이메일 : %s",name,birth,email);
        System.out.println("\n해당 정보가 맞을 경우 Y , 아닐 경우 N 을 입력해주십시오.");
        data = scanner.next();
        if (Objects.equals(data, "Y")){
            System.out.println("정보 적합 확인 완료.\n회원 가입이 완료되었습니다.");
        }else if (Objects.equals(data, "N")){
            System.out.println("정보 부적합 확인 다시 시도해주십시오.");
            System.err.println("프로그램 종료");
        }else {
            System.out.println("잘못된 입력을 확인했습니다.");
            System.err.println("프로그램 종료");
        }
    }
    public void BookGet(){
        Scanner scanner = new Scanner(System.in);
        String data;
        System.out.printf("\n대출하실 책 이름이 %s 가 맞습니까? Y/N",bookname);
        data = scanner.next();
        if (Objects.equals(data, "Y")){
            System.out.println("대출이 진행되었습니다.");
        }else if (Objects.equals(data, "N")){
            System.out.println("대출 프로그램 중지.");
            System.err.println("프로그램 종료");
        }else {
            System.out.println("잘못된 입력을 확인했습니다.");
            System.err.println("프로그램 종료");
        }
    }
    public void BookReturn(){
        Scanner scanner = new Scanner(System.in);
        String data;
        System.out.printf("\n반납하실 책 이름이 %s 가 맞습니까? Y/N",bookname);
        data = scanner.next();
        if (Objects.equals(data, "Y")){
            System.out.println("반납이 진행되었습니다.");
        }else if (Objects.equals(data, "N")){
            System.out.println("반납 프로그램 중지.");
            System.err.println("프로그램 종료");
        }else {
            System.out.println("잘못된 입력을 확인했습니다.");
            System.err.println("프로그램 종료");
        }
    }
}
