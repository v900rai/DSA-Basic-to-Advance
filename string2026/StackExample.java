package string2026;



    import java.util.Stack;

    public class StackExample {
        public static void main(String[] args) {

            Stack<Integer> stack = new Stack<>();

            // push() - add elements
            stack.push(10);
            stack.push(20);
            stack.push(30);

            System.out.println("Stack: " + stack);

            // peek() - top element
            System.out.println("Top element: " + stack.peek());

            // pop() - remove top
            System.out.println("Removed: " + stack.pop());

            // size()
            System.out.println("Size: " + stack.size());

            // isEmpty()
            System.out.println("Is Empty: " + stack.isEmpty());

            // search()
            System.out.println("Position of 10: " + stack.search(10));
        }
    }

