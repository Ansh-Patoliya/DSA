package Array.Basic_Operations_and_Searching;

/*
 Problem: Binary Search / Search Insert Position (LeetCode #35)

 Goal
 - Given a sorted array of distinct integers and a target value, return the index if the target is found.
 - If not found, return the index where it would be inserted in order.

 Contract
 - Input: int[] nums (sorted ascending, distinct), int target.
 - Output: int index in range [0, nums.length].
 - Time: O(log n) via binary search. Space: O(1).

 Examples
 - Example 1
   nums = [1,3,5,6], target = 5 → output 2 (found at index 2)
 - Example 2
   nums = [1,3,5,6], target = 2 → output 1 (insert before 3)
 - Example 3
   nums = [1,3,5,6], target = 7 → output 4 (insert at end)
 - Example 4
   nums = [1,3,5,6], target = 0 → output 0 (insert at start)

 Approach (Iterative Binary Search)
 - Maintain two pointers: lo = 0, hi = nums.length - 1. While lo <= hi, mid = lo + (hi - lo) / 2.
 - If nums[mid] == target, return mid.
 - If nums[mid] < target, move lo = mid + 1; else move hi = mid - 1.
 - When the loop ends, lo is the first index where target can be inserted without breaking sort order; return lo.

 Edge Cases
 - Empty array → return 0.
 - Single-element array: compare directly.
 - All elements smaller/larger than target: insert at end/start.

 Pitfalls
 - Avoid overflow computing mid: use lo + (hi - lo) / 2.
 - Ensure loop condition and return value handle not-found case (use lo).
*/

//(LeetCode #35)
public class BinarySearch {

    static int rec(int[] arr, int no, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == no)
            return mid;
        if (arr[mid] > no) {
            return rec(arr, no, start, mid - 1);
        } else {
            return rec(arr, no, mid + 1, end);
        }

    }

    static int search(int[] arr, int no) {
        int start = 0, end = arr.length-1;
        return rec(arr, no, start, end);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(search(arr, 20));
    }
}
