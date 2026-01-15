package com.GameBox;
class ArcadeGame extends Game {

    public ArcadeGame(String title, double price, double rating) {
        super(title, "Arcade", price, rating);
    }

    @Override
    public void download(User user) {
        if (price == 0 || user.deductBalance(price)) {
            user.addGame(this);
            System.out.println("🎮 Arcade game downloaded: " + title);
        } else {
            System.out.println("❌ Not enough balance to download " + title);
        }
    }

    @Override
    public void playDemo() {
        System.out.println("🕹 Playing fast-paced demo of Arcade game: " + title);
    }
}
