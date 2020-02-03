package movies;

import util.Input;
import movies.MoviesArray;
import movies.Movie;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
//    public static void main(String[] args) {
//        MoviesArray movies = new MoviesArray();
//        System.out.println(Arrays.toString(MoviesArray.findAll()));
//        for (Movie movie : MoviesArray.findAll()) {
//            System.out.println("Movie: " + movie);
//            }
//        }

//    public static String toString(Movie[] movies) {
//        String[] movieStrings = Arrays.toString(movies.findAll());
//        return Arrays.toString(movieStrings);
//    }

    //Solution
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Movie[] movieList = new MoviesArray.findAll();
    }

}
