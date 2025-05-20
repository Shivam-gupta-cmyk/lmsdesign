package librarymanagementsystem.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import librarymanagementsystem.pojos.Book;

public class BookRepository {
    private final Map<String, Book> bookStore = new HashMap();

    public void add(Book book) {
        bookStore.put(book.getIsbn(), book);
    }

    public void remove(Book book) {
        bookStore.remove(book.getIsbn());
    }

    public void update(Book book) {
        bookStore.put(book.getIsbn(), book);
    }

    public List<Book> findAllBooks() {
        return new ArrayList<>(bookStore.values());
    }

}
