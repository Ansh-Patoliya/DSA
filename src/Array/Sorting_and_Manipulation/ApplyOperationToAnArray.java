// filepath: c:\Users\ansh\IdeaProjects\DSA\src\Array\Sorting_and_Manipulation\ApplyOperationToAnArray.java
package Array.Sorting_and_Manipulation;

// Leetcode #2460
/*
Class: ApplyOperationToAnArray

Purpose
- Process an integer array from left to right and build a new array where:
  - When a non-zero element equals its immediate next element, the current value is doubled (value * 2),
    the next element is logically skipped, and the doubled value is written to the result.
  - When a non-zero element does not equal its next element, the current value is copied to the result.
  - Remaining positions are filled with zeros at the end (effectively pushing zeros to the right).

Important behavioral notes (based on this implementation)
- Zeros are not written during the main scan; they appear only as trailing zeros after processing.
- An element at the last index is considered only if it has a next neighbor (i + 1 < length).
  Therefore, an unpaired last element that does not meet the two-element comparison is not copied.
- The input array is not modified; a new array is returned.

Input
- int[] arr: any integer array (may contain zeros and duplicates).

Output
- int[]: a new array of the same length with processed values at the front and zeros appended at the end.

Examples (walkthrough style)
1) arr = [1, 1, 0, 2, 2, 0]
   - (0,1): 1 equals 1 and both non-zero -> write 2, skip the next 1
   - (2,3): 0 is zero -> skip writing
   - (3,4): 2 equals 2 and both non-zero -> write 4, skip the next 2
   - Fill remaining with zeros
   Result: [2, 4, 0, 0, 0, 0]

2) arr = [1, 2, 3]
   - (0,1): 1 != 2 and 1 != 0 -> write 1
   - (1,2): 2 != 3 and 2 != 0 -> write 2
   - Index 2 has no next neighbor -> not written by design
   - Fill remaining with zeros
   Result: [1, 2, 0]

3) arr = [0, 0, 0]
   - All elements are zero -> nothing written during scan
   - Fill all with zeros
   Result: [0, 0, 0]

4) arr = [2, 2, 2]
   - (0,1): 2 equals 2 -> write 4, skip index 1
   - (2,?) : index 2 has no next neighbor -> not written
   - Fill remaining with zeros
   Result: [4, 0, 0]

Complexity
- Time: O(n), single pass over the array plus a fill of remaining positions.
- Space: O(n), due to the new result array of the same length.

Edge cases considered
- Arrays with zeros interleaved among numbers.
- Arrays where the last element is unpaired (odd length scenarios).
- Arrays with all elements zero or with no adjacent equals.

Success criteria
- Non-zero values that meet the adjacent-equal rule are doubled and preserved in order.
- Non-zero values that do not meet the rule are preserved in order.
- Zeros are effectively moved to the end via post-fill.
*/
public class ApplyOperationToAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 2, 2, 0};
        int[] temp = new ApplyOperationToAnArray().operation(arr);
        for (int a : temp) {
            System.out.println(a);
        }
    }

    int[] operation(int[] arr) {
        int count = 0;
        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            if (i + 1 < arr.length && arr[i] != 0) {
                if (arr[i] == arr[i + 1]) {
                    temp[count++] = arr[i] * 2;
                    i++;
                } else
                    temp[count++] = arr[i];
            }

        }
        for (int i = count; i < arr.length; i++) {
            temp[i] = 0;
        }
        return temp;
    }
}
