package com.Artify;
class DigitalArt extends Artwork {

    public DigitalArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
        setLicensingTerms("Digital use only, no redistribution");
    }

    @Override
    public void purchase(User user) {
        if (user.deductBalance(price)) {
            System.out.println("✅ Digital artwork purchased: " + title);
        } else {
            System.out.println("❌ Insufficient wallet balance to buy " + title);
        }
    }

    @Override
    public void license(User user) {
        double licenseFee = price * 0.5;
        if (user.deductBalance(licenseFee)) {
            System.out.println("📜 Digital art licensed: " + title);
            System.out.println("Terms: " + getLicensingTerms());
        } else {
            System.out.println("❌ Insufficient wallet balance to license " + title);
        }
    }
}
