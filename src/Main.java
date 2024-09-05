import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        crimeRisk();
         earthquakeRisk();
         floodRisk();
        double totalCalculatedRisk =  totalRisk(2,49,80);

        System.out.println("Total Risks are =" + totalCalculatedRisk);

    }
    public static void crimeRisk(){
        double crimeFrequancy =2;
        System.out.println("This area is a high crime area:" + crimeFrequancy);

    }
    public static void earthquakeRisk(){
            int earthquakFrequency = 49;
        System.out.println("This area is a high earthquake area: " + earthquakFrequency);
    }
    public static void floodRisk(){
   int floodFrequency = 80;
        System.out.println("This is a high Flood Risk area: " + floodFrequency);

    }
    public static double totalRisk(int x, int y, int z){

        return (x+y+z);
    }

}








