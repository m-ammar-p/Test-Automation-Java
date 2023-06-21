package payload;

public class ActivitiesAPIPage {
    public int id;
    public String title;
    public String dueDate;
    public boolean completed;

    // Constructor
    public ActivitiesAPIPage(int id, String title, String dueDate, boolean completed){

        this.id = id;
        this.title = title;
        this.dueDate = dueDate;
        this.completed = completed;

    } // Constructor Activities
    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

} // End of ActivitiesAPIPage
