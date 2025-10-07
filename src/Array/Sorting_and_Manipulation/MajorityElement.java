package Array.Sorting_and_Manipulation;

/*
 Problem: Majority Element (LeetCode #169)

 Goal
 - Given an array nums of size n, find the element that appears more than ⌊n/2⌋ times (the majority element).
 - The majority element is guaranteed to exist in the input.

 Constraints & Contract
 - Input: int[] nums, n ≥ 1.
 - Output: int majority element value.
 - Optimal solution must run in O(n) time and O(1) extra space.

 Examples
 - Example 1
   Input:  [3,2,3]
   Output: 3
 - Example 2
   Input:  [2,2,1,1,1,2,2]
   Output: 2

 Approaches
 - Boyer–Moore Majority Vote (Recommended)
   Idea: Maintain a candidate and a counter. Iterate through nums: if counter is 0, set candidate = current; then counter += (current == candidate ? +1 : -1). Final candidate is the majority.
   Time: O(n), Space: O(1).

 - Sorting
   Idea: Sort array; majority element must be at index n/2. Time: O(n log n), Space: O(1) or O(log n) depending on sort.

 - Hash Map Count
   Idea: Count frequencies using a map and return the key with count > n/2. Time: O(n), Space: O(n).

 Edge Cases
 - n = 1 → that single element is the answer.
 - Many alternating values but one strictly dominates.

 Pitfalls
 - Boyer–Moore assumes a majority exists. If not guaranteed in a variant, do a second validation pass to confirm candidate frequency > n/2.
*/

//(LeetCode #169)
public class MajorityElement {
    int vote(int[] arr){
        int count=0,candidate = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count==0){
                candidate=arr[i];
                count++;
                continue;
            }
            count=(arr[i]==candidate)?++count:--count;
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] arr={1,2,1,2,2,2,2,1};
        System.out.println(new MajorityElement().vote(arr));
    }
}
