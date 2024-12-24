package NumberProgram;

public class SumOFDigits {
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;

        while (num > 0) { // Loop until all digits are processed
            int digit = num % 10; // Extract the last digit
            sum += digit;         // Add the digit to the sum
            num = num / 10;       // Remove the last digit
        }

        System.out.println("Sum of digits: " + sum); // Print the final sum
    }

}

