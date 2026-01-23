package restartEverythingDSA2026;

import java.util.Stack;

public class ReverseStringStack {



        public static void main(String[] args) {

            String str = "hello";
            Stack<Character> stack = new Stack<>();

            // push all characters
            for(char ch : str.toCharArray()){
                stack.push(ch);
            }

            // pop and build reverse string
            StringBuilder rev = new StringBuilder();
            while(!stack.isEmpty()){
                rev.append(stack.pop());
            }

            System.out.println(rev.toString());
        }
    }


