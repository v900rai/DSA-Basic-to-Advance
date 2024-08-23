package TREEDSA;

// Definition of the TreeNode class
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}

// BinaryTree class to manage tree operations
public class BinaryTree {
    TreeNode root;

    // Constructor
    public BinaryTree() {
        root = null;
    }

    // Example method: In-order traversal (Left, Root, Right)
    void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        // Traverse left subtree
        inOrderTraversal(node.left);

        // Visit the root node
        System.out.print(node.val + " ");

        // Traverse right subtree
        inOrderTraversal(node.right);
    }

    public static void main(String[] args) {
        // Creating a binary tree
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        // In-order traversal of the binary tree
        System.out.print("In-order Traversal: ");
        tree.inOrderTraversal(tree.root);
    }
}
