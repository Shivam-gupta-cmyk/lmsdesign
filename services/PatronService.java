package systemdesign.lld.librarymanagementsystem.services;

import systemdesign.lld.librarymanagementsystem.repository.PatronRepository;

public class PatronService {
    private final PatronRepository repo;

    public PatronService(PatronRepository repo) {
        this.repo = repo;
    }

    public void registerPatron(PatronRepository p) {
        repo.addPatron(p);
        log.info("Patron registered: {}", p.getId());
    }

    public void updatePatron(PatronRepository p) {
        repo.update(p);
        log.info("Patron updated: {}", p.getId());
    }
}