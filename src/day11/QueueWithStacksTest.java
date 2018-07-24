package day11;

import org.junit.jupiter.api.Test;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QueueWithStacksTest {

    @Test
    void dequeueFirstVal () {
        QueueWithStacks tester = new QueueWithStacks();
        tester.enqueue(1);
        tester.enqueue(2);
        tester.enqueue(3);

        int expected = 1;
        System.out.println("Expected: " + expected);
        int result = tester.dequeue();
        System.out.println("Result: " + result);
        assertEquals(expected, result);
    }

    @Test
    void dequeueLastVal () {
        QueueWithStacks tester = new QueueWithStacks();
        tester.enqueue(1);
        tester.enqueue(2);
        tester.enqueue(3);

        int expected = 3;
        System.out.println("Expected: " + expected);
        tester.dequeue();
        tester.dequeue();
        int result = tester.dequeue();
        System.out.println("Result: " + result);
        assertEquals(expected, result);
    }

    @Test
    void checkWholeQueue () {
        QueueWithStacks tester = new QueueWithStacks();
        tester.enqueue(1);
        tester.enqueue(2);
        tester.enqueue(3);

        String result = Arrays.toString(tester.toArray());
        int[] expectedArr = {3, 2, 1};
        String expected = Arrays.toString(expectedArr);
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }
}