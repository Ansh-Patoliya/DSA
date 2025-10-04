package Array.Basic_Operations_and_Searching;

/*
 Problem: Remove Element (LeetCode #27)

 Goal
 - Remove all occurrences of a given value val in-place from array nums and return the new length k.
 - The first k elements of nums should contain the elements not equal to val; order of elements can be changed and does not matter beyond k.

 Contract
 - Input: int[] nums (may be empty), int val.
 - Output: int k = count of elements != val; array nums modified in-place so that nums[0..k-1] are the kept values.
 - Time: O(n). Space: O(1).

 Examples
 - Example 1: nums = [3,2,2,3], val = 3 → k = 2, nums could be [2,2,_,_]
 - Example 2: nums = [0,1,2,2,3,0,4,2], val = 2 → k = 5, nums could be [0,1,3,0,4,_,_,_]
 - Example 3: nums = [], val = 1 → k = 0

 Approaches
 - Two-Pointer (Stable Compaction)
   Idea: Maintain write index w; read r from 0..n-1. If nums[r] != val, write nums[w++] = nums[r]. Preserves relative order among kept elements. O(n) time, O(1) space.

 - Two-Pointer (Swap with End)
   Idea: When order doesn't matter, keep a tail pointer t = n-1. Iterate i from 0 while i <= t: if nums[i] == val, swap with nums[t--] and do not increment i; else i++. This minimizes writes when val is rare.

 Edge Cases
 - All elements equal to val → k = 0.
 - No element equal to val → k = n.
 - Single-element arrays.

 Pitfalls
 - Ensure indices don't cross in swap-with-end method.
 - Do not allocate extra arrays; modify in place.
*/

// (LeetCode #27)
public class RemoveElement {

    int remove(int[] arr,int val){
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=val)
                arr[count++]=arr[i];
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,5,2,2,1,4};
        System.out.println(new RemoveElement().remove(arr,2));

    }
}
