package DSA100Challenge;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JavaStream {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(4, 5, 7, 3, 2, 6);
        Stream<Integer> s1=nums.stream();
        s1.forEach(n-> System.out.println(n));

    }
}
