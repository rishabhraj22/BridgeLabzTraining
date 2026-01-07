package com.ParkEase;
class ParkingSlot {
    private int slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;

    public ParkingSlot(int slotId, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public String getVehicleTypeAllowed() {
        return vehicleTypeAllowed;
    }

    public int getSlotId() {
        return slotId;
    }

    public void occupy() {
        isOccupied = true;
    }

    public void release() {
        isOccupied = false;
    }
}
