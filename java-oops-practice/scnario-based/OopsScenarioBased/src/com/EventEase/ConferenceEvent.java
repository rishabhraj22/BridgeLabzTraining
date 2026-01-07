package com.EventEase;
class ConferenceEvent extends Event {

    public ConferenceEvent(int eventId, String eventName, String location, String date,
                            int attendees, double venueCost, double serviceCost, double discount) {
        super(eventId, eventName, location, date, attendees, venueCost, serviceCost, discount);
    }

    @Override
    public void schedule() {
        System.out.println("🎤 Conference Event Scheduled Successfully!");
        printDetails();
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("🎤 Conference Event Rescheduled to: " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("🎤 Conference Event Cancelled.");
    }

    @Override
    public void printDetails() {
        System.out.println("\nEvent ID: " + getEventId());
        System.out.println("Type: Conference");
        System.out.println("Name: " + eventName);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Attendees: " + attendees);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }
}
