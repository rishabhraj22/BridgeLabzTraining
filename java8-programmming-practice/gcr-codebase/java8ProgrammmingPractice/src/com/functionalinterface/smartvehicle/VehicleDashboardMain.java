package com.functionalinterface.smartvehicle;
import java.util.Scanner;

public class VehicleDashboardMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Vehicle: 1.Petrol Car  2.Electric Car");
        int choice = sc.nextInt();

        System.out.print("Enter speed: ");
        int speed = sc.nextInt();

        VehicleDashboard vehicle;

        if (choice == 1) {
            vehicle = new PetrolCar();
            vehicle.displaySpeed(speed);
        } else {
            vehicle = new ElectricCar();
            vehicle.displaySpeed(speed);

            System.out.print("Enter battery percentage: ");
            int battery = sc.nextInt();
            vehicle.displayBattery(battery);
        }

        sc.close();
    }
}
