package LeetcodeProblemsAndGeeksForGeeks;

public class PrintTable {
    public static void printTable(int n) {
        for (int i = 1; i < n; i++) {
            System.out.println(i + " i " + n + " " + n * i);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printTable(n);
    }
}
