package restartEverythingDSA2026;


    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }


public class TreeTraversal {
        // Inorder: L - Root - R
        void inorder(Node root) {
            if (root == null) return;
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        // Preorder: Root - L - R
        void preorder(Node root) {
            if (root == null) return;
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        // Postorder: L - R - Root
        void postorder(Node root) {
            if (root == null) return;
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public static void main(String[] args) {
            TreeTraversal t = new TreeTraversal();

            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);

            System.out.print("Inorder: ");
            t.inorder(root);

            System.out.print("\nPreorder: ");
            t.preorder(root);

            System.out.print("\nPostorder: ");
            t.postorder(root);
        }
    }


