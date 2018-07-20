package day06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeListTest {
    LinkedList l1 = new LinkedList();
    LinkedList l2 = new LinkedList();
    LinkedList expected1 = new LinkedList();

    LinkedList l3 = new LinkedList();
    LinkedList l4 = new LinkedList();
    LinkedList expected2 = new LinkedList();

    @BeforeEach
    void setUp() {
        l1.prepend(2);
        l1.prepend(3);
        l1.prepend(1);

        l2.prepend(4);
        l2.prepend(9);
        l2.prepend(5);

        expected1.prepend(4);
        expected1.prepend(2);
        expected1.prepend(9);
        expected1.prepend(3);
        expected1.prepend(5);
        expected1.prepend(1);

        l3.prepend(2);
        l3.prepend(3);
        l3.prepend(1);
        l3.prepend(8);

        l4.prepend(4);
        l4.prepend(9);
        l4.prepend(5);

        expected2.prepend(2);
        expected2.prepend(4);
        expected2.prepend(3);
        expected2.prepend(9);
        expected2.prepend(1);
        expected2.prepend(5);
        expected2.prepend(8);
    }

    @Test
    void mergeListsTest() {
        System.out.print("Expected: ");
        expected1.printList();
        System.out.println();

        LinkedList initialize = LinkedList.mergeLists(l1, l2);
        String expected = expected1.toString();
        String result = initialize.toString();

        System.out.print("Result: " + result + " null");
        assertEquals(expected, result);
    }

    @Test
    void mergeListsTestTopLonger() {
        System.out.print("Expected: ");
        expected2.printList();
        System.out.println();

        LinkedList initialize = LinkedList.mergeLists(l3, l4);
        String expected = expected2.toString();
        String result = initialize.toString();

        System.out.print("Result: " + result + " null");
        assertEquals(expected, result);
    }
}