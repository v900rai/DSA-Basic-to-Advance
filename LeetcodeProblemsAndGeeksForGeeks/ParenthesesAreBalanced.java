package LeetcodeProblemsAndGeeksForGeeks;

import java.util.Stack;

public class ParenthesesAreBalanced {
    public static void main(String[] args) {
        String s = "{([])}";
        if (isBalanced(s))
            System.out.println("true");
        else
            System.out.println("false");

    }

    public static boolean isBalanced(String s) {
        //Declare kr diya hu
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            // Check if the character is an opening bracket krna h vishal
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else {
                if (!st.empty() &&
                        ((st.peek() == '(' && s.charAt(i) == ')') ||
                                (st.peek() == '{' && s.charAt(i) == '}') ||
                                (st.peek() == '[' && s.charAt(i) == ']'))) {
                    st.pop();
                } else {

                    // Unmatched closing bracket
                    return false;
                }
            }

        }
        return st.empty();

    }
}
