package day13;

import java.util.*;

public class MultiBracketValidation {

    // Create a function that accepts a string of brackets (parens, square brackets, and curly brackets)
    // as it's only argument and returns a boolean. If the string is balanced (each opening bracket
    // has a matching closing bracket) return true, otherwise return false.

    public static boolean MultiBracketValidation (String input) {
        // Create a stack to store opening brackets and a result variable
        // that is true by default
        Stack<Character> ss = new Stack<>();
        boolean result = true;
        // Check to see if the input was an empty string
        if (input.isEmpty()) {
            return result;
        }
        // Begin iterating through the input string
        for (int i = 0; i < input.length(); i++) {
            // Declare a variable that keeps track of the current character
            // in the string as you iterate through it
            char curr = input.charAt(i);
            // Check for an opening bracket and if one is detected, push it
            // to the stack
            if (curr == '{' || curr == '(' || curr =='[') {
                ss.push(curr);
            }
            // Begin checking for closing brackets
            if (curr == '}' || curr == ')' || curr == ']') {
                // If a closing bracket is found but the stack is empty,
                // set result to false and return it
                if (ss.isEmpty()) {
                    result = false;
                    return result;
                }
                // Declare a variable to keep track of the first character
                // in the stack
                char prev = ss.peek();
                // Compare the first character in the stack with the current
                // character in the input string, if a match is found,
                // pop the character out of the stack since it has been matched
                if (prev == '{' && curr == '}' || prev == '(' && curr == ')' || prev == '[' && curr == ']') {
                    ss.pop();
                // If a match is not found, it means the input string is not
                // balanced, set result to false and return it
                } else {
                    result = false;
                    return result;
                }
            }
        }
        return result;
    }
}
