import java.util.ArrayList;

public class Inventory <T extends Vehicle> {

    private ArrayList<T> inventory = new ArrayList<>();

    public ArrayList<T> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<T> inventory) {
        this.inventory = inventory;
    }

    public void addToInventory(T vehicle) {
        inventory.add(vehicle);
    }
//for arrayList we use .size()
    public void removeFromInventory(String vin) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getVin().equals(vin)) {
                inventory.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "inventory=" + inventory +
                '}';
    }
}