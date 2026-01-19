package com.CinemaHouse;
public class MovieShow {

    private String movieName;
    private int showTime; // time in 24-hour format, e.g., 1430 = 2:30 PM

    public MovieShow(String movieName, int showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
    }

    public int getShowTime() {
        return showTime;
    }

    public void display() {
        System.out.println("Movie: " + movieName + ", Show Time: " + formatTime(showTime));
    }

    private String formatTime(int time) {
        int hours = time / 100;
        int minutes = time % 100;
        return String.format("%02d:%02d", hours, minutes);
    }
}
