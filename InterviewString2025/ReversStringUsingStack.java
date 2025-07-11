package InterviewString2025;
import java.util.*;
public class ReversStringUsingStack {
    // Java program to reverse a string using stack
        static String reverseString(String s) {
            Stack<Character> st = new Stack<>();

            // Push the characters into stack
            for (int i = 0; i < s.length(); i++)
                st.push(s.charAt(i));

            StringBuilder res = new StringBuilder();

            // Pop the characters of stack into the original string
            for (int i = 0; i < s.length(); i++)
                res.append(st.pop());

            return res.toString();
        }

        public static void main(String[] args) {
            String s = "abdcfe";
            System.out.println(reverseString(s));
        }
    }