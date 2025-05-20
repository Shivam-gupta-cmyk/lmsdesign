package librarymanagementsystem.pojos;

import java.time.LocalDate;

public class LoanRecord {
    private String id;
    private String bookName;
    private LocalDate checkOutDate;
    private LocalDate returnDate;

    LoanRecord(String bookName, LocalDate checkOutDate) {
        this.id = (int) (Math.random() * 100 + 10) + bookName;
        this.bookName = bookName;
        this.checkOutDate = checkOutDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public LocalDate getCheckOoutDate() {
        return checkOutDate;
    }

    public void setCheckOoutDate(LocalDate checkOoutDate) {
        this.checkOutDate = checkOoutDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

}
