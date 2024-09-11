public class Main {
    public static void main(String[] args) {
//for loop assignmet
        int i;
        for (i = 10; i >= 1; i--) {
            System.out.println( "i = " + i + " ");
        }
        String[] studentsName ={"Dessalew", "Bob", "Robel", "Degsew", "Steven", "Jack"};
        double[] studentsGrade = {3.0, 3.4, 3.7, 3.9, 4, 3.2};

        getStudentGrades(new double[] {3.0, 3.4, 3.7, 3.9, 4, 3.2});
        getStudentName(new String[] {"Dessalew", "Bob", "Robel", "Degsew", "Steven", "Jack"} );

    }

    public static void getStudentGrades( double[] array){

        for (int i = 0; i < array.length;i++ ) {
            System.out.println("Student grade " + i + " = " +array[i] + " ");

        }
        System.out.println(" ");

    }
    public static void getStudentName(String[] array){
         for (int i = 0;i< array.length;i++){
             System.out.println("Student name " + i + " = " + array[i] + " ");
         }

    }
public static void  studentNameAndGrade(String[] x,int[] y){


}
}