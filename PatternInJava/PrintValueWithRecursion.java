package PatternInJava;

public class PrintValueWithRecursion {
    public static void main(String[] args) {
        int a=5;
        printNumberWithoutLoop(a);

    }
    public static void printNumberWithoutLoop(int n){
        if(n> 0){
            printNumberWithoutLoop(n-1);
            System.out.println(n);

        }
        return ;

    }
}
