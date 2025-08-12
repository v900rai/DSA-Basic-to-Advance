package JavaInterViewProgram100VVI;

import java.util.Stack;

public class SatckUsingreversString {

    public static void main(String[] args) {

        String s = "geeksforgeeks";
        System.out.println(s);
        System.out.println(reverse(s));
    }
    public static String reverse(String str){

        Stack<Character> stack = new Stack<>();
        //push all character onto the stack
        for(char ch : str.toCharArray()){
            stack.push(ch);
        }

        // top character to from the revers string krna
        StringBuilder res=new StringBuilder();
        while (!stack.empty()){
            res.append(stack.pop());
        }
        return res.toString();
    }
}
