package com.leetcode_1;

//	https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/submissions/
//	121.买股票的最佳时机
public class Submissions {
//	遍历
	public static int maxProfit1(int[] prices) {
        int maxlength=prices.length;
        int profit=0;
        for(int i=0;i<maxlength-1;i++){
            for(int j=i+1;j<maxlength;j++){
                if(prices[j]>prices[i])
                profit=Math.max(profit,prices[j]-prices[i]);
            }
        }
        return profit;
    }
//	动态规划
	public static int maxProfit(int [] prices) {
		int minPrices=Integer.MAX_VALUE;
		int maxPrices=0;
		int profit=0;
		for(int i=0;i<prices.length;i++) {
			if(prices[i]<minPrices)
				minPrices=prices[i];
			else if(prices[i]-minPrices>maxPrices)
				maxPrices=prices[i]-minPrices;
		}
		return maxPrices;
	}
	public static void main(String[] args) {
		int [] prices=new int[] {7,1,5,3,6,0};
//		7,6,4,3,1
//		7,1,5,3,6,3
		System.out.println(maxProfit(prices));
	}

}
