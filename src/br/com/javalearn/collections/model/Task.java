package model;


/**
 * 
 * @author Your Name
 * @version 1.0
 * @since 2023-11-20
 */
public class Task {

    private String description;

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
    @Override
    public String toString() {
        return description;
    }
}
