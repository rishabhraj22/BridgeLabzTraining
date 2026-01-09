package com.Artify;
abstract class Artwork implements IPurchasable {
    protected String title;
    protected String artist;
    protected double price;
    protected String licenseType;

    private String licensingTerms; // protected internally

    public Artwork(String title, String artist, double price, String licenseType) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
        this.licensingTerms = "Standard license usage only";
    }

    public Artwork(String title, String artist, double price, String licenseType, String preview) {
        this(title, artist, price, licenseType);
        System.out.println("Preview available for artwork: " + preview);
    }

    protected String getLicensingTerms() {
        return licensingTerms;
    }

    protected void setLicensingTerms(String terms) {
        this.licensingTerms = terms;
    }

    public void showArt() {
        System.out.println(title + " by " + artist + " | ₹" + price + " | License: " + licenseType);
    }

    @Override
    public abstract void purchase(User user);

    @Override
    public abstract void license(User user);
}
