package day13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiBracketValidationTest {

    @Test
    void balancedSimple () {
        String input = "({[]})";
        boolean result = MultiBracketValidation.MultiBracketValidation(input);
        boolean expected = true;

        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);
        assertEquals(expected, result);
    }

    @Test
    void unBalancedSimple () {
        String input = "({[})";
        boolean result = MultiBracketValidation.MultiBracketValidation(input);
        boolean expected = false;

        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);
        assertEquals(expected, result);
    }

    @Test
    void emptyString () {
        String input = "";
        boolean result = MultiBracketValidation.MultiBracketValidation(input);
        boolean expected = true;

        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);
        assertEquals(expected, result);
    }

    @Test
    void balancedComplex () {
        String input = "{({[]})[](){[()]}}";
        boolean result = MultiBracketValidation.MultiBracketValidation(input);
        boolean expected = true;

        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);
        assertEquals(expected, result);
    }

    @Test
    void unbalancedComplex () {
        String input = "[{[]{}()([{[]}])}))";
        boolean result = MultiBracketValidation.MultiBracketValidation(input);
        boolean expected = false;

        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);
        assertEquals(expected, result);
    }
}