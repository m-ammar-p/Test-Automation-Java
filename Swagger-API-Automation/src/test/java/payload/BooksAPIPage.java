package payload;

public class BooksAPIPage {

    public int id;
    public String title;
    public String description;
    public int pageCount;
    public String excerpt;
    public String publishDate;

    public BooksAPIPage(int id, String title, String description, int pageCount, String excerpt, String publishDate){

        this.id = id;
        this.title = title;
        this.description = description;
        this.pageCount = pageCount;
        this.excerpt = excerpt;
        this.publishDate = publishDate;

    } // Constructor BooksAPIPage

    // Getter Methods

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public String getPublishDate() {
        return publishDate;
    }

    // Setter Methods

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
} // End of BooksAPIPage
