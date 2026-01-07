package com.ParkEase;
import java.util.ArrayList;
import java.util.List;

class BookingLog {
    private List<String> logs = new ArrayList<>();

    public void addLog(String entry) {
        logs.add(entry);
    }

    public void showLogs() {
        System.out.println("\n--- Parking Logs ---");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}
