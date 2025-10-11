package Array.AdvancedLogicalQuestion;

/*
 Problem: Maximum Subarray (LeetCode #53)

 Goal
 - Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

 Contract
 - Input: int[] nums, length n ≥ 1.
 - Output: int maxSum (sum of the best contiguous subarray).
 - Time: O(n) for optimal solution. Space: O(1).

 Examples
 - Example 1: [-2,1,-3,4,-1,2,1,-5,4] → 6 (subarray [4,-1,2,1]).
 - Example 2: [1] → 1.
 - Example 3: [5,4,-1,7,8] → 23.
 - Example 4: [-1,-2,-3] → -1 (choose the least negative single element).

 Approaches
 - Kadane's Algorithm (Recommended)
   Idea: Track current sum (cur) and global max (best). For each x, update cur = max(x, cur + x) and best = max(best, cur). Handles negatives naturally.
   Time: O(n), Space: O(1).

 - Dynamic Programming (Equivalent to Kadane)
   dp[i] = max(nums[i], dp[i-1] + nums[i]); answer is max over i. Space can be reduced to O(1) by keeping only dp[i-1].

 - Divide and Conquer
   Consider left/right halves; combine via max suffix of left, max prefix of right. Time: O(n log n), Space: O(log n) recursion.

 Edge Cases
 - All negative numbers → pick the maximum single value.
 - Single element array → that element.

 Pitfalls
 - Initializing cur/best incorrectly (e.g., to 0) can fail for all-negative inputs; initialize to nums[0].
 - Watch for integer overflow if sums can exceed int range; use long if necessary.
*/

//(LeetCode #53)
public class MaximumSubarray {
    int maxSubArray(int[] arr) {
        int cur = arr[0];
        int best = arr[0];

        for (int i = 1; i < arr.length; i++) {
            cur = Math.max(arr[i], cur + arr[i]);
            best = Math.max(best, cur);
        }

        return best;
    }

    public static void main(String[] args) {
        System.out.println(new MaximumSubarray().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
