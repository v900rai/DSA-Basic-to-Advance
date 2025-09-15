package MapAdvancdQ;

import java.util.*;

public class RemoveDuplicate {

    public static void main(String[] args) {
        List<String > list= new ArrayList<>(Arrays.asList("A","A","B","B","C"));
        Set<String> uniqueSet= new HashSet<>(list);
        //remove the duplicate elements
        System.out.println("Unique Elements :" +uniqueSet);

    }
}
