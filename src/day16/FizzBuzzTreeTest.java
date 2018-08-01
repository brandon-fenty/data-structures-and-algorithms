package day16;

import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTreeTest {

    @Test
    void fizzBuzzTree() {
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

        System.out.println("Tree: " + tree.toString());
        System.out.print("Result: ");
        FizzBuzzTree.fizzBuzzTree(tree.root);
    }
}