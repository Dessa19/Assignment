import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("FORD","Fiesta","56ESD3589BBF218KP",200 );
        Car car2 = new Car("FORD","Taurus","56SDE3540KGF218LR",300 );
        Car car3 = new Car("FORD","Edge","56SCE3540KGF218KR",150 );

        ArrayList<Car> carFiesta = new ArrayList<>(new ArrayList<>());
        ArrayList<Car> carTaurus =new ArrayList<>();
        ArrayList<Car> carEdge = new ArrayList<>();
        carFiesta.add(car1);
        carTaurus.add(car2);
        carEdge.add(car3);

        System.out.println(carFiesta);
        System.out.println(carTaurus);
        System.out.println(carEdge);

        Truck truck1 = new Truck("FORD","Mustang","13HJMZ45673894DHJ",300);
        Truck truck2 = new Truck("FORD","FordRanger","2345DFS6789WE56",300);
        Truck truck3 = new Truck("FORD","Ford-150","3547SEW5790QA",200);

        ArrayList<Truck> truckMustang = new ArrayList<>();
        ArrayList<Truck> truckFordRanger = new ArrayList<>();
        ArrayList<Truck> truckFord_150 = new ArrayList<>();
        truckMustang.add(truck1);
        truckFordRanger.add(truck2);
        truckFord_150.add(truck3);


        System.out.println(truckMustang);
        System.out.println(truckFordRanger);
        System.out.println(truckFord_150);

        Inventory<Truck> truckInventory = new Inventory<>();
        Inventory<Car> carInventory = new Inventory<>();


        System.out.println(truckInventory);


















    }
}