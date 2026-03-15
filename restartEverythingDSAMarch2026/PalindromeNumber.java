package restartEverythingDSAMarch2026;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }
    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while (left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
