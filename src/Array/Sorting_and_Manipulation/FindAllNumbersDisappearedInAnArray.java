package Array.Sorting_and_Manipulation;

/*
 Problem: Find All Numbers Disappeared in an Array (LeetCode #448)

 Goal
 - Given an array nums of length n with values in the range [1..n], some numbers may appear twice and others once.
 - Return all numbers in the range [1..n] that do not appear in nums.

 Constraints & Contract
 - Input: int[] nums, length n ≥ 0, values constrained to 1..n.
 - Output: List<Integer> of missing numbers in ascending order.
 - Prefer O(n) time and O(1) extra space (excluding the returned list).

 Examples
 - Example 1
   Input:  [4,3,2,7,8,2,3,1]
   Output: [5,6]
 - Example 2
   Input:  [1,1]
   Output: [2]
 - Example 3
   Input:  [1,2,3]
   Output: []

 Approaches
 - In-Place Marking (Recommended, O(1) extra space)
   Idea: For each value v = |nums[i]|, mark index v-1 as visited by making nums[v-1] negative if it's positive. After marking all, indices with positive values correspond to missing numbers (index+1).
   Time: O(n), Space: O(1) excluding output.

 - Cyclic Sort Variant
   Idea: Place each number v at index v-1 by swapping until each position i holds i+1 or cannot be placed due to duplicates. Then collect indices where nums[i] != i+1.
   Time: O(n), Space: O(1) excluding output.

 Edge Cases
 - All numbers present → empty list.
 - All same number (e.g., [1,1,1,1]) → many missing values.
 - Empty array → empty list.

 Pitfalls
 - Use absolute value when indexing after negation to avoid out-of-bounds or double-negation issues.
 - Don’t allocate extra arrays if aiming for O(1) space.
*/

import java.util.ArrayList;
import java.util.List;

//(LeetCode #448)
public class FindAllNumbersDisappearedInAnArray {
    List<Integer> miss(int[] arr){
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int a=arr[i];
            if(arr[i]<0)
                a*=-1;

            if(arr[a-1]>0)
                arr[a-1]=-1*arr[a-1];
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0)
                list.add(i+1);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new FindAllNumbersDisappearedInAnArray().miss(new int[]{4,3,2,7,8,2,3,1}));;
    }



}
