public class Algorithms{
    public static  char[] reverseArr1(char[] arr){
        char[] reversed1 = new char[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0 ; i--) {
            reversed1[j] = arr[i];
            j++;
        }
        return reversed1;
    }
    public static  char[] reverseArr2(char[] arr){
        char[] reversed2 = new char[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0 ; i--) {
            reversed2[j] = arr[i];
            j++;
        }
        return reversed2;
    }
}


