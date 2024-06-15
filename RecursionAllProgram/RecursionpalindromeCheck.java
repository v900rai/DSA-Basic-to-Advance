package RecursionAllProgram;

public class RecursionpalindromeCheck {
    public static void main(String[] args) {
        String str="abcxa";
        System.out.println(printPalindrome(str, 0, str.length()-1));
    }
    public static boolean printPalindrome(String str, int start, int end){
        if(start >= end) return true;
        if(str.charAt(start) != str.charAt(end)) return false;
        return printPalindrome(str, start+1, end-1);
    }
}
