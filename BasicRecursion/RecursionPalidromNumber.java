package BasicRecursion;

public class RecursionPalidromNumber {
    public static boolean isPal(String s, int l, int r){
        if(l>=r){
            return true;

        }
        if(s.charAt(l) != s.charAt(r)){
            return false;
        }
        return isPal(s, l+1, r-1);
    }
    public static void main(String[] args) {

        String str = "madam";  // test string

        if (isPal(str, 0, str.length() - 1)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is NOT a Palindrome");
        }
    }
}
