package Array.Basic_Operations_and_Searching;

/*
 Problem: Two Sum (LeetCode #1)

 Goal
 - Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 - Assume exactly one valid solution exists and you may not use the same element twice.

 Contract
 - Input: int[] nums (length n ≥ 2), int target.
 - Output: int[] of length 2 containing indices (i, j) with i < j and nums[i] + nums[j] == target.
 - Time: O(n) for the optimal approach. Space: O(n) auxiliary.

 Examples
 - Example 1: nums = [2,7,11,15], target = 9 → [0,1]
 - Example 2: nums = [3,2,4], target = 6 → [1,2]
 - Example 3: nums = [3,3], target = 6 → [0,1]

 Approaches
 - One-Pass Hash Map (Recommended)
   Idea: Iterate i from 0..n-1. For value v = nums[i], compute need = target - v. If need is already in the map, return [map.get(need), i]. Otherwise put v → i in the map. O(n) time, O(n) space.

 - Two-Pass Hash Map
   Idea: First map value → index for all elements. Second pass, for each i, check if target - nums[i] exists with index ≠ i. O(n) time, O(n) space.

 - Sorting + Two Pointers (Not directly usable if indices required)
   Idea: Sort a copy of array and use two pointers; then back-map to original indices. Adds O(n log n) time and care for duplicates.

 Edge Cases
 - Duplicates that form the pair (e.g., [3,3], target=6).
 - Negative numbers and zero.
 - Large arrays; ensure linear-time performance.

 Pitfalls
 - Don’t use the same index twice.
 - If multiple answers exist (variant), return any one; in classic problem, exactly one solution is guaranteed.
*/

import java.util.HashMap;

// (LeetCode #1)
public class TwoSum {
    int[] twoSum(int[] arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int need=target-arr[i];
            if(map.containsKey(need)){
                return new int[]{map.get(need),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1};
    }

    public static void main(String[] args) {
        TwoSum ts=new TwoSum();
        int[] arr={2,7,11,15};
        int target=9;
        int[] result=ts.twoSum(arr,target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
