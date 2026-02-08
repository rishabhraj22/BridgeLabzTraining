package com.streamapi.trendingmovies;
import java.util.*;
import java.util.stream.*;

class Top5TrendingMovies {

    static class Movie {
        String name;
        double rating;
        int year;

        Movie(String name, double rating, int year) {
            this.name = name;
            this.rating = rating;
            this.year = year;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of movies: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Movie> movies = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter movie name: ");
            String name = sc.nextLine();
            System.out.print("Enter rating: ");
            double rating = sc.nextDouble();
            System.out.print("Enter release year: ");
            int year = sc.nextInt();
            sc.nextLine();

            movies.add(new Movie(name, rating, year));
        }

        System.out.println("\nTop 5 Trending Movies:");

        movies.stream()
                .filter(m -> m.rating >= 7.0) // you can tweak this condition
                .sorted(Comparator.comparingDouble((Movie m) -> m.rating)
                        .reversed()
                        .thenComparingInt(m -> m.year).reversed())
                .limit(5)
                .forEach(m -> System.out.println(m.name + " | Rating: " + m.rating + " | Year: " + m.year));
    }
}
