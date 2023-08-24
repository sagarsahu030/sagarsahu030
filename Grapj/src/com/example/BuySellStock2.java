package com.example;

public class BuySellStock2 {
	 public static int maxProfit(int[] prices) 
	 {
		 int n=prices.length;
//		 System.out.println(n);
		 
		 int[][] dp=new int[n+1][2];
		 dp[n][0]=0;
		 dp[n][1]=0;
//		 System.out.println(dp[4][1]);
		 for(int ind=n-1;ind>=0;ind--)
		 {
			 for(int buy=0;buy<=1;buy++)
			 {
				 int profit=0;
				 
				 if(buy==1)
				 {
					 profit= Math.max(-prices[ind]+dp[ind+1][0],0+dp[ind+1][1]);
//					 System.out.println(profit);
				 }
				 else
				 {
					 profit= Math.max(prices[ind]+dp[ind+1][1],0+dp[ind+1][0]);
//					 System.out.println(profit);
				 }
				 dp[ind][buy]=profit;
			 }
		 }
		
		 return dp[0][1];
			
	 }
	 public static void main(String...args)
	 {
		 int[] arr=new int[]{7,1,5,3,6,4};
		 int n=maxProfit(arr);
		 System.out.println(n);
	 }

}
