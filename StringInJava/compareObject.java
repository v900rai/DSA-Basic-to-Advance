package StringInJava;

public class compareObject {
    public static void main(String[] args) {
        String str="vishal";
        String st2= new String("vishal");
        if(str== st2){
            System.out.println("both are equal ");
        }
        else{
            System.out.println("both are not equal ");
        }
    }
}
