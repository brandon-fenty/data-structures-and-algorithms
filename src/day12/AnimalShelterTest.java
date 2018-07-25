package day12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalShelterTest {

    @Test
    void checkDogEnqueue () {
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue("dog");
        shelter.enqueue("dog");
        shelter.enqueue("dog");

        String expected = "dog -> dog -> dog -> ";
        System.out.println("Expected: " + expected);
        String result = shelter.dogQueueToString();
        System.out.println("Result: " + result);
        assertEquals(expected, result);
    }

    @Test
    void checkCatEnqueue () {
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue("cat");
        shelter.enqueue("cat");
        shelter.enqueue("cat");

        String expected = "cat -> cat -> cat -> ";
        System.out.println("Expected: " + expected);
        String result = shelter.catQueueToString();
        System.out.println("Result: " + result);
        assertEquals(expected, result);
    }

    @Test
    void checkBothQueues () {
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue("cat");
        shelter.enqueue("dog");
        shelter.enqueue("cat");
        shelter.enqueue("dog");
        shelter.enqueue("cat");
        shelter.enqueue("dog");

        String expectedCat = "cat -> cat -> cat -> ";
        String expectedDog = "dog -> dog -> dog -> ";
        System.out.println("Expected Cat Queue: " + expectedCat);
        System.out.println("Expected Dog Queue: " + expectedDog);
        String catResult = shelter.catQueueToString();
        String dogResult = shelter.dogQueueToString();
        System.out.println("Cat Queue Result: " + catResult);
        System.out.println("Dog Queue Result: " + dogResult);
        assertEquals(expectedCat, catResult);
        assertEquals(expectedDog, dogResult);
    }

    @Test
    void dequeueDog () {
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue("cat");
        shelter.enqueue("dog");
        shelter.enqueue("cat");
        shelter.enqueue("dog");
        shelter.enqueue("cat");
        shelter.enqueue("dog");

        System.out.println("Before: " + shelter.dogQueueToString());

        String expected = "dog";
        String result = shelter.dequeue("dog");

        System.out.println("After: " + shelter.dogQueueToString());
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);
        assertEquals(expected, result);
    }

    @Test
    void dequeueCat () {
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue("cat");
        shelter.enqueue("dog");
        shelter.enqueue("cat");
        shelter.enqueue("dog");
        shelter.enqueue("cat");
        shelter.enqueue("dog");

        System.out.println("Before: " + shelter.catQueueToString());

        String expected = "cat";
        String result = shelter.dequeue("cat");

        System.out.println("After: " + shelter.catQueueToString());
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);
        assertEquals(expected, result);
    }
}