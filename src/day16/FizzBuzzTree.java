package day16;

// Conduct FizzBuzz on a binary tree; if a value is divisible by 3 - print "fizz"
// if a value is divisible by 5 - print "buzz", if it is divisible by both
// print "fizzbuzz"

public class FizzBuzzTree {
    // Declare a node at the root
    protected TreeNode root;

    public static void fizzBuzzTree (TreeNode current) {
        if (current != null) {
            fizzBuzzTree(current.left);
            fizzBitch(current.data);
            fizzBuzzTree(current.right);
        }
    }

    public static void fizzBitch (int val) {
        if (val % 3 == 0 && val % 5 == 0) {
            System.out.print("fizzbuzz ");
        } else if (val % 3 == 0) {
            System.out.print("fizz ");
        } else if (val % 5 == 0) {
            System.out.print("buzz ");
        } else {
            System.out.print(val + " ");
        }
    }

    // Helper functions
    public String toString () {
        StringBuilder builder = new StringBuilder();
        return inOrder(builder, this.root).toString();
    }

    private StringBuilder inOrder (StringBuilder builder, TreeNode current) {
        if (current == null) {
            return builder;
        }

        inOrder(builder, current.left);
        builder.append(current.data + " ");
        inOrder(builder, current.right);

        return builder;
    }
}
