package com.inheritence.LibraryManagement;

//Superclass
class Book {
 String title;
 int publicationYear;

 // Constructor
 Book(String title, int publicationYear) {
     this.title = title;
     this.publicationYear = publicationYear;
 }

 // Method to display book information
 void displayInfo() {
     System.out.println("Book Title: " + title);
     System.out.println("Publication Year: " + publicationYear);
 }
}

