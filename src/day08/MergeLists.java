//package day08;
//
//import day06.LinkedList;
//import day06.ListNode;
//
//public class MergeLists {
//    public LinkedList mergeLists (LinkedList ll1, LinkedList ll2) {
//        // create a new linked list and two current nodes
//        // initialize the current nodes at the root of each list to keep track
//        // of where we are at in the lists
//        LinkedList temp = new LinkedList();
//        ListNode cur1 = ll1.root;
//        ListNode cur2 = ll2.root;
//
//        // set the root of the temp list to the root of list 1
//        temp.root = cur1;
//
//        // move through both lists and append each value to the temp list
//        // one after the other
//        while (cur1.next != null && cur2.next != null) {
//            temp.append(cur1.next.data);
//            temp.append(cur2.next.data);
//
//            cur1 = cur1.next;
//            cur2 = cur2.next;
//        }
//
//        // check to see if one list is longer than the other
//        // and append it's remaining nodes to the new list
//        if (cur1.next != null) {
//            while (cur1.next != null) {
//                temp.append(cur1.next.data);
//                cur1 = cur1.next;
//            }
//        } else {
//            while (cur2.next != null) {
//                temp.append(cur2.next.data);
//                cur2 = cur2.next;
//            }
//        }
//        return temp;
//    }
//}
