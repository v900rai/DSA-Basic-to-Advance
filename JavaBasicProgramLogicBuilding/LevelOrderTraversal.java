package JavaBasicProgramLogicBuilding;

import java.util.*;

// Binary Tree Node class


public class LevelOrderTraversal {

    // Level Order Traversal (BFS)
    void levelOrder(Node root) {
        if (root == null) return; // agar tree empty hai to kuch print na karo

        // Queue ka use karenge BFS traversal ke liye
        Queue<Node> queue = new LinkedList<>();
        queue.add(root); // root ko queue me daal diya




        // jab tak queue empty nahi hoti tab tak process karte rahenge
        while (!queue.isEmpty()) {
            // queue ke front element ko nikaalo
            Node current = queue.poll();
            System.out.print(current.data + " "); // current node ka data print karo

            // agar left child exist karta hai to usse queue me daalo
            if (current.left != null) {
                queue.add(current.left);
            }

            // agar right child exist karta hai to usse queue me daalo
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        LevelOrderTraversal tree = new LevelOrderTraversal();

        // Tree banaya:
        //         1
        //       /   \
        //      2     3
        //     / \
        //    4   5
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Level Order Traversal print karna
        System.out.print("Level Order Traversal: ");
        tree.levelOrder(root);
    }
}
