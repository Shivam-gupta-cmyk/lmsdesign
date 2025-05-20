package systemdesign.lld.librarymanagementsystem.strategy;

import systemdesign.lld.librarymanagementsystem.pojos.Book;
import java.util.List;
import java.util.stream.Collectors;

public class TitleSearchStrategy implements SearchStrategy {
    public List<Book> search(List<Book> books, String criteria) {
        return books.stream().filter(b -> b.getName().contains(criteria)).collect(Collectors.toList());
    }
}
