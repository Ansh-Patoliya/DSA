package Array.AdvancedLogicalQuestion;

/*
 Problem: Contains Duplicate (LeetCode #217)

 Goal
 - Determine if any value appears at least twice in the array.
 - Return true if any duplicate exists; otherwise, return false.

 Contract
 - Input: int[] nums (length n ≥ 0).
 - Output: boolean (true if duplicates exist, false otherwise).
 - Preferred Time: O(n) average with hashing. Space: O(n) extra.

 Examples
 - Example 1: [1,2,3,1] → true
 - Example 2: [1,2,3,4] → false
 - Example 3: [1,1,1,3,3,4,3,2,4,2] → true

 Approaches
 - Hash Set (Recommended)
   Idea: Iterate elements, insert into a set; if an element is already present, return true. O(n) time average, O(n) space.

 - Sorting
   Idea: Sort the array and check adjacent elements for equality. O(n log n) time, O(1) extra space (or O(log n) depending on sort implementation).

 Edge Cases
 - Empty array or single element → false (no duplicates possible).
 - Large arrays with many duplicates → hash set remains efficient but uses memory.

 Pitfalls
 - Be mindful of memory constraints when n is very large; prefer sorting if memory is tight and O(n log n) is acceptable.
*/

import java.util.HashSet;

//(LeetCode #217)
public class ContainsDuplicate {

    boolean check(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i]))
                return true;
            set.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new ContainsDuplicate().check(new int[]{1,2,3,2,3,6}));
    }
}
