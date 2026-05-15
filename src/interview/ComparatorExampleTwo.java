package interview;


//Java program to demonstrate Comparator interface
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie {
 private String moviename; 
 private double rating; 
 private int year;    

 // Constructor to initialize movie details
 public Movie(String moviename, double rating, int year) {
     this.moviename = moviename;
     this.rating = rating;
     this.year = year;
 }

 // Getter methods 
 public String getMovieName() { 
   return moviename; 
 } 
 public double getRating() { 
   return rating; 
 } 
 public int getYear() { 
   return year; 
 }    
}

//Comparator to sort movies by rating
class Rating implements Comparator<Movie> {
 public int compare(Movie m1, Movie m2) {
   
     // Sort by rating in descending order
     return Double.compare(m2.getRating(), m1.getRating());
 }
}

//Comparator to sort movies by name
class NameCompare implements Comparator<Movie> {
 public int compare(Movie m1, Movie m2) {
   
     // Sort by name in alphabetical order
     return m1.getMovieName().compareTo(m2.getMovieName()); 
 }
}

//Main class 
public class ComparatorExampleTwo {
 public static void main(String[] args) {
   
     // Create a list of movies 
     ArrayList<Movie> movielist = new ArrayList<>();
     movielist.add(new Movie("Force Awakens", 8.3, 2015));
     movielist.add(new Movie("Star Wars", 8.7, 1977));
     movielist.add(new Movie("Empire Strikes Back", 8.8, 1980));

     // Sort movies by rating and display all
     Collections.sort(movielist, new Rating());
     System.out.println("Movies sorted by rating:");
     for (Movie m1 : movielist) {
         System.out.println(m1.getRating() + " " + m1.getMovieName() + " " + m1.getYear());
     }

     // Sort movies by name and display all
     Collections.sort(movielist, new NameCompare());
     System.out.println("\nMovies sorted by name:");
     for (Movie m1 : movielist) {
         System.out.println(m1.getMovieName() + " " + m1.getRating() + " " + m1.getYear());
     }
 }
}