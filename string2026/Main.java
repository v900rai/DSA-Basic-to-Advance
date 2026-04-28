package string2026;
class Calculator {

    // Method 1
    int add(int a, int b) {
        return a + b;
    }

    // Method 2 (different parameters)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3 (different data type)
    double add(double a, double b) {
        return a + b;
    }


}

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Sum 2 numbers: " + calc.add(10, 20));
        System.out.println("Sum 3 numbers: " + calc.add(10, 20, 30));
        System.out.println("Sum double: " + calc.add(10.5, 20.5));
    }
}