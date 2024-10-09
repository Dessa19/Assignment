import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AlgorithmsTest {

    @Test
    void reverseArr1() {
        Algorithms test1 = new Algorithms();

        assertArrayEquals(new char[]{'t', 'a', 'c'},test1.reverseArr1(new char[]{'c', 'a', 't'}));
    }
    @Test
    void reverseArr2() {
        Algorithms test2 = new Algorithms();

        assertArrayEquals(new char[]{'d', 'n', 'a', 'b'},test2.reverseArr2(new char[]{'b', 'a', 'n', 'd'}));
    }
}