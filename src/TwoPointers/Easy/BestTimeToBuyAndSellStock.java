package TwoPointers.Easy;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int maxDiff = 0;
        int left = 0;
        int right = 1;
        while(right < prices.length) {
            if(prices[left] > prices[right]){
                left++;
                right = left + 1;
            } else {
                if (prices[right] - prices[left] > maxDiff) {
                    maxDiff = prices[right] - prices[left];
                }
                right++;
            }

        }
        return maxDiff;
    }

    public static void main(String[] args) {
        maxProfit(new int[]{2,1,2,1,0,1,2});
    }
}
