import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*input:{ {'c', 'a', 't'}}
            output:{'t', 'a', 'c'}
            input:{'b', 'a', 'n', 'd'}
            output: {'d', 'n', 'a', 'b'}*/

        char[] test1 = {'c', 'a', 't'};
        char[] test2 = {'b', 'a', 'n', 'd'};

        System.out.println(Arrays.toString(Algorithms.reverseArr1(test1)));
        System.out.println(Arrays.toString(Algorithms.reverseArr2(test2)));
    }
}
