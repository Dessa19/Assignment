public class Truck extends Vehicle {


    public Truck(String MAKE, String model, String vin, int horsepower) {
        super(MAKE, model, vin, horsepower);
    }

    @Override
    public String toString() {
        return this.getMAKE()+ " "+ this.getModel()+" "+ this.getVin()+" "+this.getHorsepower();
    }
}
