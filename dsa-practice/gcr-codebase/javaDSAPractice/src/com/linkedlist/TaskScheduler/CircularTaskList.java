package com.linkedlist.TaskScheduler;

public class CircularTaskList {

    private Task head;
    private Task current; // for scheduler rotation

    /* 1. Add at Beginning */
    public void addAtBeginning(int id, String name, int priority, String dueDate) {
        Task newNode = new Task(id, name, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        Task temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    /* 2. Add at End */
    public void addAtEnd(int id, String name, int priority, String dueDate) {
        Task newNode = new Task(id, name, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        Task temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    /* 3. Add at Specific Position (1-based index) */
    public void addAtPosition(int position, int id, String name, int priority, String dueDate) {

        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        Task temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        Task newNode = new Task(id, name, priority, dueDate);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    /* 4. Remove Task by ID */
    public void removeByTaskId(int id) {
        if (head == null) {
            System.out.println("Task list is empty");
            return;
        }

        if (head.taskId == id && head.next == head) {
            head = null;
            current = null;
            System.out.println("Task removed");
            return;
        }

        Task temp = head;
        Task prev = null;

        do {
            if (temp.taskId == id) {
                if (temp == head) {
                    Task last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = temp.next;
                }
                System.out.println("Task removed");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task not found");
    }

    /* 5. View Current Task and Move to Next */
    public void viewNextTask() {
        if (current == null) {
            System.out.println("No tasks available");
            return;
        }

        displayTask(current);
        current = current.next;
    }

    /* 6. Display All Tasks */
    public void displayAll() {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        Task temp = head;
        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    /* 7. Search by Priority */
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        Task temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No task found with given priority");
        }
    }

    private void displayTask(Task t) {
        System.out.println(
                "Task ID: " + t.taskId +
                ", Name: " + t.taskName +
                ", Priority: " + t.priority +
                ", Due Date: " + t.dueDate
        );
    }
}

