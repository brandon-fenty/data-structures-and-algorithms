package day16;

// Conduct FizzBuzz on a binary tree; if a value is divisible by 3 - print "fizz"
// if a value is divisible by 5 - print "buzz", if it is divisible by both
// print "fizzbuzz"

public class FizzBuzzTree {
    // Declare a node at the root
    public TreeNode root;

    public String FizzBuzzTree (TreeNode current) {
        while (current != null) {
            if(current.left != null) {
                FizzBuzzTree(current.left);
            }
            if (current.right != null) {
                FizzBuzzTree(current.right);
            }
            fizzBitch(current.data);
        }
        return null;
    }

    public void fizzBitch (int val) {

        if (val % 3 == 0 && val % 5 == 0) {
            System.out.println("fizzbuzz");
        } else if (val % 3 == 0) {
            System.out.println("fizz");
        } else if (val % 5 == 0) {
            System.out.println("buzz");
        }
    }

    // Helper functions
    public TreeNode getRoot () {
        return root;
    }

    public String toString () {
        StringBuilder builder = new StringBuilder();
        return inOrder(builder, this.root).toString();
    }

    private StringBuilder inOrder (StringBuilder builder, TreeNode current) {
        if (current == null) {
            return builder;
        }

        inOrder(builder, current.left);
        builder.append(current.data + "-");
        inOrder(builder, current.right);

        return builder;
    }
}
