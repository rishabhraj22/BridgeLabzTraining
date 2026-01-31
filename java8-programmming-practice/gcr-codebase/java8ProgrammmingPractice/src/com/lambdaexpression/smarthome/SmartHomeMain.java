package com.lambdaexpression.smarthome;
import java.util.Scanner;

public class SmartHomeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SmartLightSystem system = new SmartLightSystem();

        System.out.println("Choose trigger:");
        System.out.println("1. Motion detected");
        System.out.println("2. Night time");
        System.out.println("3. Voice command");
        int choice = sc.nextInt();

        if (choice == 1) {
            system.runAction(() -> System.out.println("Lights ON at 100% brightness"));
        } 
        else if (choice == 2) {
            system.runAction(() -> System.out.println("Lights ON at 30% warm mode"));
        } 
        else if (choice == 3) {
            system.runAction(() -> System.out.println("Lights ON as per voice command"));
        } 
        else {
            System.out.println("Invalid trigger!");
        }

        sc.close();
    }
}
