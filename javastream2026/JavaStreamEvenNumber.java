package javastream2026;

import java.util.Arrays;
import java.util.List;

public class JavaStreamEvenNumber {


        public static void main(String[] args) {

            List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

            list.stream()

                    .filter(num -> num % 2 == 0)
                    .map(num -> num * 2)
                    .forEach(System.out::println);
        }
    }
