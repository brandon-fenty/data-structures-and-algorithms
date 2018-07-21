package day06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseListTest {

    @Test
    void singleRvrsTest () {
        LinkedList ll = new LinkedList();
        ListNode n1 = new ListNode(1);
        ll.root = n1;

        String expected = "1 -> null";
        System.out.println("Expected: " + expected);
        LinkedList initialize = ll.reverseLL(ll);
        String result = initialize.toString();
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }

    @Test
    void reverseLL1 () {
        LinkedList ll1 = new LinkedList();
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(7);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(5);

        ll1.root = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        String expected = "5 -> 3 -> 2 -> 7 -> 1 -> null";
        System.out.println("Expected: " + expected);
        LinkedList initialize = ll1.reverseLL(ll1);
        String result = initialize.toString();
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }

    @Test
    void reverseLL2 () {
        LinkedList ll2 = new LinkedList();
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(5);
        ListNode n4 = new ListNode(1);
        ListNode n5 = new ListNode(8);
        ListNode n6 = new ListNode(9);


        ll2.root = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        String expected = "9 -> 8 -> 1 -> 5 -> 4 -> 3 -> null";
        System.out.println("Expected: " + expected);
        LinkedList initialize = ll2.reverseLL(ll2);
        String result = initialize.toString();
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }
}