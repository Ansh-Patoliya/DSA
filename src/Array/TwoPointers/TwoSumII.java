package Array.TwoPointers;

/**
 * Problem: Two Sum II - Input Array Is Sorted (LeetCode 167)
 *
 * Goal:
 * - Given a 1-indexed sorted array of integers, find two numbers such that they
 *   add up to a specific target number, and return their indices.
 *
 * Core Idea (Two Pointers):
 * - Initialize left at start and right at end.
 * - If sum < target, move left++; if sum > target, move right--.
 * - If sum == target, return [left+1, right+1].
 *
 * Complexity:
 * - Time: O(n)
 * - Space: O(1)
 *
 * Examples:
 * 1) numbers = [2,7,11,15], target = 9 -> [1,2]
 * 2) numbers = [2,3,4], target = 6 -> [1,3]
 *
 * Edge Cases:
 * - Multiple valid pairs — problem guarantees exactly one solution
 * - Negative numbers present
 *
 * Tips:
 * - Use 1-based indices in the result.
 */
// LeetCode 167. Two Sum II - Input Array Is Sorted
public class TwoSumII {
    int[] sum(int[] arr,int target){
        int left=0,right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target)
                return new int[]{left+1,right+1};
            else if(sum<target)
                left++;
            else
                right--;
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        TwoSumII obj=new TwoSumII();
        int[] arr={2,7,11,15};
        int target=9;
        int[] result=obj.sum(arr,target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");

    }
}
