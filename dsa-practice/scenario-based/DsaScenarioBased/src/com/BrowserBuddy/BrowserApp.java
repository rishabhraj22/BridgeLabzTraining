package com.BrowserBuddy;
import java.util.Scanner;

public class BrowserApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BrowserTab tab = new BrowserTab();
        ClosedTabStack closedTabStack = new ClosedTabStack();

        int choice;

        do {
            System.out.println("\n----- BrowserBuddy Menu -----");
            System.out.println("1. Visit New Page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Close Current Tab");
            System.out.println("5. Reopen Closed Tab");
            System.out.println("6. Show Current Page");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter URL: ");
                    String url = sc.nextLine();
                    tab.visitPage(url);
                    break;

                case 2:
                    tab.goBack();
                    break;

                case 3:
                    tab.goForward();
                    break;

                case 4:
                    String currentPage = tab.getCurrentPage();
                    closedTabStack.closeTab(currentPage);
                    break;

                case 5:
                    String reopenedPage = closedTabStack.reopenTab();
                    if (reopenedPage != null) {
                        tab.visitPage(reopenedPage);
                    }
                    break;

                case 6:
                    System.out.println("Current Page: " + tab.getCurrentPage());
                    break;

                case 7:
                    System.out.println("Exiting BrowserBuddy.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}
