package day16;

public class TreeNode {
    protected int data;
    protected TreeNode left;
    protected TreeNode right;

    public TreeNode (int val) {
        this.data = val;
    }

    public int getData () {
        return data;
    }

    public TreeNode getLeft () {
        return this.left;
    }

    public TreeNode getRight () {
        return this.right;
    }

    public String toString () {
        return "-" + this.data;
    }
}
