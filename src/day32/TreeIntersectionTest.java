package day32;

import day16.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class TreeIntersectionTest {

    @Test
    void treeIntersection() {
        Tree treeA = new Tree();

        TreeNode a150 = new TreeNode(150);
        TreeNode a100 = new TreeNode(100);
        TreeNode a250 = new TreeNode(250);
        TreeNode a75 = new TreeNode(75);
        TreeNode a160 = new TreeNode(160);
        TreeNode a200 = new TreeNode(200);
        TreeNode a350 = new TreeNode(350);
        TreeNode a125 = new TreeNode(125);
        TreeNode a175 = new TreeNode(175);
        TreeNode a300 = new TreeNode(300);
        TreeNode a500 = new TreeNode(500);

        treeA.root = a150;

        a150.left = a100;
        a150.right = a250;

        a100.left = a75;
        a100.right = a160;

        a160.left = a125;
        a160.right = a175;

        a250.left = a200;
        a250.right = a350;

        a350.left = a300;
        a350.right = a500;

        Tree treeB = new Tree();

        TreeNode b42 = new TreeNode(42);
        TreeNode b100 = new TreeNode(100);
        TreeNode b600 = new TreeNode(600);
        TreeNode b15 = new TreeNode(15);
        TreeNode b160 = new TreeNode(160);
        TreeNode b200 = new TreeNode(200);
        TreeNode b350 = new TreeNode(350);
        TreeNode b125 = new TreeNode(125);
        TreeNode b175 = new TreeNode(175);
        TreeNode b4 = new TreeNode(4);
        TreeNode b500 = new TreeNode(500);

        treeB.root = b42;

        b42.left = b100;
        b42.right = b600;

        b100.left = b15;
        b100.right = b160;

        b160.left = b125;
        b160.right = b175;

        b600.left = b200;
        b600.right = b350;

        b350.left = b4;
        b350.right = b500;

        Set<TreeNode> result = TreeIntersection.findMatches(treeA.root, treeB.root);
        System.out.println("Result: " + result);
    }
}