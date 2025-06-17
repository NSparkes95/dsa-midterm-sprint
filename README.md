# To-Do List Manager (DSA Sprint Project)

This project is a Java-based To-Do List Manager built from scratch using a custom singly linked list data structure, as required by the Summer 2025 DSA Sprint assignment.

## 📚 Features

- Add tasks to a user's to-do list at any position (head, middle, or tail)
- Search for tasks by description
- Mark tasks as completed
- Display all tasks for a user, showing completion status
- Singly linked list implementation (no Java collections used)

## 🗂️ Folder Structure

dsa-midterm-sprint/
└── src/

    └── todo/
        ├── Main.java
        ├── Task.java
        ├── TaskList.java
        └── User.java
└── README.md

## 🔗 Class Overview

- **Task**: Stores a task's description and completion status.
- **TaskList**: Implements a singly linked list of tasks with methods for insertion, search, traversal, and marking as completed.
- **User**: Contains a user's name and their personal TaskList.
- **Main**: Demonstrates the program with example usage.

## 🚀 How to Run

1. **Open the project in IntelliJ IDEA (or any Java IDE).**
2. Make sure the `src/` directory is marked as "Sources Root".
3. Ensure all Java files are in the `src/todo/` directory and use the `package todo;` declaration.
4. Build the project.
5. Right-click on `Main.java` and select `Run 'Main.main()'`.

## 📝 Example Usage

The provided `Main.java` demonstrates the following:
- Creating a user
- Adding several tasks (at various positions)
- Searching for a task by description
- Marking a task as completed
- Printing the current to-do list with status

**Sample output:**
Initial Task List:

Buy groceries [Pending]

Finish assignment [Pending]

Clean room [Pending]

Go for a run [Pending]

Searching for 'Clean room':
Task found at index: 2: Clean room [Pending]

Marking 'Buy groceries' as completed:

Updated Task List:

Buy groceries [Completed]

Finish assignment [Pending]

Clean room [Pending]

Go for a run [Pending]

yaml
Copy
Edit

## ⚠️ Assignment Requirements

- All list operations (add, search, mark complete, traverse) use your own singly linked list implementation (`TaskList`), **not** built-in Java collections.
- Node structure and pointer logic are fully custom.
- Clean, object-oriented design using `User`, `Task`, and `TaskList` classes.
- Clear output in the console for each operation.

## 🙌 Author

- Nicole Sparkes
- [GitHub Repo](https://github.com/NSparkes95/dsa-midterm-sprint)

---
