package graph202666;


    class  Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }


public class DFSExample {

        // DFS - Preorder Traversal (Root → Left → Right)
        public static void preorder(Node root) {
            if (root == null)
                return;

            System.out.print(root.data + " ");   // Root
            preorder(root.left);                 // Left
            preorder(root.right);                // Right
        }

        // DFS - Inorder Traversal (Left → Root → Right)
        public static void inorder(Node root) {
            if (root == null)
                return;

            inorder(root.left);                  // Left
            System.out.print(root.data + " ");   // Root
            inorder(root.right);                 // Right
        }

        // DFS - Postorder Traversal (Left → Right → Root)
        public static void postorder(Node root) {
            if (root == null)
                return;

            postorder(root.left);                // Left
            postorder(root.right);               // Right
            System.out.print(root.data + " ");   // Root
        }

        public static void main(String[] args) {

            // Creating Tree
        /*
                1
              /   \
             2     3
            / \
           4   5
         */
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.left.left=new Node(6);
            root.left.right= new Node(7);

            System.out.println("DFS Preorder (Root → Left → Right):");
            preorder(root);

            System.out.println("\nDFS Inorder (Left → Root → Right):");
            inorder(root);

            System.out.println("\nDFS Postorder (Left → Right → Root):");
            postorder(root);
        }
    }


