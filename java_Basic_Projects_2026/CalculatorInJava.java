package java_Basic_Projects_2026;
import java.util.Scanner;
public class CalculatorInJava {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Taking two numbers from user
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            // Taking operator
            System.out.print("Enter operator (+ - * /): ");
            char op = sc.next().charAt(0);

            int result = 0;

            // Performing operation
            switch (op) {
                case '+': result = a + b; break;
                case '-': result = a - b; break;
                case '*': result = a * b; break;
                case '/': result = a / b; break;
                default: System.out.println("Invalid operator");
            }

            System.out.println("Result = " + result);
        }
    }


