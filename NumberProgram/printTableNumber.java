package NumberProgram;

public class printTableNumber {
    public static void printtbale(int n){
        for(int i=0; i<10; i++){
            System.out.println(n + " * " + i +
                    " = " + n * i);
        }
    }

    public static void main(String[] args) {
        int num=10;
        printtbale(num);
    }
}
