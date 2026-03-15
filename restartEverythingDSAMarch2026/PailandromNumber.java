package restartEverythingDSAMarch2026;

public class PailandromNumber {
    public static void main(String[] args) {
        int n =121;
        int temp = n;
        int rev =0;
        while (n !=0){
            int digit = n % 10;
            rev = rev * 10 +digit;
            n = n/10;
        }
        if(temp == rev){
            System.out.println("IsPalindrome Number");
        }
        else {
            System.out.println("Not Palindrome number");
        }
    }
}
