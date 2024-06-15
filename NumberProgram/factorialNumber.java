package NumberProgram;

public class factorialNumber {
    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++)
            factorial = factorial * i;
        return factorial;

    }

        public static void main(String []args){
            int num = 5;
            System.out.println("Factorial of " + num + " is "
                    + factorial(5));
        }
}


