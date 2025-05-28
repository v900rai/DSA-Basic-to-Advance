package Stack2025;
import java.util.Stack;
public class StackAllMethodsHere {



        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();

            // 1. push() - Add elements
            stack.push(10);
            stack.push(20);
            stack.push(30);
            System.out.println("Stack: " + stack); // [10, 20, 30]

            // 2. pop() - Remove and return the top element
            int popped = stack.pop();
            System.out.println("Popped: " + popped); // 30
            System.out.println("Stack after pop: " + stack); // [10, 20]

            // 3. peek() - Get the top element without removing
            int top = stack.peek();
            System.out.println("Top element: " + top); // 20

            // 4. empty() - Check if stack is empty
            boolean isEmpty = stack.empty();
            System.out.println("Is stack empty? " + isEmpty); // false

            // 5. search() - Find position of an element (1-based)
            int pos = stack.search(10);
            System.out.println("Position of 10: " + pos); // 2 (since 20 is at top)

            // 6. size() - Get the number of elements
            int size = stack.size();
            System.out.println("Stack size: " + size); // 2
        }
    }

