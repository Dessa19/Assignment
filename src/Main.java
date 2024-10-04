import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("FORD","Edge","56SCE3540KGF218KR",150);

        Inventory<Car> carInventory = new Inventory<>();
        carInventory.addToInventory(new Car("FORD","Fiesta","56ESD3589BBF218KP",200) );
        carInventory.addToInventory(new Car("FORD","Taurus","56SDE3540KGF218LR",300));
        carInventory.addToInventory(new Car("FORD","Edge","56SCE3540KGF218KR",150));

        Truck truck = new Truck("FORD","Mustang","13HJMZ45673894DHJ",300);

        Inventory<Truck> truckInventory = new Inventory<>();
        truckInventory.addToInventory(new Truck("FORD","Mustang","13HJMZ45673894DHJ",300));
        truckInventory.addToInventory(new Truck("FORD","FordRanger","2345DFS6789WE56",300));
        truckInventory.addToInventory(new Truck("FORD","Ford-150","3547SEW5790QA",200));

        System.out.println("Truck " + truckInventory);
        System.out.println("Car " + carInventory);

        System.out.println(" Below is the new inventory:");

        carInventory.removeFromInventory("56ESD3589BBF218KP");
        truckInventory.removeFromInventory("3547SEW5790QA");

        System.out.println("New Car inventory: " + carInventory);
        System.out.println("New Truck inventory: " + truckInventory);
    }
}