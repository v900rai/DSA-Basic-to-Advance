package ArraysInterviewPeoblem2025;

public class MaxProfit {
    public static void main(String args[]){
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int [] prices){

        int res=0;
        for(int i=0; i<prices.length-1; i++){
            for(int j=i+1; j<prices.length-1; j++){
                res=Math.min(res ,prices[j]-prices[i]);
            }
        }
        return res;
    }
}
