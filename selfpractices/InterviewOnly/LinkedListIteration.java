package selfpractices.InterviewOnly;


    import java.util.LinkedList;
import java.util.Iterator;

    public class LinkedListIteration {
        public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<>();
            list.add("Alice");
            list.add("Bob");
            list.add("Charlie");

            // Iterate using an iterator
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }


