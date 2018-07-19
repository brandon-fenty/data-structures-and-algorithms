package day07;

import day06.ListNode;

public class KthElement {
    ListNode root;

    public ListNode kthElement (int k) {
        int elCount = 0;
        ListNode tempNode = this.root;

        // Get a count of the LL
        while (tempNode != null) {
            tempNode = tempNode.next;
            elCount++;
        }
        // Reset the root
        tempNode = this.root;

        // Get the value
        for (int i = 1; i < elCount - k + 1; i++) {
            tempNode = tempNode.next;
        }
        return tempNode;
    }
}
