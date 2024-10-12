package Map;

import java.util.HashMap;
import java.util.Map;

public class MapFirstProgram {
     public static void main(String args[]){
        Map map=new HashMap();
        map.put(101, "vishal");
        map.put(102, "Ajay ");
        map.put(103, "vipul");
        map.put(104, "ifrandus");
        //methods
        //map.clear();
        //System.out.println(map.containsKey(102));
        System.out.println(map.get(101));
        System.out.println(map);
    }
}
