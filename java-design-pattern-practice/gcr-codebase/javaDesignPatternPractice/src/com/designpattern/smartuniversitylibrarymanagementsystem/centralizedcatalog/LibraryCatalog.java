package com.designpattern.smartuniversitylibrarymanagementsystem.centralizedcatalog;
public class LibraryCatalog {

    // Step 1: private static instance (single object)
    private static LibraryCatalog instance;

    // Step 2: private constructor (no one can create object from outside)
    private LibraryCatalog() {
        System.out.println("LibraryCatalog instance created.");
    }

    // Step 3: public method to provide global access point
    public static synchronized LibraryCatalog getInstance() {
        if (instance == null) {
            instance = new LibraryCatalog();
        }
        return instance;
    }

    // Some sample behavior
    public void showMessage() {
        System.out.println("Accessing the centralized Library Catalog...");
    }
}
