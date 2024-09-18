public class Movie extends Media{

    private double length;
    private  String description;
    private double grossing;


    public Movie(double length, String description, double grossing) {

        this.setLength(length);
        this.setDescription(description);
        this.setGrossing(grossing);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getGrossing() {
        return grossing;
    }

    public void setGrossing(double grossing) {
        this.grossing = grossing;
    }
}
