package CompleteJavaCollectionsFramework2025;

import java.util.ArrayList;
import java.util.List;

public class ArrayListtttAlllMethods {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.get(2));
        System.out.println(list.size());
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
