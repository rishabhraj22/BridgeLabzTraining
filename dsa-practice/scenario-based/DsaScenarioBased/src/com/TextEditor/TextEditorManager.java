package com.TextEditor;
import java.util.Stack;

public class TextEditorManager {

    private StringBuilder content;
    private Stack<Action> undoStack;
    private Stack<Action> redoStack;

    public TextEditorManager() {
        content = new StringBuilder();
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    // Insert text
    public void insertText(String text) {
        content.append(text);
        undoStack.push(new Action("insert", text));
        redoStack.clear();
        System.out.println("Text inserted.");
    }

    // Delete last n characters
    public void deleteText(int length) {

        if (length > content.length()) {
            System.out.println("Not enough text to delete.");
            return;
        }

        String deletedText = content.substring(content.length() - length);
        content.delete(content.length() - length, content.length());

        undoStack.push(new Action("delete", deletedText));
        redoStack.clear();
        System.out.println("Text deleted.");
    }

    // Undo last action
    public void undo() {

        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo.");
            return;
        }

        Action lastAction = undoStack.pop();

        if (lastAction.type.equals("insert")) {
            int len = lastAction.text.length();
            content.delete(content.length() - len, content.length());
            redoStack.push(lastAction);
        } else if (lastAction.type.equals("delete")) {
            content.append(lastAction.text);
            redoStack.push(lastAction);
        }

        System.out.println("Undo performed.");
    }

    // Redo last undone action
    public void redo() {

        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo.");
            return;
        }

        Action lastAction = redoStack.pop();

        if (lastAction.type.equals("insert")) {
            content.append(lastAction.text);
            undoStack.push(lastAction);
        } else if (lastAction.type.equals("delete")) {
            int len = lastAction.text.length();
            content.delete(content.length() - len, content.length());
            undoStack.push(lastAction);
        }

        System.out.println("Redo performed.");
    }

    // Show current content
    public void showContent() {
        System.out.println("Current Text: " + content.toString());
    }
}
