package Composition;

import java.util.ArrayList;

public class Media {

   private String title;
    private String rating ;
   private Director director;
   private ArrayList<String> cast;

    public Media(String title, String rating, Director director, ArrayList<String> cast) {
        this.title = title;
        this.rating = rating;
        this.director = director;
        this.cast = cast;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<String> getCast() {
        return cast;
    }

    public void setCast(ArrayList<String> cast) {
        this.cast = cast;
    }
}
