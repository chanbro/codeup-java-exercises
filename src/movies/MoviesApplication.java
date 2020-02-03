package movies;

import util.Input;
import movies.MoviesArray;
import movies.Movie;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Movies[] movies = new MoviesArray();
        System.out.println(Arrays.toString(movies.findAll()));
        for (Movie movie : MoviesArray.findAll())
            System.out.println(movie);
//        System.out.println(toString(movies));
    }

//    public static String toString(Movie[] movies) {
//        String[] movieStrings = Arrays.toString(movies.findAll());
//        return Arrays.toString(movieStrings);
//    }

}
