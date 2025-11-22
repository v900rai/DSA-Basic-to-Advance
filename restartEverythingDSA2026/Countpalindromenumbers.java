package restartEverythingDSA2026;

public class Countpalindromenumbers {

    public static boolean isPalindrome(int n){
        int temp = n;
        int rev =0;
        while (temp!= 0){
            int digit = temp% 10;
            rev = rev * 10 + digit;
            temp =temp/10;
        }
        return  rev == n;

    }

    public static void main(String[] args) {
        int[] nums = {121, 133, 454, 123};

        int count = 0;
        for (int n : nums) {
            if (isPalindrome(n))
                count++;
        }

        System.out.println("Palindrome numbers: " + count);
    }

    }

