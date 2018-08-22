package day32;

import day16.TreeNode;

import java.util.*;

public class TreeIntersection {

   public static Set findMatches(TreeNode treeA, TreeNode treeB) {
       Set<Integer> sA = new HashSet<>();
       Set<Integer> sB = new HashSet<>();

       depthFirstSearch(sA, treeA);
       depthFirstSearch(sB, treeB);

       System.out.println("Tree A: " + sA);
       System.out.println("Tree B: " + sB);

       sA.retainAll(sB);

       return sA;
   }

   private static Set depthFirstSearch(Set set, TreeNode current) {
        if (current == null) {
            return set;
        }

        depthFirstSearch(set, current.left);
        set.add(current.data);
        depthFirstSearch(set, current.right);

        return set;
   }


/*
* Breadth First Traversal
* */
//    public static Set findMatches(TreeNode treeA, TreeNode treeB) {
//        Set<TreeNode> setA = new HashSet<>();
//        Set<TreeNode> setB = new HashSet<>();
//
//        Queue<TreeNode> qt1 = new LinkedList<>();
//        Queue<TreeNode> qt2 = new LinkedList<>();
//
//        qt1.add(treeA);
//        qt2.add(treeB);
//
//        setA.add(qt1.peek());
//        setB.add(qt2.peek());
//
//        while (!qt1.isEmpty() && !qt2.isEmpty()) {
//            TreeNode temp1 = qt1.remove();
//            TreeNode temp2 = qt2.remove();
//
//
//            if (temp1.left != null) {
//                setA.add(temp1.left);
//                qt1.add(temp1.left);
//            }
//            if (temp1.right != null) {
//                setA.add(temp1.right);
//                qt1.add(temp1.right);
//            }
//            if (temp2.left != null) {
//                setB.add(temp2.left);
//                qt2.add(temp2.left);
//            }
//            if (temp2.right != null) {
//                setB.add(temp2.right);
//                qt2.add(temp2.right);
//            }
//
//            System.out.println("Set A: " + setA);
//            System.out.println("Set B: " + setB);
//        }
//
//        setA.retainAll(setB);
//
//        return setA;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof TreeNode)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return false;
    }
}
