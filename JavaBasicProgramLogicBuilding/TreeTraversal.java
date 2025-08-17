package JavaBasicProgramLogicBuilding;


// Binary Tree Node
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class TreeTraversal {

    // Inorder Traversal (Left -> Root -> Right)
    void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Preorder Traversal (Root -> Left -> Right)
    void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Postorder Traversal (Left -> Right -> Root)
    void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        TreeTraversal tree = new TreeTraversal();

        // Creating Tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Inorder Traversal: ");
        tree.inorder(root);

        System.out.print("\nPreorder Traversal: ");
        tree.preorder(root);

        System.out.print("\nPostorder Traversal: ");
        tree.postorder(root);
    }
}
