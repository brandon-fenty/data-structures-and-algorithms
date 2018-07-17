package day06;

import org.junit.jupiter.api.Test;

import java.util.concurrent.LinkedBlockingQueue;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void prependOne() {
        LinkedList n1 = new LinkedList();
        n1.prepend(3);

        int result = n1.root.data;
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    void prependTwo() {
        LinkedList n1 = new LinkedList();
        n1.prepend(3);
        n1.prepend(5);

        int result = n1.root.data;
        int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    void append() {
    }

    @Test
    void insertBefore() {
    }

    @Test
    void insertAfter() {
    }

    @Test
    void size() {

    }

    @Test
    void get() {
    }
}