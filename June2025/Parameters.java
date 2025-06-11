package June2025;

public class Parameters {
    public static void myMethodsParameters(String name){
        System.out.println(name +" Rai");
    }
    // one more methods are created parameters and few attributes
    public static void myMethodsFewParameters(String name , int age){
        System.out.println(name +" is "+age);
    }

    public static void main(String[] args) {
        myMethodsParameters("vishal ");
        myMethodsFewParameters(" vishal ", 29);
    }
}
