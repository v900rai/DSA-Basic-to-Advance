package selfpractices.InterviewOnly;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class SumOfLeafNodes {

    // Function to calculate the sum of leaf nodes
    public int sumOfLeafNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return root.val;
        }
        return sumOfLeafNodes(root.left) + sumOfLeafNodes(root.right);
    }

    public static void main(String[] args) {
        // Constructing a sample BST
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        // Calculating the sum of leaf nodes
        SumOfLeafNodes sol = new SumOfLeafNodes();
        int sum = sol.sumOfLeafNodes(root);

        // Printing the result
        System.out.println("Sum of leaf nodes: " + sum);  // Output should be the sum of all leaf nodes
    }
}
