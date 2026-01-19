package com.ArtExpo;
public class Artist {

    private int artistId;
    private String name;
    private int registrationTime; // HHMM format (e.g., 0930)

    public Artist(int artistId, String name, int registrationTime) {
        this.artistId = artistId;
        this.name = name;
        this.registrationTime = registrationTime;
    }

    public int getRegistrationTime() {
        return registrationTime;
    }

    public void display() {
        System.out.println(
            "Artist ID: " + artistId +
            ", Name: " + name +
            ", Registered At: " + formatTime(registrationTime)
        );
    }

    private String formatTime(int time) {
        int h = time / 100;
        int m = time % 100;
        return String.format("%02d:%02d", h, m);
    }
}
