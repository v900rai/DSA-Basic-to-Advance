package ArraysInterviewPeoblem2025;

public class PreIncrementsAndPostIncreaments {

        public static void main(String[] args)
        {
            // Interger declared
            int a = 10;
            int b = 10;

            // Using unary operators
            System.out.println("Postincrement : " + (a++)); //10
            System.out.println("Preincrement : " + (++a)); //12

            System.out.println("Postdecrement : " + (b--)); //10
            System.out.println("Predecrement : " + (--b)); //8
    }
}
