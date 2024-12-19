package NumberProgram;

public class FibonacciseriesJava {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c;
        int count=10;
        System.out.print(a+" " +b);
        for(int i=2; i<10; i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }

}
