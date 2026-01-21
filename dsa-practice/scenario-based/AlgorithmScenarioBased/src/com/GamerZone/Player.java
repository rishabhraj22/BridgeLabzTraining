package com.GamerZone;
public class Player {

    private String playerName;
    private int score;

    public Player(String playerName, int score) {
        this.playerName = playerName;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void display() {
        System.out.println("Player: " + playerName + ", Score: " + score);
    }
}
