package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class BinaryIntSearchTreeTest {

    @Test
    void testFindMaxDigitsBasic() {
        HomeWork tree = new HomeWork();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);

        List<Integer> result = tree.findMaxDigits(3, 4);
        assertEquals(List.of(4, 3, 2), result);
    }

    @Test
    void testFindMaxDigitsWithLargerUpperBound() {
        HomeWork tree = new HomeWork();
        tree.add(10);
        tree.add(15);
        tree.add(5);
        tree.add(7);
        tree.add(12);

        List<Integer> result = tree.findMaxDigits(2, 15);
        assertEquals(List.of(15, 12), result);
    }

    @Test
    void testFindMaxDigitsWithSmallUpperBound() {
        HomeWork tree = new HomeWork();
        tree.add(8);
        tree.add(3);
        tree.add(10);

        List<Integer> result = tree.findMaxDigits(3, 7);
        assertEquals(List.of(3), result);
    }    
}