package com.functionalinterface.vehiclerental;
import java.util.Scanner;

public class VehicleRentalMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Vehicle: 1.Car  2.Bike  3.Bus");
        int choice = sc.nextInt();

        Vehicle vehicle;

        if (choice == 1) {
            vehicle = new Car();
        } else if (choice == 2) {
            vehicle = new Bike();
        } else {
            vehicle = new Bus();
        }

        vehicle.rent();
        vehicle.returnVehicle();

        sc.close();
    }
}
