package com.TrainCompanion;
public class TrainRoute {

    private CompartmentNode head;
    private CompartmentNode tail;

    public TrainRoute() {
        head = null;
        tail = null;
    }

    // Add compartment at end
    public void addCompartment(String name) {
        CompartmentNode newNode = new CompartmentNode(name);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        System.out.println("Compartment added: " + name);
    }

    // Remove a compartment
    public void removeCompartment(String name) {
        if (head == null) {
            System.out.println("No compartments to remove.");
            return;
        }

        CompartmentNode temp = head;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {

                if (temp == head) {
                    head = temp.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else if (temp == tail) {
                    tail = temp.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Compartment removed: " + name);
                return;
            }

            temp = temp.next;
        }

        System.out.println("Compartment not found.");
    }

    // Traverse forward
    public void traverseForward() {
        if (head == null) {
            System.out.println("No compartments available.");
            return;
        }

        CompartmentNode temp = head;

        System.out.println("Train compartments (Forward):");
        while (temp != null) {
            System.out.println(temp.name);
            temp = temp.next;
        }
    }

    // Traverse backward
    public void traverseBackward() {
        if (tail == null) {
            System.out.println("No compartments available.");
            return;
        }

        CompartmentNode temp = tail;

        System.out.println("Train compartments (Backward):");
        while (temp != null) {
            System.out.println(temp.name);
            temp = temp.prev;
        }
    }

    // Show adjacent compartments
    public void showAdjacent(String name) {
        if (head == null) {
            System.out.println("No compartments available.");
            return;
        }

        CompartmentNode temp = head;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {

                if (temp.prev != null) {
                    System.out.println("Previous Compartment: " + temp.prev.name);
                } else {
                    System.out.println("No previous compartment.");
                }

                if (temp.next != null) {
                    System.out.println("Next Compartment: " + temp.next.name);
                } else {
                    System.out.println("No next compartment.");
                }

                return;
            }

            temp = temp.next;
        }

        System.out.println("Compartment not found.");
    }
}
