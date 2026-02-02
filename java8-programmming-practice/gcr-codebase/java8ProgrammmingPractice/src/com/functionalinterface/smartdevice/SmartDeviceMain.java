package com.functionalinterface.smartdevice;
import java.util.Scanner;

public class SmartDeviceMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Device: 1.Light  2.AC  3.TV");
        int choice = sc.nextInt();

        SmartDevice device;

        if (choice == 1) {
            device = new Light();
        } else if (choice == 2) {
            device = new AC();
        } else {
            device = new TV();
        }

        device.turnOn();
        device.turnOff();

        sc.close();
    }
}
