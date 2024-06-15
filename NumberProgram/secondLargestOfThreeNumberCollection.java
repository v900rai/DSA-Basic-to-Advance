package NumberProgram;

import java.util.ArrayList;
import java.util.Collection;
import java.lang.*;
import java.util.Collections;

public class secondLargestOfThreeNumberCollection {
    public static void main(String []args){
        int a=19;
        int b=29;
        int c=39;
        ArrayList<Integer> ad= new ArrayList<>();
        ad.add(a);
        ad.add(b);
        ad.add(c);
        System.out.println("Printing the number "+ Collections.max(ad));

    }
}
