package Array.SlidingWindow;

/**
 * Problem: Maximum Average Subarray I (LeetCode 643)
 *
 * Goal:
 * - Given an integer array and an integer k, find the contiguous subarray of length k
 *   that has the maximum average, and return this average.
 *
 * Core Idea (Fixed-Size Sliding Window):
 * - Compute the sum of the first k elements.
 * - Slide the window by adding the incoming element and removing the outgoing one.
 * - Track the maximum sum seen; average = maxSum / k.
 *
 * Complexity:
 * - Time: O(n) — linear scan.
 * - Space: O(1) — constant space.
 *
 * Examples:
 * 1) nums = [1,12,-5,-6,50,3], k = 4 -> max average = 12.75 ([12,-5,-6,50] sum = 51)
 * 2) nums = [5], k = 1 -> 5.0
 *
 * Edge Cases:
 * - k equals array length
 * - Negative numbers
 * - Single-element window
 *
 * Tips:
 * - Use double for average precision if required.
 */
// Leetcode 643. Maximum Average Subarray I
public class MaximumAverageSubarrayI {
    double avg(int[] arr,int k ){
        double maxSum=0;
        double sum=0;
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        maxSum=sum;
        for (int i = k; i < arr.length; i++) {
            sum+=arr[i]-arr[i-k];
            if(sum>maxSum)
                maxSum=sum;
        }
        return maxSum/k;
    }

    public static void main(String[] args) {
        MaximumAverageSubarrayI obj=new MaximumAverageSubarrayI();
        int[] arr={0,4,0,3,2};
        int k=1;
        System.out.println(obj.avg(arr,k));
    }
}
