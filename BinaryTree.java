

class Nodee{
    int data;
    Nodee left;
    Nodee right;
    Nodee(int d) {
        data = d;
        left = null;
        right = null;
    }
}

class Binary{
    public static void main(String[] args) {
        // Initialize and allocate memory for tree nodes
        Nodee firstNode = new Nodee(2);
        Nodee secondNode = new Nodee(3);
        Nodee thirdNode = new Nodee(4);
        Nodee fourthNode = new Nodee(5);

        // Connect binary tree nodes
        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = fourthNode;

    }
}
