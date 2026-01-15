package com.BirdSanctuary;
import java.util.*;

class SanctuaryManager {

    private ArrayList<Bird> birds = new ArrayList<>();

    public void addBird(Bird bird) {
        birds.add(bird);
        System.out.println(" Bird added to sanctuary.");
    }

    public void displayAllBirds() {
        System.out.println("\n--- All Birds ---");
        for (Bird b : birds) {
            b.showInfo();
            b.eat();
            if (b instanceof Flyable) ((Flyable) b).fly();
            if (b instanceof Swimmable) ((Swimmable) b).swim();
            System.out.println("---------------------");
        }
    }

    public void displayFlyingBirds() {
        System.out.println("\n--- Flying Birds ---");
        for (Bird b : birds) {
            if (b instanceof Flyable) {
                b.showInfo();
                ((Flyable) b).fly();
            }
        }
    }

    public void displaySwimmingBirds() {
        System.out.println("\n--- Swimming Birds ---");
        for (Bird b : birds) {
            if (b instanceof Swimmable) {
                b.showInfo();
                ((Swimmable) b).swim();
            }
        }
    }

    public void displayBoth() {
        System.out.println("\n--- Flying & Swimming Birds ---");
        for (Bird b : birds) {
            if (b instanceof Flyable && b instanceof Swimmable) {
                b.showInfo();
            }
        }
    }

    public void deleteBirdById(String id) {
        Iterator<Bird> it = birds.iterator();
        boolean found = false;

        while (it.hasNext()) {
            Bird b = it.next();
            if (b.getId().equals(id)) {
                it.remove();
                found = true;
                System.out.println(" Bird removed.");
                break;
            }
        }

        if (!found) {
            System.out.println(" Bird not found.");
        }
    }

    public void sanctuaryReport() {
        int fly = 0, swim = 0, both = 0, neither = 0;

        for (Bird b : birds) {
            boolean f = b instanceof Flyable;
            boolean s = b instanceof Swimmable;

            if (f && s) both++;
            else if (f) fly++;
            else if (s) swim++;
            else neither++;
        }

        System.out.println("\n--- Sanctuary Report ---");
        System.out.println("Flyable: " + fly);
        System.out.println("Swimmable: " + swim);
        System.out.println("Both: " + both);
        System.out.println("Neither: " + neither);
    }

    // 🔍 Reflection + Annotation Usage
    public void showDeveloperInfo() {
        System.out.println("\n--- Developer Info (Using Reflection) ---");
        for (Bird b : birds) {
            Class<?> cls = b.getClass();
            if (cls.isAnnotationPresent(DeveloperInfo.class)) {
                DeveloperInfo info = cls.getAnnotation(DeveloperInfo.class);
                System.out.println("Class: " + cls.getSimpleName());
                System.out.println("Developer: " + info.name());
                System.out.println("Date: " + info.date());
                System.out.println("Purpose: " + info.purpose());
                System.out.println("-------------------------");
            }
        }
    }
}
