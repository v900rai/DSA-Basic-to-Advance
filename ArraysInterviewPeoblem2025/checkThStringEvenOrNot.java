package ArraysInterviewPeoblem2025;

public class checkThStringEvenOrNot {

        // Method to print words with even length
        public static void printWords(String s) {
            // Split the string into words based on spaces
            for (String w : s.split(" ")) {
                // Check if the length of the word is even
                if (w.length() % 2 == 0)
                    System.out.println(w); // Print the word
            }
        }

        public static void main(String[] args) {
            // Given input string
            String s = "i am Geeks for Geeks and a Geek";

            // Call the method to print even length words
            printWords(s);
        }
    }


