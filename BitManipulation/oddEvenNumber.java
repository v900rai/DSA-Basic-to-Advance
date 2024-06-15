package BitManipulation;

public class oddEvenNumber {
    public static String oddEven(int N){
        if((N & 1)==0){
            return "even";
        }
        return "odd";
    }
    public static void main(String []args){
        int num=10;
        System.out.println( oddEven(num));
    }
}
