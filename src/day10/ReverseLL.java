//package day10;
//
//import day06.LinkedList;
//import day06.ListNode;
//
//public class ReverseLL {
//    public static LinkedList reverseLL (LinkedList ll) {
//        // Initialize 3 nodes to keep track of where we are in the list and to prevent
//        // the list from dropping when changing reference points
//        ListNode current = ll.root;
//        ListNode future = null;
//        ListNode previous = null;
//
//        // Check for an empty list
//        if (current.next != null) {
//            while (current != null) {
//                // root [1]->[7]->[2]->[3]->[5]-> null
//                //      curr                    prev/fut
//                future = current.next;
//                // root [1]->[7]->[2]->[3]->[5]-> null
//                //      curr fut                  prev
//                current.next = previous;
//                // root [1]->[7]->[2]->[3]->[5]-> null
//                //      curr fut                  prev
//                //        ^------------------------^
//                previous = current;
//                //      [1]->[7]->[2]->[3]->[5]-> null
//                //       ^-------------------------^
//                //      curr fut
//                //      prev
//                current = future;
//                //      [1]->[7]->[2]->[3]->[5]-> null
//                //       ^-------------------------^
//                //           curr
//                //      prev  fut
//            }
//            // At the end of the while loop, previous will be set to the last
//            // value of the original list, this node now becomes the root2
//            ll.root = previous;
//        } else {
//            System.out.println("Your list is empty");
//        }
//        return ll;
//    }
//}
