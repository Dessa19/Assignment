public abstract class Vehicle {

    private final String MAKE;
    private String model;
    private String vin;
    private int horsepower;

    public Vehicle(String MAKE, String model, String vin, int horsepower) {
        this.MAKE = MAKE;
        this.model = model;
        this.vin = vin;
        this.horsepower = horsepower;
    }

    public String getMAKE() {
        return MAKE;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return this.MAKE + " " + this.model + " " + this.vin + " " + this.horsepower;
    }
}
