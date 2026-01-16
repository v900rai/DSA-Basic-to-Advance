package restartEverythingDSA2026;

import java.util.Stack;

public class StackSum {

    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);

        int sum = 0;

        while(!st.isEmpty()){
            sum = sum+ st.pop();
        }
        System.out.println(sum);
    }
}
