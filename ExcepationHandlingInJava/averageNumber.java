package ExcepationHandlingInJava;

public class averageNumber {
    public static void main(String[] args) {
        // Declare an integer array 'numbers' and initialize it with values.
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        int sum=0;
        for (int i = 0; i <numbers.length ; i++) {
            sum=sum+i;
        }
        // Calculate the average value by dividing the sum by the number of elements.
        double average = sum / numbers.length;

        // Print the calculated average value to the console.
        System.out.println("Average value of the array elements is : " + average);


        }

    }
