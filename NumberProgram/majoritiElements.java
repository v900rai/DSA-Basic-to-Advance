package NumberProgram;

public class majoritiElements {

        static int majorityElement(int arr[]) {
            int n = arr.length;

            for (int i = 0; i < n; i++) {
                int count = 0;

                // Count occurrences of arr[i]
                for (int j = 0; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                // Check if count is greater than n/2
                if (count > n / 2) {
                    return arr[i];
                }
            }

            // If no majority element exists
            return -1;
        }

        public static void main(String[] args) {
            int[] arr = {2, 2, 1, 1, 2, 2};
            System.out.println("Majority Element: " + majorityElement(arr)); // Output: 2
        }
    }


