package com.GameBox;
import java.util.ArrayList;
import java.util.List;

class User {
    private String name;
    private double walletBalance;
    private List<Game> ownedGames = new ArrayList<>(); // protected list

    public User(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
    }

    public String getName() {
        return name;
    }

    public boolean deductBalance(double amount) {
        if (walletBalance >= amount) {
            walletBalance -= amount;
            return true;
        }
        return false;
    }

    protected void addGame(Game game) {
        ownedGames.add(game);
    }

    public void showOwnedGames() {
        System.out.println("\n--- Owned Games ---");
        if (ownedGames.isEmpty()) {
            System.out.println("No games owned yet.");
        } else {
            for (Game g : ownedGames) {
                System.out.println(g.title + " (" + g.genre + ")");
            }
        }
    }

    public void showWallet() {
        System.out.println("💰 Wallet Balance: ₹" + walletBalance);
    }
}
