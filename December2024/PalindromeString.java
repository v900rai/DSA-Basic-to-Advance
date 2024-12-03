package December2024;

public class PalindromeString {
    public static void main(String[] args) {


        String name = "madam";
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);

        }
        if(name.equals(rev)){
            System.out.println("It is a Palindrome String ");
    }
        else{
            System.out.println("it is not palindrome  String ");
        }
}
}
