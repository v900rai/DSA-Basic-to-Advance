package Interview2025DSA;

public class CountTheObject {
    public static int count=0;
    public CountTheObject (){
        count++;
    }

    public static void main(String[] args) {
        CountTheObject obj1=new CountTheObject();
        CountTheObject obj2=new CountTheObject();
        CountTheObject obj3=new CountTheObject();
        CountTheObject obj4=new CountTheObject();
        System.out.println("Number of objects created are "
                + CountTheObject.count);

    }
}
