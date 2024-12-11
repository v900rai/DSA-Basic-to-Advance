package December2024;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListtTraversalsAllmethosa {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(11);
        list.add(88);
        list.add(11);
        list.add(100);
        for(Integer x:list){
            System.out.println(x);
        }

       /* Iterator<Integer> it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/
    }
}
