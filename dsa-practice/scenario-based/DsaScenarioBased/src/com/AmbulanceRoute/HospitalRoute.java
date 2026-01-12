package com.AmbulanceRoute;
public class HospitalRoute {

    private UnitNode head;
    private UnitNode tail;

    public HospitalRoute() {
        head = null;
        tail = null;
    }

    // Add a new unit to circular list
    public void addUnit(String unitName, boolean available) {
        UnitNode newNode = new UnitNode(unitName, available);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Display all units
    public void displayUnits() {
        if (head == null) {
            System.out.println("No units available.");
            return;
        }

        UnitNode temp = head;

        do {
            System.out.println(temp.unitName + " | Available: " + temp.available);
            temp = temp.next;
        } while (temp != head);
    }

    // Find nearest available unit in circular manner
    public void findNearestAvailableUnit() {
        if (head == null) {
            System.out.println("No units in hospital route.");
            return;
        }

        UnitNode temp = head;
        boolean found = false;

        do {
            if (temp.available) {
                System.out.println("Redirect patient to: " + temp.unitName);
                found = true;
                break;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No available unit found. Please wait.");
        }
    }

    // Remove a unit (under maintenance)
    public void removeUnit(String unitName) {
        if (head == null) {
            System.out.println("No units to remove.");
            return;
        }

        UnitNode current = head;
        UnitNode prev = tail;

        do {
            if (current.unitName.equalsIgnoreCase(unitName)) {

                if (current == head && current == tail) {
                    head = null;
                    tail = null;
                } else {
                    prev.next = current.next;

                    if (current == head) {
                        head = current.next;
                        tail.next = head;
                    }

                    if (current == tail) {
                        tail = prev;
                        tail.next = head;
                    }
                }

                System.out.println("Unit removed: " + unitName);
                return;
            }

            prev = current;
            current = current.next;

        } while (current != head);

        System.out.println("Unit not found.");
    }

    // Update availability of unit
    public void updateAvailability(String unitName, boolean status) {
        if (head == null) {
            System.out.println("No units available.");
            return;
        }

        UnitNode temp = head;

        do {
            if (temp.unitName.equalsIgnoreCase(unitName)) {
                temp.available = status;
                System.out.println("Availability updated for " + unitName);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("Unit not found.");
    }
}
