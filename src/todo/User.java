package todo;

public class User {
    private String name;
    private TaskList taskList;

    public User(String name) {
        this.name = name;
        this.taskList = new TaskList();
    }

    public void addTask(String description, int location) {
        Task newTask = new Task(description);
        taskList.insertLinkedList(newTask, location);
    }

    public void markTaskAsCompleted(String description) {
        taskList.markTaskCompleted(description);
    }

    public void printTasks() {
        System.out.println("To-Do List for " + name + ":");
        taskList.traverseLinkedList();
    }

    public void searchTask(String description) {
        taskList.searchTask(description);
    }
}
