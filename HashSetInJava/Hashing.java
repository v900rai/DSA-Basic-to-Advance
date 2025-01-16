package HashSetInJava;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String [] args){
        HashSet<Integer> set=new HashSet<>();
        // insert
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);

        System.out.println("print  all elements "+set);

        // list.add(el) same methods hota h yaha pr bhi
       // Iterator
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println("iterator  "+it.next());
        }


        // size();
        System.out.println(set.size());
        // search ... contains elements
        if(set.contains(10)){
            System.out.println("set contains 10");
        }if(!set.contains(50)) {
            System.out.println("does not contains set");
        }
    }

}
