package systemdesign.lld.librarymanagementsystem.strategy;

import systemdesign.lld.librarymanagementsystem.pojos.Book;
import java.util.List;1
import java.util.stream.Collectors;

public class AuthorSearchStrategy implements SearchStrategy {
    public List<Book> search(List<Book> books, String criteria) {
        return books.stream().filter(b -> b.getAuthor().contains(criteria)).collect(Collectors.toList());
    }
}
