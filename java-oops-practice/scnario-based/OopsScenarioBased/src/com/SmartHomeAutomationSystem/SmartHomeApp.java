package com.SmartHomeAutomationSystem;

public class SmartHomeApp {
    public static void main(String[] args) {

        Appliance light = new Light(1);
        Appliance fan = new Fan(2, 3);
        Appliance ac = new AC(3, 22);

        UserController controller = new UserController();

        controller.operate(light, true);
        controller.operate(fan, true);
        controller.operate(ac, true);

        light.showStatus();
        fan.showStatus();
        ac.showStatus();

        System.out.println("\nEnergy Comparison:");
        controller.compareEnergy(light, ac);
    }
}

