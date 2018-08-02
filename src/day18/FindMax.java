package day18;

import day16.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class FindMax {
    public static int findMax (TreeNode n) {
        Queue<TreeNode> qq = new LinkedList<>();
        qq.add(n);
        int maxVal = qq.peek().data;

        if (n.left == null && n.right == null) {
            return maxVal;
        }

        while (!qq.isEmpty()) {
            TreeNode temp = qq.remove();

            if (temp.left != null) {
                qq.add(temp.left);
            }
            if (temp.right != null) {
                qq.add(temp.right);
            }
            if (temp.data > maxVal) {
                maxVal = temp.data;
            }
        }
        return maxVal;
    }
}
