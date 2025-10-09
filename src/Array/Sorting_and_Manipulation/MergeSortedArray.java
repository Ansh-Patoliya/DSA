package Array.Sorting_and_Manipulation;

/*
 Problem: Merge Sorted Array (LeetCode #88)

 Goal
 - Merge two sorted integer arrays nums1 and nums2 into a single sorted array in non-decreasing order, in-place in nums1.
 - nums1 has length m+n where the first m elements are initialized; nums2 has length n with n initialized elements.

 Contract
 - Input: int[] nums1 (size m+n), int m; int[] nums2 (size n), int n.
 - Output: none (modify nums1 in-place to contain the merged sorted elements).
 - Time: O(m+n). Space: O(1) extra.

 Examples
 - Example 1
   nums1 = [1,2,3,0,0,0], m = 3
   nums2 = [2,5,6],       n = 3
   Output nums1: [1,2,2,3,5,6]
 - Example 2
   nums1 = [1], m = 1
   nums2 = [],  n = 0
   Output nums1: [1]
 - Example 3
   nums1 = [0], m = 0
   nums2 = [1], n = 1
   Output nums1: [1]

 Approach
 - Two-Pointer from the End (Recommended)
   Idea: Use indices i=m-1 (end of nums1's valid part), j=n-1 (end of nums2), and k=m+n-1 (end write position in nums1). While i>=0 and j>=0, place the larger of nums1[i] and nums2[j] at nums1[k], decrementing the corresponding pointer and k. After loop, if any elements remain in nums2 (j>=0), copy them into nums1[0..j]. If elements remain in nums1, they are already in correct position.

 Edge Cases
 - n=0 → nums2 empty: nums1 unchanged.
 - m=0 → copy all nums2 into nums1.
 - All nums2 elements smaller/larger than nums1's valid part.
 - Duplicates present across arrays.

 Pitfalls
 - Don’t merge from the front; you risk overwriting valid values in nums1.
 - Ensure indices don’t underflow; handle when one array is exhausted.
 - Be careful with equal elements; stability isn’t required, but correctness is.

 Testing Checklist
 - m=0, n>0; n=0, m>0; both zero.
 - Interleaving values and duplicates.
 - All from nums2 should end up at the front/back.
*/

//(LeetCode #88)
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int arr2[] = {2, 5, 6};
        new MergeSortedArray().merge(arr1, arr2);
        for (int a : arr1)
            System.out.println(a);
    }

    void merge(int[] arr1, int[] arr2) {
        int p = arr1.length - arr2.length - 1;
        int q = arr2.length - 1;
        for (int i = arr1.length - 1; i >= 0; i--) {
            if (p >= 0 && q >= 0) {
                if (arr1[p] > arr2[q]) {
                    arr1[i] = arr1[p];
                    p -= 1;
                } else {
                    arr1[i] = arr2[q];
                    q -= 1;
                }
            } else if (q >= 0) {
                arr1[i] = arr2[q];
                q -= 1;
            }

            else {
                break;
            }
        }
    }
}
