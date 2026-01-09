package com.TourMate;
class DomesticTrip extends Trip {

    public DomesticTrip(String destination, int duration, Hotel hotel, Transport transport, Activity activity) {
        super(destination, duration, hotel, transport, activity);
    }

    @Override
    public void bookTrip() {
        System.out.println("🇮🇳 Booking Domestic Trip to " + destination);
        hotel.book();
        transport.book();
        activity.book();
    }

    @Override
    public void cancelTrip() {
        System.out.println("🇮🇳 Cancelling Domestic Trip to " + destination);
        hotel.cancel();
        transport.cancel();
        activity.cancel();
    }
}
