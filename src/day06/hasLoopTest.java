package day06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class hasLoopTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void hasLoop () {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(7);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n2;

        LinkedList ll = new LinkedList();
        ll.root = n1;
        boolean result = ll.hasLoop();
        System.out.println("result: " + result);
        assertEquals(true, result);
    }

    @Test
    void hasLoop2 () {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(7);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(8);
        ListNode n7 = new ListNode(9);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n2;

        LinkedList ll = new LinkedList();
        ll.root = n1;
        boolean result = ll.hasLoop();
        System.out.println("result: " + result);
        assertEquals(true, result);
    }

    @Test
    void noLoop () {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;


        LinkedList ll = new LinkedList();
        ll.root = n1;

        boolean result = ll.hasLoop();
        System.out.println("result: " + result);
        assertEquals(false, result);
    }

    @Test
    void empty () {
        ListNode n1 = new ListNode(0);
        LinkedList emptyList = new LinkedList();
        emptyList.root = n1;
        System.out.println("Expected: false");

        boolean result = emptyList.hasLoop();
        System.out.println("Result: " + result);
        assertEquals(false, result);
    }
}