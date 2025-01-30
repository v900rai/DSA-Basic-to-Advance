package ArraysInterviewPeoblem2025;
import java.util.*;
public class FindTheMinIndexOfcharacter {




        // Function to print the minimum index character
        // in a string.
        static String findMinIndexChar(String S,
                                       String patt) {

            // Iterate over each character in S
            for (int i = 0; i < S.length(); i++) {

                // For each character in S, iterate over
                // each character in patt
                for (int j = 0; j < patt.length(); j++) {

                    // If a character in S matches a character
                    // in patt
                    if (S.charAt(i) == patt.charAt(j)) {

                        // Return the matched character
                        return String.valueOf(S.charAt(i));
                    }
                }
            }
            // If no match is found, return "$"
            return "$";
        }

        public static void main(String[] args) {
            String S = "vishalraivishalrai";
            String patt = "vishal";
            String result = findMinIndexChar(S, patt);
            System.out.println(result);
        }
    }

