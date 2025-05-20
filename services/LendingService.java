package systemdesign.lld.librarymanagementsystem.services;

import systemdesign.lld.librarymanagementsystem.repository.BookRepository;
import systemdesign.lld.librarymanagementsystem.repository.PatronRepository;

public class LendingService {
    private final BookRepository bookRepo;
    private final PatronRepository patronRepo;
    private final EventPublisher publisher;

    public LendingService(BookRepository br, PatronRepository pr, EventPublisher ep) {
        this.bookRepo = br;
        this.patronRepo = pr;
        this.publisher = ep;
    }

    public void checkoutBook(String isbn, String patronId) {
        Book b = bookRepo.findByIsbn(isbn).orElseThrow();
        Patron p = patronRepo.findById(patronId).orElseThrow();
        b.setAvailable(false);
        LoanRecord lr = new LoanRecord(UUID.randomUUID().toString(), b, p, LocalDate.now());
        p.getHistory().add(lr);
        publisher.publish(new Event("BOOK_CHECKOUT", lr));
        log.info("Checked out {} to {}", isbn, patronId);
    }

    public void returnBook(String isbn, String patronId) {
        // Similar: mark available, set returnDate, publish RETURN event
    }
}
