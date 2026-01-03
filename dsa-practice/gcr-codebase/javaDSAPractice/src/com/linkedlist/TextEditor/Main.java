package com.linkedlist.TextEditor;

public class Main {

    public static void main(String[] args) {

        UndoRedoManager editor = new UndoRedoManager(10);

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");

        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.addState("Hello World!! (Edited)");
        editor.displayCurrentState();

        editor.redo(); // should not work
    }
}

