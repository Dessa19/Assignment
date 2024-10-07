package Testing;

import java.util.Arrays;
public class Algorithm {
    public static void main(String[] args) {

            //input:{ {'c', 'a', 't'}}
            //output:{'t', 'a', 'c'}
            //input:{'b', 'a', 'n', 'd'}
            //output: {'d', 'n', 'a', 'b'}

            char[] test1 = {'c', 'a', 't'};
            char[] test2 = {'b', 'a', 'n', 'd'};

            System.out.println(Arrays.toString(reverseArr(test1)));
            System.out.println(Arrays.toString(reverseArr(test2)));
        }
        public static char[] reverseArr(char[] arr){
            char[] reversed = new char[arr.length];
            int j = 0;
            for (int i = arr.length-1; i >= 0 ; i--) {
                reversed[j] = arr[i];
                j++;
            }
            return reversed;
        }
    }


