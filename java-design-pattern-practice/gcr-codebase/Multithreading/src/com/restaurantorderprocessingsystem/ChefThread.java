package com.restaurantorderprocessingsystem;
public class ChefThread extends Thread {

    private String dishName;
    private int totalTimeMillis; // total cooking time

    public ChefThread(String chefName, String dishName, int totalTimeMillis) {
        this.setName(chefName);   // Set thread name as Chef name
        this.dishName = dishName;
        this.totalTimeMillis = totalTimeMillis;
    }

    @Override
    public void run() {
        System.out.println(getName() + " started preparing " + dishName);

        int[] progressSteps = {25, 50, 75, 100};
        int stepTime = totalTimeMillis / progressSteps.length;

        for (int progress : progressSteps) {
            try {
                Thread.sleep(stepTime); // simulate cooking time
            } catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted while cooking " + dishName);
            }

            System.out.println(getName() + " preparing " + dishName + ": " + progress + "% complete");
        }

        System.out.println(getName() + " finished preparing " + dishName + "\n");
    }
}
