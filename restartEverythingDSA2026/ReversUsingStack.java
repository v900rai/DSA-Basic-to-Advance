package restartEverythingDSA2026;

import java.util.Stack;

public class ReversUsingStack {
    public static void main(String args[]){
        String str = "vishal";

        Stack<Character> st = new Stack<>();
        for(char ch : str.toCharArray()){
            st.push(ch);
        }
        StringBuilder s=new StringBuilder();
        while (!st.empty()){
            s.append(st.pop());
        }
        System.out.println("Reversed: " + s.toString());

    }
}
