package day19;

import day16.FizzBuzzTree;
import day16.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsIdenticalTest {

    @Test
    void emptyTrees() {
        FizzBuzzTree tree1 = new FizzBuzzTree();
        FizzBuzzTree tree2 = new FizzBuzzTree();

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(1);

        tree1.root = n1;
        tree2.root = n2;

        System.out.println("Expected: false");
        System.out.println("Result: " + IsIdentical.isIdentical(tree1.root, tree2.root));
        assertEquals(true, IsIdentical.isIdentical(tree1.root, tree2.root));
    }

    @Test
    void isNotIdenticalUnbalanced() {
        FizzBuzzTree tree1 = new FizzBuzzTree();
        TreeNode n53 = new TreeNode(53);

        TreeNode n18 = new TreeNode(18);
        TreeNode n12 = new TreeNode(12);
        TreeNode n24 = new TreeNode(24);

        TreeNode n75 = new TreeNode(75);
        TreeNode n66 = new TreeNode(66);
        TreeNode n99 = new TreeNode(99);
        TreeNode n45 = new TreeNode(45);

        // connect nodes
        tree1.root = n53;
        n53.left = n18;
        n18.left = n12;
        n18.right = n24;

        n53.right = n75;
        n75.left = n66;
        n75.right = n99;
        n99.right = n45;

        FizzBuzzTree tree2 = new FizzBuzzTree();

        TreeNode two53 = new TreeNode(53);

        TreeNode two18 = new TreeNode(18);
        TreeNode two12 = new TreeNode(12);
        TreeNode two24 = new TreeNode(24);

        TreeNode two75 = new TreeNode(75);
        TreeNode two66 = new TreeNode(66);
        TreeNode two99 = new TreeNode(99);

        tree2.root = two53;
        two53.left = two18;
        two18.left = two12;
        two18.right = two24;

        two53.right = two75;
        two75.left = two66;
        two75.right = two99;

        System.out.println("Expected: false");
        System.out.println("Result: " + IsIdentical.isIdentical(tree1.root, tree2.root));
        assertEquals(false, IsIdentical.isIdentical(tree1.root, tree2.root));
    }

    @Test
    void isNotIdenticalDiffVal() {
        FizzBuzzTree tree1 = new FizzBuzzTree();
        TreeNode n53 = new TreeNode(53);

        TreeNode n18 = new TreeNode(18);
        TreeNode n12 = new TreeNode(12);
        TreeNode n31 = new TreeNode(31);

        TreeNode n75 = new TreeNode(75);
        TreeNode n66 = new TreeNode(66);
        TreeNode n99 = new TreeNode(99);

        // connect nodes
        tree1.root = n53;
        n53.left = n18;
        n18.left = n12;
        n18.right = n31;

        n53.right = n75;
        n75.left = n66;
        n75.right = n99;

        FizzBuzzTree tree2 = new FizzBuzzTree();

        TreeNode two53 = new TreeNode(53);

        TreeNode two18 = new TreeNode(18);
        TreeNode two12 = new TreeNode(12);
        TreeNode two24 = new TreeNode(24);

        TreeNode two75 = new TreeNode(75);
        TreeNode two66 = new TreeNode(66);
        TreeNode two99 = new TreeNode(99);

        tree2.root = two53;
        two53.left = two18;
        two18.left = two12;
        two18.right = two24;

        two53.right = two75;
        two75.left = two66;
        two75.right = two99;

        System.out.println("Expected: false");
        System.out.println("Result: " + IsIdentical.isIdentical(tree1.root, tree2.root));
        assertEquals(false, IsIdentical.isIdentical(tree1.root, tree2.root));
    }

    @Test
    void isIdentical() {
        FizzBuzzTree tree1 = new FizzBuzzTree();
        TreeNode n53 = new TreeNode(53);

        TreeNode n18 = new TreeNode(18);
        TreeNode n12 = new TreeNode(12);
        TreeNode n24 = new TreeNode(24);

        TreeNode n75 = new TreeNode(75);
        TreeNode n66 = new TreeNode(66);
        TreeNode n99 = new TreeNode(99);

        // connect nodes
        tree1.root = n53;
        n53.left = n18;
        n18.left = n12;
        n18.right = n24;

        n53.right = n75;
        n75.left = n66;
        n75.right = n99;

        FizzBuzzTree tree2 = new FizzBuzzTree();

        TreeNode two53 = new TreeNode(53);

        TreeNode two18 = new TreeNode(18);
        TreeNode two12 = new TreeNode(12);
        TreeNode two24 = new TreeNode(24);

        TreeNode two75 = new TreeNode(75);
        TreeNode two66 = new TreeNode(66);
        TreeNode two99 = new TreeNode(99);

        tree2.root = two53;
        two53.left = two18;
        two18.left = two12;
        two18.right = two24;

        two53.right = two75;
        two75.left = two66;
        two75.right = two99;

        System.out.println("Expected: true");
        System.out.println("Result: " + IsIdentical.isIdentical(tree1.root, tree2.root));
        assertEquals(true, IsIdentical.isIdentical(tree1.root, tree2.root));
    }
}