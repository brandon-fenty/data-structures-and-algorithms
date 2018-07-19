package day06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeListTest {
    LinkedList l1 = new LinkedList();
    LinkedList l2 = new LinkedList();

    @BeforeEach
    void setUp() {
        l1.prepend(2);
        l1.prepend(3);
        l1.prepend(1);

        l2.prepend(4);
        l2.prepend(9);
        l2.prepend(5);
    }

    @Test
    void mergeListsTest() {
        LinkedList initialize = LinkedList.mergeLists(l1, l2);
        String result = initialize.toString();
        String expected = "1 -> 5 -> 3 -> 9 -> 2 -> 4";
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

    }
}