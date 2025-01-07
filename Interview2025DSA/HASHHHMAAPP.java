package Interview2025DSA;
import java.util.HashMap;
public class HASHHHMAAPP {



        public static void main(String[] args) {
            // Create a HashMap
            HashMap<String, Integer> map = new HashMap<>();

            // Add key-value pairs
            map.put("Apple", 3);
            map.put("Banana", 2);
            map.put("Orange", 5);

            // Get value for a key
            System.out.println("Value for 'Apple': " + map.get("Apple")); // Output: 3

            // Check if a key exists
            System.out.println("Contains 'Banana'? " + map.containsKey("Banana")); // Output: true

            // Remove a key-value pair
            map.remove("Orange");

            // Iterate through the HashMap
            for (String key : map.keySet()) {
                System.out.println(key + ": " + map.get(key));
            }

            // Size of HashMap
            System.out.println("Size: " + map.size()); // Output: 2
        }
    }


