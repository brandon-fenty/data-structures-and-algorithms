package day07;

import day06.LinkedList;
import day06.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthElementTest {
    LinkedList n1 = new LinkedList();

    @BeforeEach
    void setUp() {
        n1.prepend(2);
        n1.prepend(8);
        n1.prepend(3);
        n1.prepend(1);
    }

    @Test
    void kthElement0Index() {
        System.out.print("List: ");
        n1.printList();
        System.out.println("\nInput: 0, Expected Output: 2");
        ListNode result = n1.kthElement(0);
        System.out.println("result: " + result.data);
        assertEquals(2, result.data);
    }

    @Test
    void kthElement2Index() {
        System.out.print("List: ");
        n1.printList();
        System.out.println("\nInput: 2, Expected Output: 3");
        ListNode result = n1.kthElement(2);
        System.out.println("result: " + result.data);
        assertEquals(3, result.data);
    }

}