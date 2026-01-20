package com.DigiContact;
import java.util.*;

class AddressBook {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public boolean addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(contact.getFullName())) {
                return false; // duplicate
            }
        }
        contacts.add(contact);
        return true;
    }

    public boolean deleteContact(String name) {
        Iterator<Contact> it = contacts.iterator();
        while (it.hasNext()) {
            if (it.next().getFullName().equalsIgnoreCase(name)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean editContact(String name, String phone, String email, Address address) {
        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(name)) {
                c.updateContact(phone, email, address);
                return true;
            }
        }
        return false;
    }

    public void searchByCityOrState(String value) {
        System.out.println("\n--- Search Results ---");
        for (Contact c : contacts) {
            Address a = c.getAddress();
            if (a != null &&
                (a.getCity().equalsIgnoreCase(value) ||
                 a.getState().equalsIgnoreCase(value))) {
                c.showContact();
            }
        }
    }

    public void displaySorted() {
        contacts.sort(Comparator.comparing(Contact::getFullName));
        System.out.println("\n--- All Contacts (Sorted) ---");
        for (Contact c : contacts) {
            c.showContact();
        }
    }
}
