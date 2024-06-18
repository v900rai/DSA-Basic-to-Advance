package selfpractices.InterviewOnly;


    import java.util.Scanner;

    public class RectanglesInCircle {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the radius of the circle
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();

            // Since any rectangle can be inscribed in a circle, and for an inscribed circle
            // we consider infinite possible rectangles, we simplify the output
            System.out.println("The number of rectangles that can be inscribed in the circle is theoretically infinite.");

            // Close the scanner
            scanner.close();
        }
    }


