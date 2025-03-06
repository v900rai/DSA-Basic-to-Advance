package StringAllJavaProgram2025;

public class PalindromeStringInJava {
    public static void main(String args[]){
        String s = "abba";
        System.out.println(isPalindrome(s));
    }
    public static int isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right))
                return 0;
                left++;
                right--;

        }
        return 1;

    }
}
/*

Time Complexity: O(n), where n is the length of the input string.
Auxiliary Space: O(1), no extra data structures used.*/
