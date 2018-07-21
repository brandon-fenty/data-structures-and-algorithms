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

    public String toString () {
        String result = "";
        ListNode current = this.root;

        while (current != null) {
            result += current.data + " -> ";
            current = current.next;
        }
        return result + "null";
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


    // Whiteboard 07 challenge
    public ListNode kthElement (int k) {
        int elCount = size();
        ListNode tempNode = this.root;

        // Get the value
        for (int i = 1; i < elCount - k; i++) {
            tempNode = tempNode.next;
        }
        return tempNode;
    }

    // Whiteboard 08 challenge
    public static LinkedList mergeLists (LinkedList ll1, LinkedList ll2) {
        // create a new linked list and two current nodes
        // initialize the current nodes at the root of each list to keep track
        // of where we are at in the lists
        LinkedList temp = new LinkedList();
        ListNode cur1 = ll1.root;
        ListNode cur2 = ll2.root;

        // set the root of the temp list to the root of list 1 and create a new node
        // with the
        temp.root = new ListNode(cur1.data);
        temp.append(cur2.data);

        // move through both lists and append each value to the temp list
        // one after the other
        while (cur1.next != null && cur2.next != null) {
            temp.append(cur1.next.data);
            temp.append(cur2.next.data);

            cur1 = cur1.next;
            cur2 = cur2.next;
        }

        // check to see if one list is longer than the other
        // and append it's remaining nodes to the new list
        if (cur1.next != null) {
            while (cur1.next != null) {
                temp.append(cur1.next.data);
                cur1 = cur1.next;
            }
        } else {
            while (cur2.next != null) {
                temp.append(cur2.next.data);
                cur2 = cur2.next;
            }
        }
        return temp;
    }

    // whiteboard 09 challenge
    public boolean hasLoop () {
        // Initialize three variables; loopDetected which will be our return value
        // and two new nodes that keep track of where we are in the list.
        boolean loopDetected = false;
        ListNode cur1 = this.root;
        ListNode cur2 = this.root;

        // Check to see if the next node in the list equals null, if it does not, enter the while loop
        // this will account for a list with only one node in it
        if (this.root.next != null) {
            while (cur1.next != null && cur2.next != null) {
                // Advance the first node two steps ahead and the second node one step ahead
                // if a loop is present, they will eventually catch up to each other
                cur1 = cur1.next.next;
                cur2 = cur2.next;

                // Check to see if the values of current 1 and 2 match, if they do, that means
                // they are on the same node and there is a loop in the list
                if (cur1 == cur2) {
                    loopDetected = true;
                    break;
                }
            }
        }
        return loopDetected;
    }

    public static LinkedList reverseLL (LinkedList ll) {
        // Initialize 3 nodes to keep track of where we are in the list and to prevent
        // the list from dropping when changing reference points
        ListNode current = ll.root;
        ListNode future = null;
        ListNode previous = null;

        // Check for an empty list
        if (current.next != null) {
            while (current != null) {
                // root [1]->[7]->[2]->[3]->[5]-> null
                //      curr                    prev/fut
                future = current.next;
                // root [1]->[7]->[2]->[3]->[5]-> null
                //      curr fut                  prev
                current.next = previous;
                // root [1]->[7]->[2]->[3]->[5]-> null
                //      curr fut                  prev
                //        ^------------------------^
                previous = current;
                //      [1]->[7]->[2]->[3]->[5]-> null
                //       ^-------------------------^
                //      curr fut
                //      prev
                current = future;
                //      [1]->[7]->[2]->[3]->[5]-> null
                //       ^-------------------------^
                //           curr
                //      prev  fut
            }
            // At the end of the while loop, previous will be set to the last
            // value of the original list, this node now becomes the root2
            ll.root = previous;
        } else {
            System.out.println("Your list is empty");
        }
        return ll;
    }

}
