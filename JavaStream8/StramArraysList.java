package JavaStream8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StramArraysList {
    public static void main(String args[]){
        List<String>  list= Arrays.asList("Apple", "banana", "cherry");
        Stream<String> myStream = list.stream();
    }
}
