package com.BrowserBuddy;
public class BrowserTab {

    private HistoryNode head;
    private HistoryNode current;

    public BrowserTab() {
        head = null;
        current = null;
    }

    // Visit a new page
    public void visitPage(String url) {
        HistoryNode newNode = new HistoryNode(url);

        if (head == null) {
            head = newNode;
            current = newNode;
        } else {
            // Remove forward history
            if (current.next != null) {
                current.next.prev = null;
            }

            current.next = newNode;
            newNode.prev = current;
            current = newNode;
        }

        System.out.println("Visited: " + url);
    }

    // Go back
    public void goBack() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Back to: " + current.url);
        } else {
            System.out.println("No previous page available.");
        }
    }

    // Go forward
    public void goForward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Forward to: " + current.url);
        } else {
            System.out.println("No next page available.");
        }
    }

    public String getCurrentPage() {
        if (current != null) {
            return current.url;
        }
        return "No page open.";
    }
}
