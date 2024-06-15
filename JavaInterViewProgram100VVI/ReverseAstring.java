package JavaInterViewProgram100VVI;

public class ReverseAstring {
    public static void main(String[] args) {
        String str="vishal";
        String rev="";

        System.out.print("Original word: ");
        System.out.println(str); //Example word
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            rev=ch+rev;
        }
        System.out.println(rev  +  "   Reversed words");
    }
}
