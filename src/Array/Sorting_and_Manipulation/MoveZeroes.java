package Array.Sorting_and_Manipulation;

/*
 Problem: Move Zeroes (LeetCode #283)

 Goal
 - Reorder the array in-place so that all zeros are moved to the end while preserving the relative order of non-zero elements.
 - The operation must be O(n) time with O(1) extra space.

 Input/Output Contract
 - Input: int[] nums (modifiable in-place).
 - Output: none (modify nums directly so that all non-zero values are compacted to the left, zeros shifted to the right).

 Examples
 - Example 1
   Input:  [0, 1, 0, 3, 12]
   Output: [1, 3, 12, 0, 0]
   Explanation: Keep the order of 1,3,12 and push zeros to the end.
 - Example 2
   Input:  [0]
   Output: [0]
 - Example 3
   Input:  [1, 2, 3]
   Output: [1, 2, 3]

 Approaches
 - Two-Pointer Stable Compaction (Recommended)
   Idea: Maintain a writeIndex for the next position of a non-zero element. Iterate readIndex from 0..n-1; whenever nums[readIndex] != 0, place it at nums[writeIndex] and increment writeIndex. After one pass, fill remaining positions [writeIndex..n-1] with zeros. This preserves order and is stable.
   Time: O(n). Space: O(1). In-place, single pass plus a fill pass.

 - Single-Pass Swap Variant
   Idea: Track the next position to place a non-zero and swap nums[readIndex] with nums[writeIndex] when encountering a non-zero. This may perform more writes than compaction+fill but still O(n) time and O(1) space, also stable when readIndex >= writeIndex.

 Edge Cases
 - All zeros: [0,0,0] → unchanged (all at end already).
 - No zeros: [1,2,3] → unchanged.
 - Zeros already at end: [1,2,0,0] → unchanged after processing.
 - Leading zeros: [0,0,1] → [1,0,0].

 Pitfalls
 - Don’t use extra lists (violates O(1) space requirement if interpreted strictly).
 - Avoid changing relative order of non-zero elements.
 - Ensure you overwrite only when necessary; excessive swaps can increase write operations.

 Testing Checklist
 - Empty/length-1 arrays.
 - All zeros, no zeros, mixed zeros.
 - Zeros interleaved with non-zeros.
 - Large arrays to confirm O(n) performance.
*/

//(LeetCode #283)
public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 2, 2, 0};
        new MoveZeroes().move(arr);
        for (int a : arr) {
            System.out.println(a);
        }
    }

    void move(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                arr[count++] = arr[i];
        }
        for (int i = count; i < arr.length; i++) {
            arr[i] = 0;
        }
    }


}
