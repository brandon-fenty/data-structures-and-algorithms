package day11;

import java.util.Arrays;
import java.util.Stack;

public class QueueWithStacks {
    public Stack<Integer> input = new Stack<>();
    public Stack<Integer> output = new Stack<>();

    public void enqueue (int val) {
        input.push(val);
    }

    public int dequeue () {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.pop();
    }

    // ********************************************
    // **** This method was sourced from Ahmed ****
    // ********************************************
    public int[] toArray (){
        int[] aa = new int[input.size()];

        for (int i = 0; i < aa.length; i++) {
            aa[i] = input.pop();
        }
        return aa;
    }
}
