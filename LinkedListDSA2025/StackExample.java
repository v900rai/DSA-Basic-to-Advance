package LinkedListDSA2025;


    import java.util.*;

    public class StackExample {
        public static void main(String[] args) {
            Stack<Integer> st = new Stack<>();

            // Elements add करना
            st.push(10);
            st.push(20);
            st.push(30);

            System.out.println("Stack: " + st); // [10, 20, 30]

            // Top element देखना
            System.out.println("Top element: " + st.peek()); // 30

            // Remove top element
            System.out.println("Removed: " + st.pop()); // 30

            // Search
            System.out.println("Position of 10: " + st.search(10)); // 2

            // Size
            System.out.println("Size: " + st.size()); // 2

            // Empty check
            System.out.println("Is empty? " + st.isEmpty()); // false

            // Clear stack
            st.clear();
            System.out.println("Stack after clear: " + st); // []
        }
    }


