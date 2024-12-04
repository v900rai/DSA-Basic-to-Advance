package December2024;

public class StringRotatingLeetcodeProblem {

        // Function to check if two strings are rotations of each other or not.
        public static boolean areRotations(String s1, String s2) {
            // Check if lengths are not the same
            if (s1.length() != s2.length()) {
                return false;
            }

            // Concatenate s1 with itself
            String concatenated = s1 + s1;

            // Check if s2 is a substring of concatenated string
            return concatenated.contains(s2);
        }

        public static void main(String[] args) {
            String s1 = "ABCD";
            String s2 = "CDAB";

            if (areRotations(s1, s2)) {
                System.out.println("Strings are rotations of each other");
            } else {
                System.out.println("Strings are not rotations of each other");
            }
        }


}
