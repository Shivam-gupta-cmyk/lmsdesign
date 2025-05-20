package systemdesign.lld.librarymanagementsystem.strategy;

import systemdesign.lld.librarymanagementsystem.pojos.Book;
import java.util.List;

public interface SearchStrategy {
    List<Book> search(List<Book> books, String criteria);
}
