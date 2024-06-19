package selfpractices.InterviewOnly;


    import java.util.Scanner;

    public class DifferenceOfTwoArrays {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read the size of the arrays
            System.out.print("Enter the size of the arrays: ");
            int size = scanner.nextInt();

            // Initialize the arrays
            int[] array1 = new int[size];
            int[] array2 = new int[size];
            int[] diffArray = new int[size];

            // Read elements for the first array
            System.out.println("Enter elements for the first array:");
            for (int i = 0; i < size; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                array1[i] = scanner.nextInt();
            }

            // Read elements for the second array
            System.out.println("Enter elements for the second array:");
            for (int i = 0; i < size; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                array2[i] = scanner.nextInt();
            }

            // Compute the difference between corresponding elements of both arrays
            for (int i = 0; i < size; i++) {
                diffArray[i] = array1[i] - array2[i];
            }

            // Print the resultant difference array
            System.out.println("The resultant array after computing the difference between the two arrays is:");
            for (int i = 0; i < size; i++) {
                System.out.print(diffArray[i] + " ");
            }

            // Close the scanner
            scanner.close();
        }
    }


