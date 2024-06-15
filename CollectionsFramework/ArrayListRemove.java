package CollectionsFramework;

import java.util.ArrayList;

public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<String> Name = new ArrayList<String>();
        Name.add("Vishal");
        Name.add("Ajay");
        Name.add("arohi");
        Name.add("rai");
        System.out.println(Name);
        Name.remove(1);
        System.out.println(Name);
        Name.set(0,"rahul");
        System.out.println(Name);

    }
}
