package Array.AdvancedLogicalQuestion;

/*
 Problem: Single Number (LeetCode #136)

 Goal
 - Given a non-empty array of integers nums, every element appears exactly twice except for one. Find that single one.
 - Must implement a solution with linear runtime complexity and use only constant extra space.

 Contract
 - Input: int[] nums, length n ≥ 1.
 - Output: int value that appears exactly once.
 - Time: O(n), Space: O(1) extra.

 Examples
 - Example 1: [2,2,1] → 1
 - Example 2: [4,1,2,1,2] → 4
 - Example 3: [1] → 1

 Approaches
 - XOR Trick (Recommended)
   Idea: Use the properties of XOR: a ^ a = 0, a ^ 0 = a, and XOR is associative/commutative. XOR all numbers; pairs cancel, leaving the single number.
   Time: O(n), Space: O(1).

 - Sorting (Not optimal space/time)
   Idea: Sort and scan in pairs; mismatched element is the answer. Time: O(n log n), Space: O(1) or O(log n). Not preferred.

 - Hash Set/Map (Not optimal space)
   Idea: Track counts/seen elements. Time: O(n), Space: O(n). Not preferred due to extra space.

 Edge Cases
 - Single-element array returns that element.
 - Negative numbers are handled naturally by XOR.
 - Large arrays remain linear and constant-space with XOR approach.

 Pitfalls
 - Don’t use addition/subtraction with overflow risks; XOR is safe.
 - Ensure exactly one unique element and others appear exactly twice per the problem guarantee; otherwise validate input for variants.
*/

//(LeetCode #136)
public class SingleNumber {
    int single(int[] arr){
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            ans=ans^arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={4,1,2,1,2};
        System.out.println(new SingleNumber().single(arr));
    }
}
