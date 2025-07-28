package JavaStream8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LIstttt {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ajay","vishal","sachin","amit");

       Long updateName = names.stream()
               .count();

        System.out.println(updateName);

    }
}
