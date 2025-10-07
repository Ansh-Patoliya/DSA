package Array.Sorting_and_Manipulation;

/*
 Problem: Best Time to Buy and Sell Stock (LeetCode #121)

 Goal
 - Given an array prices where prices[i] is the stock price on day i, compute the maximum profit by choosing a single day to buy and a later day to sell.
 - If no profit is possible, return 0.

 Constraints & Contract
 - Input: int[] prices, length n ≥ 0.
 - Output: int maxProfit ≥ 0.
 - Must be O(n) time and O(1) extra space for the optimal solution.

 Examples
 - Example 1
   Input:  [7,1,5,3,6,4]
   Output: 5
   Explanation: Buy at 1 (day 1), sell at 6 (day 4), profit = 5.
 - Example 2
   Input:  [7,6,4,3,1]
   Output: 0 (no transaction makes profit)
 - Example 3
   Input:  [2,4,1]
   Output: 2 (buy at 2, sell at 4)

 Approaches
 - Single Pass with Running Minimum (Recommended)
   Idea: Track the minimum price seen so far (minPrice). For each price p, potential profit = p - minPrice. Update maxProfit with the maximum of itself and this potential. Update minPrice when a new lower price is found.
   Time: O(n), Space: O(1).

 - Brute Force (Not Recommended)
   Try all i<j and compute prices[j]-prices[i]. Time: O(n^2). Space: O(1).

 Edge Cases
 - Empty or single-element array → 0.
 - Monotonically decreasing prices → 0.
 - Best buy is at the last local minimum before a larger rise.

 Pitfalls
 - Ensure selling happens after buying (use single pass forward only).
 - Don’t allow negative profits; clamp to 0.

 Testing Checklist
 - Decreasing arrays.
 - Flat arrays (constant prices).
 - Peaks and valleys; early vs. late best profit.
 - Very large n for performance validation.
*/

import java.util.Arrays;

//(LeetCode #121)
public class BestTimeToBuyAndSellStock {
    int time(int[] arr){
        int profit=0,sum=0;
        int minPrice=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(minPrice>arr[i]){
                minPrice=arr[i];
            }
            if(arr[i]-minPrice>profit){
                profit=arr[i]-minPrice;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        System.out.println(new BestTimeToBuyAndSellStock().time(new int[]{1,2}));
    }
}
