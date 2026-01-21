package com.MovieTime;
public class Show {

    private String movieName;
    private int showTime; // HHMM format (e.g., 1430 = 2:30 PM)

    public Show(String movieName, int showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
    }

    public int getShowTime() {
        return showTime;
    }

    public void display() {
        System.out.println(
            "Movie: " + movieName +
            ", Show Time: " + formatTime(showTime)
        );
    }

    private String formatTime(int time) {
        int h = time / 100;
        int m = time % 100;
        return String.format("%02d:%02d", h, m);
    }
}
