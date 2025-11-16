package restartEverythingDSA2026;

public class Recursion1 {




    public static void sayHello(int n){
        if(n == 0){
            return; // base case
        }
        System.out.println("Hello Vishal Rai!");
        sayHello(n-1);
    }





    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n * fact(n-1);
    }



    public static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1) +fib(n-1);
    }




    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        return (n%10)+sum(n/10);
    }

    public static int reverse(int n, int rev) {
        if (n == 0) return rev;
        return reverse(n / 10, rev * 10 + (n % 10));
    }


    public static void main(String[] args) {
        sayHello(3);

        int n= 5;
        System.out.println(fact(n));

        int x=5;
        System.out.println(fib(x));


        int b=123;
        System.out.println(sum(b));




    }

}
