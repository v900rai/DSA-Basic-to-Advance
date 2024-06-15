package CollectionsFramework;

import java.util.Vector;
import java.util.Iterator;

public class VectorMax {
    public static void main(String []args){
        Vector<Integer> v=new Vector<>();
        // Adding elements in vector
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        int max_value=Integer.MIN_VALUE;
      //  Iterable itr=v.iterator();
        Iterator itr = v.iterator();
        while (itr.hasNext()){
            // Moving iterator to next element
            int element = (Integer)itr.next();
            if(element>max_value){
                max_value=element;

            }

        }

        // Print maxVaue
        System.out.println(
                "The largest element present in Vector is : "
                        + max_value);
    }
}
