package Interview2025DSA;

public class RecursionPrintThe12345 {
    public static void fun2(int n){
        if(n>0){
            fun2(n-1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        int x=5;
        fun2(x);
    }
}
