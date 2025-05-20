package systemdesign.lld.librarymanagementsystem.services;

@Slf4j
public class BookService {
    private final BookRepository repo;
    private final SearchStrategy strategy;

    public BookService(BookRepository repo, SearchStrategy strategy) {
        this.repo = repo;
        this.strategy = strategy;
    }

    public void addBook(Book book) {
        repo.add(book);
        log.info("Book added: {}", book.getIsbn());
    }

    public void removeBook(String isbn) {
        repo.remove(isbn);
        log.info("Book removed: {}", isbn);
    }

    public void updateBook(Book book) {
        repo.update(book);
        log.info("Book updated: {}", book.getIsbn());
    }

    public List<Book> search(String criteria) {
        return strategy.search(repo.findAll(), criteria);
    }
}