//package day09;
//
//import day06.ListNode;
//
//public class HasLoop {
//
//    public boolean hasLoop () {
//        // Initialize three variables; loopDetected which will be our return value
//        // and two new nodes that keep track of where we are in the list.
//        boolean loopDetected = false;
//        ListNode cur1 = this.root;
//        ListNode cur2 = this.root;
//
//        // Check to see if the next node equals null, if it does not, enter the while loop
//        // this will account for a list with only one node in it
//        if (this.root.next != null) {
//            while (cur1.next != null && cur2.next != null) {
//                // Advance the first node two steps ahead and the second node one step ahead
//                // if a loop is present, they will eventually catch up to each other
//                cur1 = cur1.next.next;
//                cur2 = cur2.next;
//
//                // Check to see if the values of current 1 and 2 match, if they do, that means
//                // they are on the same node and there is a loop in the list
//                if (cur1 == cur2) {
//                    loopDetected = true;
//                    break;
//                }
//            }
//        }
//        return loopDetected;
//    }
//}
