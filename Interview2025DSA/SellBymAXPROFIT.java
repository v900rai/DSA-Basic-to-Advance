package Interview2025DSA;

public class SellBymAXPROFIT {

        public static int maxProfit(int[] price) {
            int maxProfit = 0; // Initialize with 0 as no profit is made yet
            int minSofar = price[0]; // First element as the initial minimum

            for (int i = 0; i < price.length; i++) {
                minSofar = Math.min(minSofar, price[i]); // Update minimum price
                int profit = price[i] - minSofar; // Calculate profit with the current price
                maxProfit = Math.max(maxProfit, profit); // Update maxProfit
            }

            return maxProfit;
        }

        public static void main(String[] args) {


            // Test Case 1
            int[] prices1 = {7, 1, 5, 3, 6, 4};
            System.out.println("Max Profit (Test Case 1): " + maxProfit(prices1)); // Expected Output: 5

            // Test Case 2
            int[] prices2 = {7, 6, 4, 3, 1};
            System.out.println("Max Profit (Test Case 2): " +maxProfit(prices2)); // Expected Output: 0

            // Test Case 3
            int[] prices3 = {2, 4, 1};
            System.out.println("Max Profit (Test Case 3): " + maxProfit(prices3)); // Expected Output: 2
        }
    }


