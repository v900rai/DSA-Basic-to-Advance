package restartEverythingDSAMarch2026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInSideList {

    public static void main(String[] args) {

        List<List<Integer>> list = new ArrayList<>();

        list.add(Arrays.asList(1,2,3));
        list.add(Arrays.asList(4,5,6));
        list.add(Arrays.asList(7,8,9));

        System.out.println(list);

        System.out.println(list.get(0));      // [1,2,3]

        System.out.println(list.get(0).get(1)); // 2
    }
}
