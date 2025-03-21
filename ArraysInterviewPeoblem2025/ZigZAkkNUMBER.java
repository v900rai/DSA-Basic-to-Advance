package ArraysInterviewPeoblem2025;
import java.util.Arrays;
public class ZigZAkkNUMBER {
    // Java program to sort an array in Zig-Zag form



        static int arr[] = new int[] { 4, 3, 7, 8, 6, 2, 1 };
        static void zigZag()
        {
            // sort the array using the sort function
            Arrays.sort(arr);
            // traverse the array from 1 to N -1
            for (int i = 1; i <= arr.length - 2; i += 2) {
                // swap the current element with the next
                // element
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Driver method to test the above function
        public static void main(String[] args)
        {
            zigZag();
            // print the complete array
            System.out.println(Arrays.toString(arr));
        }
    }

