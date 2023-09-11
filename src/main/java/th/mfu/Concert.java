package th.mfu;

import java.util.Date;

public class Concert {

    private int id; // Unique identifier for the concert
    private String title; // Name of the concert
    private String performer; // Name of the performer
    private Date date; // Date of the concert
    private String description; // Description of the concert

    // Default constructor
    public Concert() {
    }

    // Parameterized constructor
    public Concert(String title, String description) {
        this.title = title;
        this.description = description;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for performer
    public String getPerformer() {
        return performer;
    }

    // Setter for performer
    public void setPerformer(String performer) {
        this.performer = performer;
    }

    // Getter for date
    public Date getDate() {
        return date;
    }

    // Setter for date
    public void setDate(Date date) {
        this.date = date;
    }
}
