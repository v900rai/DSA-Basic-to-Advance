package Interview2025DSA;
import java.util.Stack;
public class Stackkkk {



        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();

            // Push elements
            stack.push(10);
            stack.push(20);
            stack.push(30);

            // Peek the top element
            System.out.println("Top element: " + stack.peek());

            // Pop elements
            System.out.println("Popped element: " + stack.pop());

            // Check if stack is empty
            System.out.println("Is stack empty? " + stack.isEmpty());

            // Search for an element
            System.out.println("Position of 10: " + stack.search(10));
        }
    }


