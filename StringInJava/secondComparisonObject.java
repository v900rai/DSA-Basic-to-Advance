package StringInJava;

public class secondComparisonObject {
    public static void main(String[] args) {
        String str="vishal";
        String st2= new String("vishal");
        if(str.equals(st2) ){
            System.out.println("both are equal ");
        }
        else{
            System.out.println("both are not equal ");
        }
    }
}
