package restartEverythingDSA2026;

import java.util.List;

public class SkipExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,202,30,40);
        List<Integer> result = list.stream()
                .skip(2)
                .toList();
        System.out.println(result); // [30, 40]
    }
}
