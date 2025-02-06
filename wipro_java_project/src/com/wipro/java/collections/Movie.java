package com.wipro.java.collections;
import java.util.*;

public class Movie implements Comparable<Movie>{
	// Fields for movie name, movie rating, and movie release year
    String movieName;
    double movieRating;
    int movieReleaseYear;

    // Constructor to initialize movie details
    public Movie(String movieName, double movieRating, int movieReleaseYear) {
        this.movieName = movieName;
        this.movieRating = movieRating;
        this.movieReleaseYear = movieReleaseYear;
    }

    // Getter for movieName
    public String getMovieName() {
        return movieName;
    }

    // Getter for movieRating
    public double getMovieRating() {
        return movieRating;
    }

    // Getter for movieReleaseYear
    public int getMovieReleaseYear() {
        return movieReleaseYear;
    }

    // Implementing the compareTo method from Comparable interface
    public int compareTo(Movie otherMovie) {
        // Compare based on movieRating (ascending order)
        if (this.movieRating < otherMovie.movieRating) {
            return -1;
        } else if (this.movieRating > otherMovie.movieRating) {
            return 1;
        } else {
            return 0;
        }
    }

    // Overriding toString method to print movie details
    @Override
    public String toString() {
        return "Movie Name: " + movieName + ", Rating: " + movieRating + ", Release Year: " + movieReleaseYear;
    }

    public static void main(String[] args) {
        // Create a list of movies
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Baahubali", 6.9, 2018));
        movieList.add(new Movie("Gunturu Kaaram", 7.0, 2021));
        movieList.add(new Movie("sarkaru Vaaripaata", 8.1, 2022));
        movieList.add(new Movie("Daaku Maharaj", 8.9, 2023));
        movieList.add(new Movie("Skanda", 9.7, 2024));

        // Before sorting: print the original list
        System.out.println("Movies before sorting by rating:");
        for (Movie movie : movieList) {
            System.out.println(movie);
        }

        // Sorting the movies by rating (using compareTo method)
        Collections.sort((ArrayList<Movie>) movieList);

        // After sorting: print the sorted list
        System.out.println("\nMovies after sorting by rating:");
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
    }
}