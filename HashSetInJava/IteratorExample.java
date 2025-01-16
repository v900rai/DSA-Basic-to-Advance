package HashSetInJava;


    import java.util.ArrayList;
import java.util.Iterator;

    public class IteratorExample {
        public static void main(String[] args) {
            // Create a list
            ArrayList<String> list = new ArrayList<>();
            list.add("Apple");
            list.add("Banana");
            list.add("Cherry");

            // Get an iterator
            Iterator<String> iterator = list.iterator();

            // Iterate over the list
            System.out.println("Iterating over elements:");
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }


