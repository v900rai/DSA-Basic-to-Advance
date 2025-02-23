package AdvancedDataStructureInJava;
import java.util.LinkedList;
import java.util.List;

public class ArarysListAllMethods {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        System.out.println(list.contains(20)); // true
        System.out.println(list.indexOf(20)); // 1
        System.out.println(list.lastIndexOf(20)); // 3
        System.out.println(list.isEmpty()); // false
        System.out.println(list.size()); // 4
    }
}
