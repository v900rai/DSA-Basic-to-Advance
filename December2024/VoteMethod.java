package December2024;

public class VoteMethod {
    public static void checkAge(int age){
        if(age<18){
            System.out.println( "Access denied - You are not old enough!");
        } else
            System.out.println("Access granted - You are old enough!"); {
            
        }
    }

    public static void main(String[] args) {
        checkAge(20);
    }
}
