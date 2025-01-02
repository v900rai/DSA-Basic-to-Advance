package Interview2025DSA;

import java.util.Scanner;
import java.util.Stack;

public class ReversStringUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();

        // Create a stack to store characters of the string
        Stack<Character> stack = new Stack<>();

        // Push each character of the string onto the stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        System.out.print("Reversed string: ");

        // Pop all characters from the stack and print them
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        sc.close(); // Close the scanner
    }
}
