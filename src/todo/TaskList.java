package todo;

public class TaskList {
    public class Node {
        Task task;
        Node next;
    }

    public Node head;
    public Node tail;
    public int size;

    public Node createTaskList(Task task) {
        Node node = new Node();
        node.task = task;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertLinkedList(Task task, int location) {
        Node node = new Node();
        node.task = task;

        if(head == null) {
            createTaskList(task);
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public void traverseLinkedList() {
        if (head == null) {
            System.out.println("No tasks.");
            return;
        }
        Node current = head;
        while(current != null) {
            System.out.println("- " + current.task.toString());
            current = current.next;
        }
    }

    public void searchTask(String description) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.task.getDescription().equals(description)){
                System.out.println("Task found at index:" + index + ": " + current.task);
                return;
            }
            current = current.next;
            index++;
        }
        System.out.println("Task not found:" + description);
    }

    public void markTaskCompleted(String description) {
        Node current = head;
        while (current != null) {
            if(current.task.getDescription().equalsIgnoreCase(description)) {
                current.task.markCompleted();
                return;
            }
            current = current.next;
        }
        System.out.println("Task not found to mark as completed:" + description);
    }
}
