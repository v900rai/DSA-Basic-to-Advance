package PatternInJava;

public class PrintNaturalNumberRecursion {
    public static void printNaturalNumber(int n) {
    if (n <= 0) {
        return;
    }
    printNaturalNumber(n - 1);
        System.out.print(n + " ");
}
    public static void main(String[] args) {
        int n=10;
        printNaturalNumber(n);
    }
}
