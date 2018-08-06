package day19;

import day16.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class IsIdentical {

    public static boolean isIdentical (TreeNode tree1, TreeNode tree2) {
        boolean treesMatch = false;

        Queue<TreeNode> qt1 = new LinkedList<>();
        Queue<TreeNode> qt2 = new LinkedList<>();

        qt1.add(tree1);
        qt2.add(tree2);

        while (!qt1.isEmpty() && !qt2.isEmpty()) {
            TreeNode temp1 = qt1.peek();
            TreeNode temp2 = qt2.peek();

            if (temp1 != null && temp2 == null) {
                return treesMatch;
            } else if (temp1 == null && temp2 != null) {
                return treesMatch;
            } else if (temp1.data != temp2.data) {
                return treesMatch;
            }

            temp1 = qt1.remove();
            temp2 = qt2.remove();

            if (temp1.left != null) {
                qt1.add(temp1.left);
            }
            if (temp1.right != null) {
                qt1.add(temp1.right);
            }
            if (temp2.left != null) {
                qt2.add(temp2.left);
            }
            if (temp2.right != null) {
                qt2.add(temp2.right);
            }
        }
        treesMatch = true;
        return treesMatch;
    }
}
