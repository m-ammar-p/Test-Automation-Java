package payload;

public class CoverPhotosAPIPage {

    public int id;
    public int idBook;
    public String url;

    public CoverPhotosAPIPage(int id, int idBook, String url){

        this.id = id;
        this.idBook = idBook;
        this.url = url;

    } // Constructor CoverPhotosAPIPage


    // Getter Methods

    public int getId() {
        return id;
    }

    public int getIdBook() {
        return idBook;
    }

    public String getUrl() {
        return url;
    }

    // Setter Methods

    public void setId(int id) {
        this.id = id;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public void setUrl(String url) {
        this.url = url;
    }

} // CoverPhotosAPIPage
