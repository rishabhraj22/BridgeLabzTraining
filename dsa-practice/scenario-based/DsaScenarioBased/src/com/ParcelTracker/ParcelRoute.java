package com.ParcelTracker;
public class ParcelRoute {

    private StageNode head;

    public ParcelRoute() {
        head = null;
    }

    // Add stage at end
    public void addStage(String stageName) {
        StageNode newNode = new StageNode(stageName);

        if (head == null) {
            head = newNode;
            System.out.println("Stage added as first stage: " + stageName);
            return;
        }

        StageNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        System.out.println("Stage added: " + stageName);
    }

    // Add custom checkpoint after a given stage
    public void addCheckpointAfter(String existingStage, String newStage) {

        if (head == null) {
            System.out.println("No stages available.");
            return;
        }

        StageNode temp = head;

        while (temp != null) {
            if (temp.stageName.equalsIgnoreCase(existingStage)) {

                StageNode newNode = new StageNode(newStage);
                newNode.next = temp.next;
                temp.next = newNode;

                System.out.println("Checkpoint added after " + existingStage + ": " + newStage);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Stage not found: " + existingStage);
    }

    // Track parcel forward
    public void trackParcel() {

        if (head == null) {
            System.out.println("No tracking information available.");
            return;
        }

        StageNode temp = head;
        System.out.println("Parcel Tracking Path:");

        while (temp != null) {
            System.out.println(temp.stageName);
            temp = temp.next;
        }
    }

    // Handle lost parcel (break link)
    public void markParcelLostAfter(String stageName) {

        if (head == null) {
            System.out.println("No stages available.");
            return;
        }

        StageNode temp = head;

        while (temp != null) {
            if (temp.stageName.equalsIgnoreCase(stageName)) {
                temp.next = null;
                System.out.println("Parcel marked lost after stage: " + stageName);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Stage not found: " + stageName);
    }
}
