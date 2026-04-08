import java.util.Scanner;

public class Library {
    private Book book;
    private Member member;
    private String[] libraryBooks;
    private String[] givenLibraryBooks;
    private String[] signUpArr;

    public Library(Book book, Member member) {
        this.book = book;
        this.member = member;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String[] getLibraryBooks() {
        return libraryBooks;
    }

    public void setLibraryBooks(String[] libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public String[] getGivenLibraryBooks() {
        return givenLibraryBooks;
    }

    public void setGivenLibraryBooks(String[] givenLibraryBooks) {
        this.givenLibraryBooks = givenLibraryBooks;
    }

    public String[] getSignUpArr() {
        return signUpArr;
    }

    public void setSignUpArr(String[] signUpArr) {
        this.signUpArr = signUpArr;
    }

    public void LibrarySys(){
        Scanner scanner = new Scanner(System.in);
        givenLibraryBooks =new String[20];
        libraryBooks = new String[20];
        int data;
        System.out.println("이용 가능 관리자 서비스 목록 :\n회원 가입(1) , 도서 대출(2) , 도서 반납(3) , 도서 입고(4)\n희망하시는 서비스 번호를 입력해주세요.");
        data=scanner.nextInt();
        if (data==1){
            member.SignUp();
        } else if (data==2) {
            member.BookGet();
            for (int i=0;i< givenLibraryBooks.length;i++){
                if (givenLibraryBooks[i]==null){
                    givenLibraryBooks[i]= member.getBookname();
                    break;
                }
            }
        } else if (data==3) {
            member.BookReturn();
            for (int i=0;i< libraryBooks.length;i++){
                if (libraryBooks[i]==null){
                    libraryBooks[i]= member.getBookname();
                    break;
                }
            }
        } else if (data==4) {
            book.givenBookArr();
            for (int i=0;i< book.getGivenBook().length;i++){
                for (int f=0;i<libraryBooks.length;f++){
                    if (libraryBooks[i]==null){
                        libraryBooks[i]= book.getGivenBook()[i];
                        break;
                    }
                }
                if (i==10){
                    break;
                }
            }
        }else {
            System.err.println("잘못된 입력입니다.");
        }
    }
    public void toBookList(){
        String[] bookArr = new String[givenLibraryBooks.length];
        System.out.println("현재 대출 현황입니다.");
        for (int i=0;i< bookArr.length;i++){
            bookArr[i] = givenLibraryBooks[i];
            System.out.printf("\n%d. %s",i,bookArr[i]);
        }
    }
}
