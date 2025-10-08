package Array.AdvancedLogicalQuestion;

/*
 Problem: Missing Number (LeetCode #268)

 Goal
 - Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

 Contract
 - Input: int[] nums, length n ≥ 0, elements are distinct and each in [0..n].
 - Output: int missing number in [0..n].
 - Time: O(n), Space: O(1) extra for optimal solutions.

 Examples
 - Example 1: nums = [3,0,1] → 2
 - Example 2: nums = [0,1] → 2
 - Example 3: nums = [9,6,4,2,3,5,7,0,1] → 8
 - Example 4: nums = [] → 0

 Approaches
 - XOR Trick (Recommended)
   Idea: XOR all indices 0..n and all values in nums. Pairs cancel out; the remainder is the missing number.
   Impl sketch: ans = 0; for i in 0..n-1: ans ^= i ^ nums[i]; finally ans ^= n.
   Time: O(n), Space: O(1).

 - Gauss Sum (Arithmetic Sum)
   Idea: Expected sum = n*(n+1)/2; subtract actual sum of nums; the difference is missing.
   Time: O(n), Space: O(1). Beware potential integer overflow for large n; use long if needed.

 - In-Place Indexing/Cyclic Place (Overkill here)
   Idea: Place each x at index x (if within bounds) and find the index not holding its value. More complex and unnecessary given simpler O(1) space methods.

 Edge Cases
 - Empty array → missing is 0.
 - Missing at ends (0 or n) handled naturally by both XOR and sum.

 Pitfalls
 - Overflow with sum method; prefer long accumulation in Java if n can be large.
 - Ensure elements are distinct and within [0..n] per problem guarantees; otherwise validate inputs.
*/

//(LeetCode #268)
public class MissingNumber {
    int miss(int[] arr){
        int n= arr.length;
        int total=(n*(n+1))/2;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return total-sum;
    }

    public static void main(String[] args) {
        System.out.println(new MissingNumber().miss(new int[]{}));
    }
}
