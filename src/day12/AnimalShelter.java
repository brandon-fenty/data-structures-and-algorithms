package day12;

// First in, first out animal shelter.
// Create a class called AnimalShelter that holds cats and dogs
// Create two methods; enqueue which will add animals to a queue
// and dequeue which takes an argument of animal type and returns the first
// of it's kind then adds the remaining animals back to the queue in the order
// they originally went in.

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
    // Create two queues; one for cats and one for dogs
    Queue<String> catQ = new LinkedList<>();
    Queue<String> dogQ = new LinkedList<>();

    public void enqueue (String animal) {
        // Check to see what type of animal was passed into the method
        // and add it to it's corresponding queue
        if (animal == "dog" || animal == "Dog") {
            dogQ.add(animal);
        } else if (animal == "cat" || animal == "Cat") {
            catQ.add(animal);
        } else {
            System.out.println("Incorrect animal type");
        }
    }

    public String dequeue (String pref) {
        // Based on what the preference is, return the first in line
        // for the type
        if (pref == "dog" || pref == "Dog") {
            return dogQ.poll();
        } else if (pref == "cat" || pref == "Cat") {
            return  catQ.poll();
        }
        return "Incorrect animal type";
    }

    // Print out the dog queue
    public String dogQueueToString () {
        String str = "";
        for (String dogs : dogQ) {
            str += dogs + " -> ";
        }
        return str;
    }

    public String catQueueToString () {
        String str = "";
        for (String cats : catQ) {
            str += cats + " -> ";
        }
        return str;
    }
}
