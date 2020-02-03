package movies;

import util.Input;
import movies.MoviesApplication;
import movies.MoviesArray;

public class Movie {
    public static void main(String[] args) {

    }

    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getMovie() {
        return this.name + " " + this.category;
    }

    public String setName(String name) {
        name = this.name;
        return name;
    }

    public String setCategory(String category) {
        category = this.category;
        return name + " " + category;
    }

    public String setMovie(String name, String category) {
        name = this.name;
        category = this.category;
        return name + " " + category;
    }


}
