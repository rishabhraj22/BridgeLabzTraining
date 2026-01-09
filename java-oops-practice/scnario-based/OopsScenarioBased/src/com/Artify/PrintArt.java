package com.Artify;
class PrintArt extends Artwork {

    public PrintArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
        setLicensingTerms("Print use allowed, limited copies");
    }

    @Override
    public void purchase(User user) {
        if (user.deductBalance(price)) {
            System.out.println("✅ Print artwork purchased: " + title);
        } else {
            System.out.println("❌ Insufficient wallet balance to buy " + title);
        }
    }

    @Override
    public void license(User user) {
        double licenseFee = price * 0.3;
        if (user.deductBalance(licenseFee)) {
            System.out.println("📜 Print art licensed: " + title);
            System.out.println("Terms: " + getLicensingTerms());
        } else {
            System.out.println("❌ Insufficient wallet balance to license " + title);
        }
    }
}
