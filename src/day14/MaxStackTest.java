package day14;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class MaxStackTest {

    @Test
    void maxAtTop () {
        Stack<Integer> ss = new Stack<>();
        ss.push(1);
        ss.push(2);
        ss.push(3);
        ss.push(4);
        ss.push(5);

        int result = MaxStack.max(ss);
        int expected = 5;
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);
        assertEquals(expected, result);
    }

    @Test
    void maxAtBottom() {
        Stack<Integer> ss = new Stack<>();
        ss.push(5);
        ss.push(4);
        ss.push(3);
        ss.push(2);
        ss.push(1);

        int result = MaxStack.max(ss);
        int expected = 5;
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);
        assertEquals(expected, result);
    }

    @Test
    void maxInMiddle() {
        Stack<Integer> ss = new Stack<>();
        ss.push(1);
        ss.push(2);
        ss.push(9);
        ss.push(1);
        ss.push(2);

        int result = MaxStack.max(ss);
        int expected = 9;
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);
        assertEquals(expected, result);
    }
}