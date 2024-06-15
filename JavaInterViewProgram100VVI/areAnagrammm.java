package JavaInterViewProgram100VVI;

import java.util.Arrays;

public class areAnagrammm {
    public static boolean areAnagram(char str1[], char str2[]) {
        // Get lengths of both strings
        int s1 = str1.length;
        int s2 = str2.length;
        // compair krna h ab
        if (s1 != s2) {
            return false;
        }

        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);
        // Compare sorted strings
        for (int i = 0; i < s1; i++) {
            if (str1[i] != str2[i]) {
                return false;

            }
        }
        return true;
    }
    public static void main(String[] args) {

        char str1[] = { 't', 'e', 's', 't' };
        char str2[] = { 't', 't', 'e', 'w' };
        // Function Call
        if (areAnagram(str1, str2))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");

    }
}
