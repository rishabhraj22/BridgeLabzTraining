package com.BrowserBuddy;
import java.util.Stack;

public class ClosedTabStack {

    private Stack<String> closedTabs;

    public ClosedTabStack() {
        closedTabs = new Stack<>();
    }

    public void closeTab(String currentPage) {
        if (!currentPage.equals("No page open.")) {
            closedTabs.push(currentPage);
            System.out.println("Tab closed: " + currentPage);
        } else {
            System.out.println("No tab to close.");
        }
    }

    public String reopenTab() {
        if (!closedTabs.isEmpty()) {
            String page = closedTabs.pop();
            System.out.println("Reopened tab: " + page);
            return page;
        } else {
            System.out.println("No closed tabs to reopen.");
            return null;
        }
    }
}
