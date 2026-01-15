package com.GameBox;
abstract class Game implements IDownloadable {
    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void applySeasonalOffer(double percent) {
        double discount = price * (percent / 100);
        price = price - discount; // operator usage
    }

    public void showGame() {
        System.out.println(title + " | " + genre + " | ₹" + price + " | Rating: " + rating);
    }

    @Override
    public abstract void download(User user);

    @Override
    public abstract void playDemo();
}
