package librarymanagementsystem.pojos;

public class Book {
    private String id;
    private String name;
    private String isbn;
    private int publicationYear;

    public Book(String id, String name, String isbn, int publicationYear) {
        this.id = id;
        this.name = name;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

}
