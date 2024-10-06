package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryIntSearchTreeTest {

    @Test
    void add() {
        HomeWork tree = new HomeWork();

        tree.add(5);

        for (int i = 0; i < 10; i++) {
            tree.add(i);
        }
        tree.add(10);

        System.out.println(tree.findMaxDigits(3, 4));
    }

    @Test
    void addTest2() {
        HomeWork tree = new HomeWork();

        for (int i = 1; i < 5; i++) {
            tree.add(i);
        }

        System.out.println(tree.findMaxDigits(3, 4));
    }
}