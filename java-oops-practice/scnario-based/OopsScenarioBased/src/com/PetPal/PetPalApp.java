package com.PetPal;
import java.util.Scanner;

public class PetPalApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("🐾 Welcome to PetPal – Virtual Pet Care");

        System.out.println("Choose Pet Type:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Bird");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Pet Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Pet Age: ");
        int age = sc.nextInt();

        System.out.print("Do you want to set custom hunger & energy? (yes/no): ");
        sc.nextLine();
        String opt = sc.nextLine();

        Pet pet;

        if (opt.equalsIgnoreCase("yes")) {
            System.out.print("Enter Hunger (0-100): ");
            int hunger = sc.nextInt();

            System.out.print("Enter Energy (0-100): ");
            int energy = sc.nextInt();

            if (choice == 1) pet = new Dog(name, age, hunger, energy);
            else if (choice == 2) pet = new Cat(name, age, hunger, energy);
            else pet = new Bird(name, age, hunger, energy);
        } else {
            if (choice == 1) pet = new Dog(name, age);
            else if (choice == 2) pet = new Cat(name, age);
            else pet = new Bird(name, age);
        }

        int action;
        do {
            System.out.println("\n--- Pet Actions Menu ---");
            System.out.println("1. Feed");
            System.out.println("2. Play");
            System.out.println("3. Sleep");
            System.out.println("4. Make Sound");
            System.out.println("5. Show Status");
            System.out.println("6. Exit");
            System.out.print("Choose action: ");
            action = sc.nextInt();

            switch (action) {
                case 1:
                    pet.feed();
                    break;
                case 2:
                    pet.play();
                    break;
                case 3:
                    pet.sleep();
                    break;
                case 4:
                    pet.makeSound();
                    break;
                case 5:
                    pet.showStatus();
                    break;
                case 6:
                    System.out.println("Goodbye! Take care of your pet 🐾");
                    break;
                default:
                    System.out.println("❌ Invalid option");
            }

        } while (action != 6);

        sc.close();
    }
}
