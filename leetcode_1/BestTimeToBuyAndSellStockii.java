package com.leetcode_1;

//	https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
//	122.买卖股票的最佳时机。
public class BestTimeToBuyAndSellStockii {

	public int maxProfit(int[] prices) {
		 int maxProfit=0;
	        for(int i=0;i<prices.length-1;i++){
	            if(prices[i]<prices[i+1])
	            maxProfit+=prices[i+1]-prices[i];
	        }
	        return maxProfit;
	    }
	public static void main(String[] args) {

	}

}
