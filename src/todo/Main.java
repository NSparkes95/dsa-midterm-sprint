package todo;

public class Main {
    public static void main(String[] args) {
        User user = new User("John");

        user.addTask("Buy apples", 0);
        user.addTask("Finish homework", 1);
        user.addTask("Make appt", 2);
        user.addTask("Go for a run", 3);

        System.out.println("Task List:");
        user.printTasks();

        System.out.println("\nSearching for 'apples':");
        user.searchTask("apples");

        System.out.println("\nMarking 'Buy apples' as done:");
        user.markTaskAsCompleted("Buy apples");

        System.out.println("\nUpdated Task List:");
        user.printTasks();
    }
}
