package br.com.javalearn;

import br.com.javalearn.collections.TaskList;

/** Entry point for the Task List application. **/
public class Main {

    /**
     * Main method to demonstrate usage of the TaskList class.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        taskList.addTask("Buy milk");
        taskList.addTask("Study for the exam");
        taskList.addTask("Do exercises");

        System.out.println("You have " + taskList.getTotalTasks() + " tasks in the list.");
        taskList.printTaskDescriptions();

        taskList.removeTask("Work");

        System.out.println("Now you have " + taskList.getTotalTasks() + " tasks in the list.");
        taskList.printTaskDescriptions();

        taskList.removeTask("Study for the exam");

        System.out.println("Now you have " + taskList.getTotalTasks() + " tasks in the list.");
        taskList.printTaskDescriptions();
    }
}
