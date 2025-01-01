package Interview2025DSA;

public class FindTheLargestElementsInTheArrays {
    // Java Program to find the largest element in
// array using iterative approach


        // Method to find maximum in arr[]


            public  static  int largest(int arr []){

            // Initialize maximum element
            int max = arr[0];

            // Traversing and comparing max element
            for (int i = 1; i < arr.length; i++)
                if (arr[i] > max)
                    max = arr[i];

            return max;
        }

    public  static  int smallest(int arr []){

        // Initialize maximum element
        int min = arr[0];

        // Traversing and comparing max element
        for (int i = 1; i < arr.length-1; i++)
            if (arr[i] <min)
                min = arr[i];

        return min;
    }

        public static void main(String[] args) {
            int arr[] = {20, 10, 20, 4, 100};
            System.out.println(" big number "+largest(arr));
            System.out.println(" small number "+smallest(arr));
        }
    }

