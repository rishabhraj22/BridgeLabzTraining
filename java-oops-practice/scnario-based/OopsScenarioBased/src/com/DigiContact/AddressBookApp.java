package com.DigiContact;
import java.util.Scanner;

public class AddressBookApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AddressBook book = new AddressBook();

        int choice;

        System.out.println("📒 Welcome to DigiContact Address Book");

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Search by City/State");
            System.out.println("5. Display All Contacts");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("First Name: ");
                    String fn = sc.nextLine();
                    System.out.print("Last Name: ");
                    String ln = sc.nextLine();
                    System.out.print("Phone: ");
                    String phone = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    System.out.print("City (optional): ");
                    String city = sc.nextLine();
                    System.out.print("State (optional): ");
                    String state = sc.nextLine();
                    System.out.print("Zip (optional): ");
                    String zip = sc.nextLine();

                    Address addr = null;
                    if (!city.isEmpty()) {
                        addr = new Address(city, state, zip);
                    }

                    Contact contact = new Contact(fn, ln, phone, email, addr);

                    if (book.addContact(contact)) {
                        System.out.println("✅ Contact added successfully.");
                    } else {
                        System.out.println("❌ Duplicate contact exists.");
                    }
                    break;

                case 2:
                    System.out.print("Enter full name to edit: ");
                    String ename = sc.nextLine();

                    System.out.print("New Phone: ");
                    String nphone = sc.nextLine();
                    System.out.print("New Email: ");
                    String nemail = sc.nextLine();

                    System.out.print("New City: ");
                    String ncity = sc.nextLine();
                    System.out.print("New State: ");
                    String nstate = sc.nextLine();
                    System.out.print("New Zip: ");
                    String nzip = sc.nextLine();

                    Address newAddr = new Address(ncity, nstate, nzip);

                    if (book.editContact(ename, nphone, nemail, newAddr)) {
                        System.out.println("✏️ Contact updated.");
                    } else {
                        System.out.println("❌ Contact not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter full name to delete: ");
                    String dname = sc.nextLine();

                    if (book.deleteContact(dname)) {
                        System.out.println("🗑 Contact deleted.");
                    } else {
                        System.out.println("❌ Contact not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter City or State: ");
                    String search = sc.nextLine();
                    book.searchByCityOrState(search);
                    break;

                case 5:
                    book.displaySorted();
                    break;

                case 6:
                    System.out.println("👋 Thank you for using DigiContact!");
                    break;

                default:
                    System.out.println("❌ Invalid choice");
            }

        } while (choice != 6);

        sc.close();
    }
}
