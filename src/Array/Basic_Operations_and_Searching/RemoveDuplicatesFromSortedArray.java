package Array.Basic_Operations_and_Searching;

/*
 Problem: Remove Duplicates from Sorted Array (LeetCode #26)

 Goal
 - Given a sorted array nums in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
 - Return the number of unique elements k. The first k elements of nums should hold the final result in order.

 Contract
 - Input: int[] nums (sorted, may be empty).
 - Output: int k = count of unique elements; array nums modified in-place so that nums[0..k-1] are unique values in order.
 - Time: O(n). Space: O(1).

 Examples
 - Example 1: nums = [1,1,2] → k = 2, nums becomes [1,2, _]
 - Example 2: nums = [0,0,1,1,1,2,2,3,3,4] → k = 5, nums becomes [0,1,2,3,4, _ ...]
 - Example 3: nums = [] → k = 0

 Approach (Two Pointers)
 - Maintain write index w = 0.
 - Iterate read index r from 0..n-1. If r == 0 or nums[r] != nums[r-1], write nums[w++] = nums[r].
 - At end, w is k. Elements beyond w may be any values; they are ignored.

 Edge Cases
 - Empty array.
 - All elements identical.
 - Already all unique.

 Pitfalls
 - Ensure stability/order preserved (don’t reorder, only compact).
 - Don’t allocate extra arrays.
*/

// (LeetCode #26)
public class RemoveDuplicatesFromSortedArray {
    int remove(int[] arr){
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            if(i==0 || arr[i]!=arr[i-1])
                arr[count++]=arr[i];
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3,4,4,4,5};
        System.out.println(new RemoveDuplicatesFromSortedArray().remove(arr));

    }
}
