package NumberProgram;

public class OddEvenCheckMain {
    public static void main(String[] args) {
        int number=27;

        if ( number % 2 == 0 )
        {
            // If remainder is 0, it is even number
            System.out.println("Number is even");
        }
        else
        {
            // If remainder is 1, it is odd number
            System.out.println("Number is odd.");
        }
    }
}
