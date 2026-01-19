package com.BagnBallOrganizer;
import java.util.ArrayList;

class Bag implements Storable {

    private String id;
    private String color;
    private int capacity;
    private ArrayList<Ball> balls = new ArrayList<>(); // has-a relationship

    public Bag(String id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
    }

    public String getId() {
        return id;
    }

    public int getBallCount() {
        return balls.size();
    }

    public boolean addBall(Ball ball) {
        if (balls.size() < capacity) {
            balls.add(ball);
            return true;
        }
        return false;
    }

    public boolean removeBall(String ballId) {
        for (Ball b : balls) {
            if (b.getId().equals(ballId)) {
                balls.remove(b);
                return true;
            }
        }
        return false;
    }

    public void displayBalls() {
        if (balls.isEmpty()) {
            System.out.println("No balls in this bag.");
            return;
        }

        System.out.println("\nBalls in Bag " + id + ":");
        for (Ball b : balls) {
            b.showInfo();
        }
    }

    @Override
    public void showInfo() {
        System.out.println("Bag ID: " + id +
                " | Color: " + color +
                " | Capacity: " + capacity +
                " | Current Balls: " + balls.size());
    }
}
