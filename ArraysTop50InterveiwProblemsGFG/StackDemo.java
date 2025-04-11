package ArraysTop50InterveiwProblemsGFG;
import java.util.*;
import java.io.*;

public class StackDemo {
    // Java program to demonstrate the accessing
// of the elements from the stack



        // Main Method
        public static void main(String args[])
        {
            // Creating an empty Stack
            Stack<String> stack = new Stack<String>();

            // Use push() to add elements into the Stack
            stack.push("Welcome");
            stack.push("To");
            stack.push("Geeks");
            stack.push("For");
            stack.push("Geeks");

            // Displaying the Stack
            System.out.println("Initial Stack: " + stack);

            // Fetching the element at the head of the Stack
            System.out.println("The element at the top of the"
                    + " stack is: " + stack.peek());

            // Displaying the Stack after the Operation
            System.out.println("Final Stack: " + stack);
        }
    }



