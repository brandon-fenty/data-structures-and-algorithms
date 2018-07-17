package day06;

public class LinkedList {
    ListNode root;

    public LinkedList () {
        this.root = null;
    }

    // Add new node to front of list
    public ListNode prepend (int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = this.root;
        this.root = newNode;

        return newNode;
    }

    // Add a new node the end of the list
    public void append (int data) {
        ListNode newAppend = new ListNode(data);
        ListNode current = this.root;

        while (current.next != null) {
            current = current.next;
        }
        current.next = newAppend;
    }

    // Inserts a value before a certain index
    public void insertBefore (int val, int newVal) {
        ListNode current = this.root;
        ListNode previous = null;

        while (current != null) {
            if (current.next.data != val) {
                ListNode insertBeforeVal = new ListNode(newVal);
                insertBeforeVal.next = current;
                // Check for null
                if (previous != null) {
                    previous.next = insertBeforeVal;
                }
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    // Inserts a value after a certain index
    public void insertAfter (int val, int newVal) {
        ListNode current = this.root;
        ListNode previous = null;

        while (current != null) {
            if (current.next.data != val) {
                ListNode insertAfterVal = new ListNode(newVal);
                insertAfterVal.next = current;
                // Check for null
                if (previous != null) {
                    previous.next = insertAfterVal;
                }
                return;
            }
            previous = current.next;
            current = current.next.next;
        }
    }

    // Gets the index of a value in the list
    public int indexOf (Object listItem) {
        int index = 0;
        ListNode current = this.root;

        while (current.next != null) {
            if (current.equals(listItem)) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    // Will be called if the list is empty
    public boolean isEmpty () {
        return this.root == null;
    }

    // Keeps track of the size of the linked list
    public int size () {
        int total = 0;

        ListNode current = this.root;
        while (current != null) {
            total++;
            current = current.next;
        }
        return total;
    }

    // Gets the value at a specified index
    public int get (int index) {
        int n = 0;
        ListNode current = this.root;

        while (n < index) {
            n++;
            current = current.next;
        }
        return current.data;
    }

    // Used to print out the entire linked list
    public void printList () {
        ListNode current = this.root;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        // Last node
        System.out.print(current);
    }
}
