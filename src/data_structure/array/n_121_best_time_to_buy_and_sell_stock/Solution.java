package data_structure.array.n_121_best_time_to_buy_and_sell_stock;

public class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            buy = Math.min(buy, prices[i]);
            profit = Math.max(profit, prices[i] - buy);
        }
        return profit;
    }

    public static void main(String[] args){
        Solution sol = new Solution();
        int[] prices = {7,2,5,3,1, 6, 7, 0, 1, 1, 1};
        System.out.println(sol.maxProfit(prices));
    }
}
