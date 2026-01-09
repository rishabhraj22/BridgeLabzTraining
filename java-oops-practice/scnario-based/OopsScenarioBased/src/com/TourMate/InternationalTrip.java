package com.TourMate;
class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration, Hotel hotel, Transport transport, Activity activity) {
        super(destination, duration, hotel, transport, activity);
    }

    @Override
    public void bookTrip() {
        System.out.println("🌍 Booking International Trip to " + destination);
        System.out.println("Passport & Visa verification completed.");
        hotel.book();
        transport.book();
        activity.book();
    }

    @Override
    public void cancelTrip() {
        System.out.println("🌍 Cancelling International Trip to " + destination);
        hotel.cancel();
        transport.cancel();
        activity.cancel();
    }
}
