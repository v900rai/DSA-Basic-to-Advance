package RecursionAllProgram;

public class RecursionSecondMethodfibonaic {
    public static void main(String[] args) {
        int n = 5;
        int secondLast = 0;
        int last = 1;
        System.out.println("The Fibonacci Series up to " + n + "th term:");
        System.out.print(secondLast + " " + last + " ");

        for (int i = 2; i <= n; i++) {
            int temp = last + secondLast;
            secondLast = last;
            last = temp;
            System.out.print(temp + " ");
        }
    }
}
