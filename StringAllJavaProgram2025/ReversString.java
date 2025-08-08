package StringAllJavaProgram2025;

public class ReversString {
    public static void main(String args[]){
        String str ="vishalrai";
        char ch;
        String rev =" ";

        for(int i=0; i<str.length(); i++){
            //extracts each character

            ch=str.charAt(i);

            // adds each character in
            // front of the existing string
            rev =ch+rev;

        }
        System.out.println(rev);
    }
}
