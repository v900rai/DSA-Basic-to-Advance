package DSA100Challenge;

public class SellStockBuy {
    public static void main(String[] args) {
        int arr[]={5,2,6,1,4};
        System.out.println(buyProduct(arr));

    }
    private  static int buyProduct(int arr[]) {
        int maxProfit = 0;
        int minSofar = arr[0];
        for (int i = 0; i < arr.length; i++) {
            minSofar = Math.min(minSofar, arr[i]);
            int profit = arr[i] - minSofar;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

}
