package restartEverythingDSAMarch2026;

import java.util.Stack;

public class StackPop {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.peek());

      //  int removed = stack.pop();

       // System.out.println("Removed: " + removed);
        System.out.println(stack);
    }
}
