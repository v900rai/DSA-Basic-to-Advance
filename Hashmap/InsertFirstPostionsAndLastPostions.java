package Hashmap;

import java.util.ArrayList;
import java.util.List;

public class InsertFirstPostionsAndLastPostions {
    public static void main(String []args){
        List<String > list=new ArrayList<>();
        list.add("vishal");
        list.add("ajay");
        list.add("khushi");
        list.add("vipul");
        list.add("arohirai");
       /* for(String s : list){
            System.out.println(s);
        }*/
        System.out.println(list);
        list.add(0 ,"man");
        list.add(3, "raja");
       /* for (String s: list);
        {
            System.out.println(s);
        }*/
        System.out.println(list);

    }
}
