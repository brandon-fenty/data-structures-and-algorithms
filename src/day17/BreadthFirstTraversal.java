package day17;

import day16.FizzBuzzTree;
import day16.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstTraversal {

    public static void main(String[] args) {
        FizzBuzzTree tree = new FizzBuzzTree();
        TreeNode n53 = new TreeNode(53);

        TreeNode n18 = new TreeNode(18);
        TreeNode n12 = new TreeNode(12);
        TreeNode n24 = new TreeNode(24);

        TreeNode n75 = new TreeNode(75);
        TreeNode n66 = new TreeNode(66);
        TreeNode n99 = new TreeNode(99);

        // connect nodes
        tree.root = n53;
        n53.left = n18;
        n18.left = n12;
        n18.right = n24;

        n53.right = n75;
        n75.left = n66;
        n75.right = n99;

        breadthFirstTraversal(tree.root);
    }

    public static void breadthFirstTraversal (TreeNode root) {
        // Create a queue to store references to each node in the tree
        // as you visit them
        Queue<TreeNode> qq = new LinkedList<>();
        // Enqueue the root of the tree
        qq.add(root);
        // Check for an empty tree
        if (root.left == null && root.right == null) {
            System.out.println("Tree is empty.");
        }

        // Enter a while loop that will not complete until the queue is empty
        while (!qq.isEmpty()) {
            // Remove the node from the top of the queue and store it in a
            // variable so the queue does not lose reference
            TreeNode printNode = qq.remove();
            // Check to see if the left and right children of printNode are null,
            // if they aren't, add them to the queue
            if (printNode.left != null) {
                qq.add(printNode.left);
            }
            if (printNode.right != null) {
                qq.add(printNode.right);
            }
            // Print out the node that was removed earlier after it's children have
            // been added to the queue
            System.out.print(printNode + " ");
        }
    }
}
