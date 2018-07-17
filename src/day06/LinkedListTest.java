package day06;

import org.junit.jupiter.api.Test;

import java.util.concurrent.LinkedBlockingQueue;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void prependNothing() {
        LinkedList n1 = new LinkedList();
        Object result = n1.root.data;
        System.out.println(result);
//        Object expected = null;
//        System.out.println("expected: " + expected);
//        System.out.println("result: " + result);
//        assertEquals(expected, result);
    }

    @Test
    void prependOne() {
        LinkedList n1 = new LinkedList();
        n1.prepend(3);
        int result = n1.root.data;
        int expected = 3;
        System.out.println("expected: " + expected);
        System.out.println("result: " + result);
        assertEquals(expected, result);
    }

    @Test
    void prependTwo() {
        LinkedList n1 = new LinkedList();
        n1.prepend(3);
        n1.prepend(5);
        int result = n1.root.data;
        int expected = 5;
        System.out.println("expected: " + expected);
        System.out.println("result: " + result);
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
    void emptySize() {
        LinkedList n1 = new LinkedList();
        int result = n1.size();
        int expected = 0;
        System.out.println("expected: " + expected);
        System.out.println("result: " + result);
        assertEquals(expected, result);
    }

    @Test
    void size() {
        LinkedList n1 = new LinkedList();
        n1.prepend(1);
        n1.prepend(2);
        n1.prepend(3);
        int result = n1.size();
        int expected = 3;
        System.out.println("expected: " + expected);
        System.out.println("result: " + result);
        assertEquals(expected, result);
    }

    @Test
    void get() {
    }
}