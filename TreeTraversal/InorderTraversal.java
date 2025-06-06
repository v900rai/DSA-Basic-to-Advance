package TreeTraversal;
class Node {
    int data;
    Node left;
    Node right;
    public Node(int item){
        this.data = item;
        this.left = null;
        this.right = null;
    }
}

class InorderTraversalll {
    static void inorderTraversal(Node node){
        if(node == null)
            return;

        inorderTraversal(node.left); // Fixed case
        System.out.print(node.data+" ");
        inorderTraversal(node.right); // Fixed case
    }

    static void postOrderTraversal(Node node){
        if(node ==null){
            return ;
        }

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data+" ");

    }
    static void preOderTraversal(Node node){
        if(node ==null){
            return ;
        }
        System.out.print(node.data+" ");
        preOderTraversal(node.left);
        postOrderTraversal(node.right);


    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        inorderTraversal(root);
        // Fixed case
        System.out.println();
        postOrderTraversal(root);
        System.out.println();
        postOrderTraversal(root);
    }
}
