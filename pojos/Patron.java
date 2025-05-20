package librarymanagementsystem.pojos;

import java.util.List;

public class Patron {
    private String id;
    private String name;
    private String email;
    private List<LoanRecord> borrowingHistory;

    public Patron(String name, String email) {
        this.id = (int) (Math.random() * 100 + 10) + name;
        this.name = name;
        this.email = email;
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

}
