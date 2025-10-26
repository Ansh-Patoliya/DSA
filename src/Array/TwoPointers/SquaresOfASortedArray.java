package Array.TwoPointers;

/**
 * Problem: Squares of a Sorted Array (LeetCode 977)
 * <p>
 * Goal:
 * - Given a non-decreasing array, return an array of the squares of each number
 * also sorted in non-decreasing order.
 * <p>
 * Core Idea (Two Pointers from Ends):
 * - Square values at both ends; the larger square goes to the end of the result array.
 * - Move the pointer that produced the larger square and fill result from right to left.
 * <p>
 * Complexity:
 * - Time: O(n)
 * - Space: O(n) for the result (in-place variants exist with careful handling).
 * <p>
 * Examples:
 * 1) nums = [-4,-1,0,3,10] -> [0,1,9,16,100]
 * 2) nums = [-7,-3,2,3,11] -> [4,9,9,49,121]
 * <p>
 * Edge Cases:
 * - All non-negative (result is just squares in same order)
 * - All negative (squares decreasing, need merging)
 * - Contains zeros and duplicates
 * <p>
 * Tips:
 * - Fill result from the back to avoid overwrites.
 */
// LeetCode 977. Squares of a Sorted Array
public class SquaresOfASortedArray {
    int[] square(int[] arr) {
        int[] c = new int[arr.length];
        int left = 0, right = arr.length - 1,length = arr.length - 1;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])) {
                c[length--] = arr[left] * arr[left];
                left++;
            }
            else {
                c[length--] = arr[right] * arr[right];
                right--;
            }

        }
        return c;
    }

    public static void main(String[] args) {

        SquaresOfASortedArray obj = new SquaresOfASortedArray();
        int[] arr = {-4, -1, 0, 3, 10};
        int[] result = obj.square(arr);
        System.out.print("Squared Sorted Array: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
