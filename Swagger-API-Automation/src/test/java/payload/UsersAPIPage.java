package payload;

public class UsersAPIPage {
    private int id;
    private String userName;
    private String password;

    public UsersAPIPage(int id, String userName, String password){

        this.id = id;
        this.userName = userName;
        this.password = password;
    } // Constructor UsersAPIPage

    // Getter Methods

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    // Setter Methods

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
} // UsersAPIPage
