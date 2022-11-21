package Task2;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<Book> books = new ArrayList<>();

    public void addBooks(Book book) {
        books.add(book);
    }

    public void removeBooks(Book book) {
        books.remove(book);
    }

    public Book findByName(String name) {
        for (Book b : books) {
            if (b.getTitle().equals(name)) {
                return b;
            }
        }
        throw new NoBookfoundException("Cannot find book");
    }
    public Book findById(int id){
        for(Book b : books){
            if(b.getId()== id){
                return b;
            }
        }
        throw new NoBookfoundException("Cannot find by id");
    }
    public void removeById(int id){
        books.remove(findById(id));
    }
}
