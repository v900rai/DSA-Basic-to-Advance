package restartEverythingDSA2026;

import java.util.HashSet;
import java.util.Set;

public class UnionofTwoArrays {

        public static void main(String[] args) {
            int[] a = {1,2,3};
            int[] b = {3,4,5};

            //Set<Integer> set = new HashSet<>();
            Set<Integer> set = new HashSet<>();

            for (int x : a)
                set.add(x);
            for (int x : b)
                set.add(x);

            System.out.println(set);
        }
    }


