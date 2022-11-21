package Task2;

public class Main {
    public static void main(String[] args) {
        Book book = new Book(1,"Title", "Author", 2);
        System.out.println(book.getId());
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getYearOfRelease());
        BookRepository b1 = new BookRepository();
        b1.addBooks(book);
        System.out.println(b1.findById(1));
        System.out.println(b1.findByName("Title"));
    }
}
