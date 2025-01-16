package HashSetInJava;


    import java.util.ArrayList;
import java.util.Iterator;

    public class IteratorRemoveExample {
        public static void main(String[] args) {
            // Create a list
            ArrayList<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);

            // Get an iterator
            Iterator<Integer> iterator = list.iterator();

            // Remove elements greater than 25
            while (iterator.hasNext()) {
                int value = iterator.next();
                if (value <25) {
                    iterator.remove(); // Safe removal
                }
            }

            // Print the modified list
            System.out.println("Modified list: " + list);
        }
    }


