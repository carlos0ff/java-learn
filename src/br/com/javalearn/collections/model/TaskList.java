package model;

import java.util.ArrayList;
import java.util.List;

import br.com.javalearn.collections.*;

/**
 * Manages a list of tasks, allowing basic operations such as
 * adding, removing, listing, and counting tasks.
 * 
 * @author Your Name
 * @version 1.0
 * @since 2023-11-20
 */
public class TaskList {

    /** List of tasks **/
    /** */
    private List<Task> taskList;

    /** Constructor that initializes the task list. **/
   
    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    /**
     * Adds a task to the list.
     * @param description The description of the task to add.
     */
    public void addTask(String description) {
        taskList.add(new Task(description));
    }

    /**
     * Removes all tasks with the given description.
     * @param description The description of the task(s) to remove.
     */
    public void removeTask(String description) {
        List<Task> tasksToRemove = new ArrayList<>();

        if (!taskList.isEmpty()) {

            for (Task task : taskList) {
                if (task.getDescription().equalsIgnoreCase(description)) {
                    tasksToRemove.add(task);
                }
            }

            if (!tasksToRemove.isEmpty()) {
                taskList.removeAll(tasksToRemove);
                System.out.println("Removed task(s) with description: \"" + description + "\"");
            } else {
                System.out.println("No task found with description: \"" + description + "\"");
            }
            
        } else {
            System.out.println("The task list is empty!");
        }
    }

    /**
     * Returns the total number of tasks currently in the list.
     * @return The number of tasks.
     */
    public int getTotalTasks() {
        return taskList.size();
    }

    /** Prints the descriptions of all tasks in the list. **/
    public void printTaskDescriptions() {

        if (!taskList.isEmpty()) {
            System.out.println("Task List:");
            for (Task task : taskList) {
                System.out.println("- " + task.getDescription());
            }
        } else {
            System.out.println("The task list is empty!");
        }
    }

    
}
