package day14;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class MaxStackTest {

    @Test
    void maxAtTop () {
        System.out.println("---- Max at top -----");
        MaxStack ss = new MaxStack();
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
        System.out.println("---- Max at bottom -----");
        MaxStack ss = new MaxStack();
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
        System.out.println("---- Max in middle of stack -----");
        MaxStack ss = new MaxStack();
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

    @Test
    void checkOrder () {
        System.out.println("---- Check order of Stack -----");
        MaxStack ss = new MaxStack();
        ss.push(5);
        ss.push(4);
        ss.push(3);
        ss.push(2);
        ss.push(1);

        System.out.println("Input: " + Arrays.toString(ss.toArray()));
        int maxVal = MaxStack.max(ss);
        String result = Arrays.toString(ss.toArray());
        String expected = "[5, 4, 3, 2, 1]";
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);
        System.out.println("Max val: " + maxVal);
        assertEquals(expected, result);
    }

}