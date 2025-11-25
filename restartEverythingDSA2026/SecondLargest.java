package restartEverythingDSA2026;


import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 1, 8, 3, 9, 4);

        int secondLargest = nums.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(-1);

        System.out.println("Second Largest: " + secondLargest);
    }
}
