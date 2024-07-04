package selfpractices.InterviewOnly;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

public class JavaStreamInEvenNumberFindOut {
    public static void main(String args[]) {
        List<Integer> list= Arrays.asList(10,20,30,40,50);
        List<Integer> filteredlist=list.stream().filter(i ->i%2==0).toList();
        System.out.println(filteredlist);


    }
}
