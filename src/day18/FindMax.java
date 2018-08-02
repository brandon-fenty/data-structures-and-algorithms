package day18;

import day16.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class FindMax {
    public static int findMax (TreeNode n) {
        // Create a queue to store the nodes of the tree as you visit them
        // add the root of the tree to the queue and initialize
        // a max value variable with the first value in the queue
        Queue<TreeNode> qq = new LinkedList<>();
        qq.add(n);
        int maxVal = qq.peek().data;

        // check to see if the child nodes of the root are null,
        // if they are, return maxVal
        if (n.left == null && n.right == null) {
            return maxVal;
        }

        // While the queue is not empty, remove the first value in the queue
        // and store it in a variable called temp
        while (!qq.isEmpty()) {
            TreeNode temp = qq.remove();
            // check to see if the left child and right child are not null
            // if they are not, add them to the queue
            if (temp.left != null) {
                qq.add(temp.left);
            }
            if (temp.right != null) {
                qq.add(temp.right);
            }
            // check to see if the node stored in temp is greater than the
            // current max, if it is, set the temp nodes data to be the new max
            if (temp.data > maxVal) {
                maxVal = temp.data;
            }
        }
        return maxVal;
    }
}
