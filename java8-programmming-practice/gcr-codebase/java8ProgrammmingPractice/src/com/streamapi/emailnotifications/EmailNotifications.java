package com.streamapi.emailnotifications;
import java.util.*;

class EmailNotifications {

    private static void sendEmailNotification(String email) {
        System.out.println("Sending notification to: " + email);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of emails: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<String> emails = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter email " + (i + 1) + ": ");
            emails.add(sc.nextLine());
        }

        System.out.println("\nSending Emails:");

        emails.forEach(email -> sendEmailNotification(email));
    }
}
