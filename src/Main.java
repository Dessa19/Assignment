import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Media media = new Media("Black Panther","PG-13","Rayn Coogler");

        System.out.println(media.getTitle());
        System.out.println(media.getRating());
        System.out.println(media.getDirector());

        ArrayList<String> casts = new ArrayList<String>();
        casts.add("Chadwick");
        casts.add("Shuri");
        casts.add("Erik Killmonger");
        casts.add("Ramonda");
        casts.add("W'kabi");
        casts.add("OKoye");
        casts.add("Dessa");

        // remove methods
        casts.remove("Dessa");

        System.out.println(casts);



        Movie movie = new Movie(2.15, "large felines",1.35);
        System.out.println(movie.getLength() + " hours");
        System.out.println(movie.getDescription());
        System.out.println("$" + movie.getGrossing() + " Billion");

        TvShow tvShow = new TvShow(5,7);
        System.out.println(tvShow.getSeasons());
        System.out.println(tvShow.getEpisodes());




    }
}