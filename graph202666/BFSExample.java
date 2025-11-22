//package graph202666;
//import java.util.*;
//
//class Node{
//    int data;
//    Node left;
//    Node right;
//    public Node(int data){
//        this.data=data;
//    }
//}
//public class BFSExample {
//    public static void bfs(Node root) {
//        if (root == null)
//            return;
//
//        Queue<Node> queue = new LinkedList<>();
//        queue.add(root);
//
//        while (!queue.isEmpty()) {
//            Node node = queue.poll();
//            System.out.print(node.data + " ");
//
//            if (node.left != null)
//                queue.add(node.left);
//
//            if (node.right != null)
//                queue.add(node.right);
//        }
//    }
//
//    public static void main(String[] args) {
//
//        // Creating simple tree
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//
//        System.out.println("BFS Traversal:");
//        bfs(root);
//    }
//}
