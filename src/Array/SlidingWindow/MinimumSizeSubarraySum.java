package Array.SlidingWindow;

/**
 * Problem: Minimum Size Subarray Sum (LeetCode 209)
 * <p>
 * Goal:
 * - Given an array of positive integers and a target, find the minimal length of a
 * contiguous subarray whose sum is greater than or equal to the target.
 * - If no such subarray exists, return 0.
 * <p>
 * Core Idea (Sliding Window):
 * - Expand the window by moving the right pointer and keep a running sum.
 * - Once the sum >= target, shrink from the left to get the smallest possible window.
 * - Track the minimum window length during the process.
 * <p>
 * Why Sliding Window Works:
 * - All numbers are positive, so increasing the window size only increases the sum.
 * - This guarantees we can safely move the left pointer to try and reduce the window.
 * <p>
 * Complexity:
 * - Time: O(n) — each index is visited at most twice (expand right, then move left).
 * - Space: O(1) — constant extra space.
 * <p>
 * Examples:
 * 1) target = 7, nums = [2, 3, 1, 2, 4, 3]
 * - Minimal subarray is [4, 3] with length 2. Answer: 2
 * 2) target = 4, nums = [1, 4, 4]
 * - Minimal subarray is [4] with length 1. Answer: 1
 * 3) target = 11, nums = [1, 1, 1, 1, 1]
 * - No subarray reaches sum >= 11. Answer: 0
 * <p>
 * Edge Cases:
 * - Very small arrays (length 0 or 1)
 * - Large target greater than total sum
 * - First element already >= target
 * <p>
 * Tips:
 * - Maintain currentSum, left pointer, and minLen.
 * - Each time currentSum >= target, update minLen and move left to minimize.
 */
// Leetcode 209. Minimum Size Subarray Sum
public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        MinimumSizeSubarraySum obj = new MinimumSizeSubarraySum();
        int[] arr = {1, 2, 4, 3};
        int target = 7;
        System.out.println(obj.minLen(arr, target)); // Output: 2
    }

    int minLen(int[] arr, int target) {
        int left = 0, currentSum = 0, minLen = Integer.MAX_VALUE;
        for (int right = 0; right < arr.length; right++) {
            currentSum += arr[right];

            while (currentSum >= target) {
                int len = right - left + 1;
                if (len < minLen)
                    minLen = len;
                currentSum -= arr[left];
                left++;
            }
        }
        return minLen== Integer.MAX_VALUE?0:minLen;
    }
}
