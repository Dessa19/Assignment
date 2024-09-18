import java.util.ArrayList;

public class Media {
    Media(){

    }
    private String title;
    private String rating;
    private String director;
    private ArrayList<String> cast =new ArrayList<>();

    public Media(String title, String rating, String director) {
        this.title = title;
        this.rating = rating;
        this.director = director;
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}

