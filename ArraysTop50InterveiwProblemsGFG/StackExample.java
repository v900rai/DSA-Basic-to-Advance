package ArraysTop50InterveiwProblemsGFG;


    import java.util.Stack;

    public class StackExample {
        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();

            // Push elements
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);

            System.out.println("Stack: " + stack); // [10, 20, 30]

            // Peek
            System.out.println("Top element: " + stack.peek()); // 30

            // Pop
            System.out.println("Popped: " + stack.pop()); // 30

            // Search
            System.out.println("Position of 10: " + stack.search(10)); // 2

            // Check empty
            System.out.println("Is empty? " + stack.isEmpty()); // false

            // Size
            System.out.println("Size: " + stack.size()); // 2
        }
    }


