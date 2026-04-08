import java.util.Objects;
import java.util.Scanner;

public class Book {
    private String[] givenBook;
    private String[] haveBookArr;

    public String[] getGivenBook() {
        return givenBook;
    }

    public void setGivenBook(String[] givenBook) {
        this.givenBook = givenBook;
    }

    public String[] getHaveBookArr() {
        return haveBookArr;
    }

    public void setHaveBookArr(String[] haveBookArr) {
        this.haveBookArr = haveBookArr;
    }

    public void givenBookArr(){
        String data;
        Scanner scanner = new Scanner(System.in);
        givenBook = new String[10];
        for (int i=0;i<10;i++){
            System.out.printf("\n입고하실 책 이름을 입력해주세요.[%d/10]",i);
            data = scanner.next();
            givenBook[i]=data;
        }
        System.out.println("입고가 완료되었습니다.");
    }
    public void BookToLibrary(Library library){
        Scanner scanner = new Scanner(System.in);
        String data;
        System.err.println("\n도서관 대출 현황을 확인 하시겠습니까? Y/N");
        data=scanner.next();
        if (Objects.equals(data, "Y")){
            library.toBookList();
        }else if (Objects.equals(data,"N")){
            System.out.println("거부 확인 완료. 종료합니다.");
        }else {
            System.err.println("잘못된 입력입니다.");
        }

    }
}
