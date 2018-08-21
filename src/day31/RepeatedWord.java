package day31;

import java.util.HashSet;
import java.util.Set;

public class RepeatedWord {

    public static String repeatedWord (String input) {
        // Split the input string into an array that you can iterate over
        String[] arr = input.toLowerCase().split(" ");
        // Create a hashset to keep track of all the words you've already seen
        Set<String> hs = new HashSet<>();
        // Begin iterating over the array
        for (int i = 0; i < arr.length; i++) {
            // Check to see if there was an extra space added to the array
            if (arr[i] == " ") {
                i++;
            }
            // If the value at the current index has already been seen, return it
            if (hs.contains(arr[i])) {
                return arr[i];
            }
            // Add the current index to the hashset
            hs.add(arr[i]);
        }
        // If no dupes are found, return a string letting the user know
        return "No duplicates found";
    }
}
