package Composition;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Director director = new Director("Luca","Guadagnino");

        ArrayList<String> cast = new ArrayList<>(Arrays.asList("Zendaya"));

        Media media = new Media("Challengers","R",director,cast);
        System.out.println("Movie Title: " + media.getTitle());
        System.out.println("Movie Rating: " + media.getRating());
        System.out.println("Movie Director: " + media.getDirector());
        System.out.println("Movie Casts: " + media.getCast());

        Movie movie = new Movie(2.11,"Love traingle b/n an injured tennis star-turned-coach.",94.2 );
        System.out.println("Movie Length: " + movie.getLength() + " hours");
        System.out.println("Movie Description: " + movie.getDescription());
        System.out.println("Movie Gross: $" + movie.getGrossing() + " Millions");

        TvShow tvShow = new TvShow(" The Penguin",8 );
        System.out.println("Tv Show Episodes: " + tvShow.getEpisodes());
        System.out.println("Tv Show Seasons: " + tvShow.getSeasons());
    }
}
