package recursion2025;

public class FirstProgram {
    public static void main(String args[]){
        System.out.println("Factorial of 5 : " + fact(5));
    }
    public static int  fact(int n){
        if(n==0){
            return 1;
        }
        return n * fact(n-1);

    }
}
