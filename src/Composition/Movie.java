package Composition;

public class Movie {
    private double length;
    private String description;
    private double grossing;

    public Movie(double length, String description, double grossing) {
        this.length = length;
        this.description = description;
        this.grossing = grossing;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
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
