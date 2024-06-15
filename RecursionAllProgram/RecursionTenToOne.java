package RecursionAllProgram;

public class RecursionTenToOne {
    public static void main(String[] args) {
        printtt(1);

    }
    public static void printtt(int n){
        if(n==11){
            return ;
        }

        printtt(n+1);
        System.out.print(n+" ");
    }
}
