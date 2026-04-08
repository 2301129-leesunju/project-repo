
public class Main {
    public static void main(String[] args) {
        Member member = new Member(1,"홍길동","전자이해",20011101,"oooo@naver.com");
        Book book = new Book();
        Library library = new Library(book,member);

        library.LibrarySys();
        book.BookToLibrary(library);

    }
}