package systemdesign;


public class Main {
    public static void main(String[] args) {

        AuthService auth = new AuthService();

        boolean result = auth.login("vishal", "1234");

        if(result) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }
}