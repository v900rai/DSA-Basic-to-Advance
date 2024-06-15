package BasicRecursion;

public class BasicRecursion {
    private  static void printfirstTen(int value){
        // base case
        if(value==10){
            System.out.print(value);
            return;
        }
        printfirstTen(value+1);
        System.out.print(value);

    }

    public static void main(String[] args) {
        int i=1;
        System.out.println(i);
        printfirstTen(i);
    }
}
