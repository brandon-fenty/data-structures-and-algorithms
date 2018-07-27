package day14;

import java.util.Stack;

public class MaxStack extends Stack {

    // Not sure if I did this right, I still don't understand the concept of
    // inheritance all that well.

    public Stack<Integer> MaxStack () {
        Stack<Integer> ss = new Stack<>();
        return ss;
    }

    // Write a method that extends off the stack class and returns
    // the highest value stored in a stack

    public static int max (Stack<Integer> input) {
        // Declare a temporary stack that will hold the values of the
        // stack you are trying to get the maximum value of. Also declare
        // a variable to store the maximum value.
        Stack<Integer> temp = new Stack<>();
        int maxVal = 0;
        // Enter a while loop that will run until the input is empty
        while (!input.isEmpty()) {
            // Declare a current variable that keep's track of the value
            // that's been popped off the top of the input stack
            int current = input.pop();
            // Check if the current value is higher than or equal
            // to the max, if it is, set the max to this val.
            if (current >= maxVal) {
                maxVal = current;
            }
            // Add the current val to the temp stack
            temp.push(current);
        }
        // Enter another while loop that will push everything back to the original stack
        while (!temp.isEmpty()) {
            input.push(temp.pop());
        }

        return maxVal;
    }


}
