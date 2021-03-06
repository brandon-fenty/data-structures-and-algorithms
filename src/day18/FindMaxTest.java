package day18;

import day16.FizzBuzzTree;
import day16.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaxTest {

    @Test
    void findMaxLastNode() {
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

        int result = FindMax.findMax(tree.root);
        int expected = 99;
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }

    @Test
    void findMaxAtRoot() {
        FizzBuzzTree tree = new FizzBuzzTree();
        TreeNode n100 = new TreeNode(100);

        TreeNode n18 = new TreeNode(18);
        TreeNode n12 = new TreeNode(12);
        TreeNode n24 = new TreeNode(24);

        TreeNode n75 = new TreeNode(75);
        TreeNode n66 = new TreeNode(66);
        TreeNode n99 = new TreeNode(99);

        // connect nodes
        tree.root = n100;
        n100.left = n18;
        n18.left = n12;
        n18.right = n24;

        n100.right = n75;
        n75.left = n66;
        n75.right = n99;

        int result = FindMax.findMax(tree.root);
        int expected = 100;
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }

    @Test
    void findMaxInMiddle() {
        FizzBuzzTree tree = new FizzBuzzTree();
        TreeNode n53 = new TreeNode(53);

        TreeNode n18 = new TreeNode(18);
        TreeNode n12 = new TreeNode(12);
        TreeNode n24 = new TreeNode(24);

        TreeNode n75 = new TreeNode(75);
        TreeNode n66 = new TreeNode(66);
        TreeNode n14 = new TreeNode(14);

        // connect nodes
        tree.root = n53;
        n53.left = n18;
        n18.left = n12;
        n18.right = n24;

        n53.right = n75;
        n75.left = n66;
        n75.right = n14;

        int result = FindMax.findMax(tree.root);
        int expected = 75   ;
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }
}