import java.util.ArrayList;

public class Inventory <T extends Vehicle> {

    private ArrayList<T> inventory;

    public Inventory() {
        this.inventory = inventory;
    }

    public Inventory(Inventory<Vehicle> vehicleInventory) {
    }

    public void addToInventory(String vehicle){
        System.out.println(inventory);
    }
    public void removeFromInventory(String vin){
        System.out.println(inventory);

    }
}
