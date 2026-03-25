package restartEverythingDSAMarch2026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class InsideList {

    public static void main(String[] args) {


        List<List<Integer>> list = new ArrayList<>();

        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(4, 5, 6);

        list.add(l1);
        list.add(l2);

        System.out.println(list);


        int[] arr = {1,2,2,3};

        HashSet<Integer> set = new HashSet<>();
        for(int num : arr) {
            set.add(num);
        }

        System.out.println(set);
    }
}