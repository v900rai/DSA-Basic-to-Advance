package DSA100Challenge;
import java.util.ArrayList;
public class EvenLamdaExpression {
    // A Java program to demonstrate simple lambda expressions


        public static void main(String args[])
        {
            // Creating an ArrayList with elements
            // {1, 2, 3, 4}
            ArrayList<Integer> arrL = new ArrayList<Integer>();
            arrL.add(1);
            arrL.add(2);
            arrL.add(3);
            arrL.add(4);

            // Using lambda expression to print all elements
            // of arrL
            arrL.forEach(n -> System.out.print(n +""));

            // Using lambda expression to print even elements
            // of arrL
            arrL.forEach(n -> {
                if (n % 2 == 0)
                    System.out.println(n);
            });
        }
    }


