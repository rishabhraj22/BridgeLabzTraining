package com.linkedlist.TextEditor;

public class UndoRedoManager {

    private TextState head;     // oldest state
    private TextState tail;     // latest state
    private TextState current;  // current editor state

    private final int MAX_HISTORY;
    private int size;

    public UndoRedoManager(int maxHistory) {
        this.MAX_HISTORY = maxHistory;
        this.size = 0;
    }

    /* Add new text state */
    public void addState(String content) {
        TextState newState = new TextState(content);

        // If we are in middle (after undo), discard redo history
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
            size = recalcSize();
        }

        if (head == null) {
            head = tail = current = newState;
            size = 1;
            return;
        }

        tail.next = newState;
        newState.prev = tail;
        tail = newState;
        current = newState;
        size++;

        // Enforce max history
        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    /* Undo operation */
    public void undo() {
        if (current == null || current.prev == null) {
            System.out.println("Nothing to undo");
            return;
        }
        current = current.prev;
    }

    /* Redo operation */
    public void redo() {
        if (current == null || current.next == null) {
            System.out.println("Nothing to redo");
            return;
        }
        current = current.next;
    }

    /* Display current content */
    public void displayCurrentState() {
        if (current == null) {
            System.out.println("Editor is empty");
        } else {
            System.out.println("Current Text: " + current.content);
        }
    }

    /* Helper to recalculate size after cutting redo history */
    private int recalcSize() {
        int count = 0;
        TextState temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

