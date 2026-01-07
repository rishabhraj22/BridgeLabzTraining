package com.BookBazaar;
import java.util.ArrayList;
import java.util.List;

class Order {
    private User user;
    private List<Book> books = new ArrayList<>();
    private List<Integer> quantities = new ArrayList<>();
    private String status = "Created"; // protected

    public Order(User user) {
        this.user = user;
    }

    public void addBook(Book book, int qty) {
        if (book.reduceStock(qty)) {
            books.add(book);
            quantities.add(qty);
            System.out.println("Added " + qty + " copy(ies) of " + book.title);
        } else {
            System.out.println("❌ Not enough stock for " + book.title);
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < books.size(); i++) {
            total += books.get(i).price * quantities.get(i);
        }
        return total;
    }

    public double calculateDiscount() {
        double discount = 0;
        for (int i = 0; i < books.size(); i++) {
            double itemTotal = books.get(i).price * quantities.get(i);
            discount += books.get(i).applyDiscount(itemTotal);
        }
        return discount;
    }

    public void placeOrder() {
        status = "Placed";
        System.out.println("Order placed successfully for " + user.getName());
    }

    public void showOrderDetails() {
        System.out.println("\n--- Order Details ---");
        System.out.println("Customer: " + user.getName());
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).title + " | Qty: " + quantities.get(i));
        }
        System.out.println("Order Status: " + status);
    }
}
