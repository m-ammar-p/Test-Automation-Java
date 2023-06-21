package payload;

public class AuthorsAPIPage {


    public int id;
    public int idBook;
    public String firstName;
    public String lastName;

    public AuthorsAPIPage(int id, int idBook, String firstName, String lastName){

        this.id = id;
        this.idBook = idBook;
        this.firstName = firstName;
        this.lastName = lastName;

    } // Constructor AuthorsAPIPage

    // Getter Methods
    public int getId() {
        return id;
    }

    public int getIdBook() {
        return idBook;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Setter Methods

    public void setId(int id) {
        this.id = id;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
} // AuthorsAPIPage
