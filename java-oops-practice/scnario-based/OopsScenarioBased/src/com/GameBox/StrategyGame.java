package com.GameBox;
class StrategyGame extends Game {

    public StrategyGame(String title, double price, double rating) {
        super(title, "Strategy", price, rating);
    }

    @Override
    public void download(User user) {
        if (price == 0 || user.deductBalance(price)) {
            user.addGame(this);
            System.out.println("🧠 Strategy game downloaded: " + title);
        } else {
            System.out.println("❌ Not enough balance to download " + title);
        }
    }

    @Override
    public void playDemo() {
        System.out.println("🧠 Playing tactical demo of Strategy game: " + title);
    }
}
