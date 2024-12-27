package Interview2025DSA;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String str = "hello";
        String remove = "";

        for (int i = 0; i < str.length(); i++) {
            boolean found = false;

            // Check if the character is already in the 'remove' string
            for (int j = 0; j < remove.length(); j++) {
                if (remove.charAt(j) == str.charAt(i)) { // Compare characters correctly
                    found = true;
                    break;
                }
            }

            // If the character is not found in 'remove', add it
            if (!found) {
                remove = remove + str.charAt(i);
            }
        }

        System.out.println("String after removing duplicates: " + remove);
    }
}

