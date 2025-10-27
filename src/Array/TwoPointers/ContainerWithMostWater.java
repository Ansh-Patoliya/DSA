package Array.TwoPointers;

/**
 * Problem: Container With Most Water (LeetCode 11)
 * <p>
 * Goal:
 * - Given an array of non-negative integers representing heights, find two lines that,
 * together with the x-axis, form a container that holds the maximum amount of water.
 * <p>
 * Core Idea (Two Pointers):
 * - Start with two pointers at the ends of the array.
 * - Compute area = min(height[left], height[right]) * (right - left).
 * - Move the pointer with the smaller height inward to potentially find a larger area.
 * - Repeat until pointers meet.
 * <p>
 * Why This Works:
 * - Moving the taller line cannot increase area if width shrinks;
 * only moving the shorter line might find a taller line to compensate for reduced width.
 * <p>
 * Complexity:
 * - Time: O(n) — each pointer moves at most n steps.
 * - Space: O(1) — constant space.
 * <p>
 * Examples:
 * 1) heights = [1,8,6,2,5,4,8,3,7]
 * - Max area is 49 (lines at indices 1 and 8: min(8,7) * (8-1) = 7 * 7).
 * 2) heights = [1,1]
 * - Max area is 1 (min(1,1) * 1).
 * <p>
 * Edge Cases:
 * - Very small arrays (length < 2)
 * - All equal heights
 * - Heights with large gaps
 * <p>
 * Tips:
 * - Always move the pointer at the smaller height.
 * - Track the maximum area seen so far.
 */
// LeetCode 11. Container With Most Water
public class ContainerWithMostWater {
    int area(int[] arr) {
        int left = 0, right = arr.length - 1, area = 0;

        while (left <= right) {
            int max = Math.min(arr[left], arr[right]) * (right - left);
            if(max>area)
                area=max;
            if(arr[left]<arr[right])
                left++;
            else
                right--;
        }
        return area;
    }

    public static void main(String[] args) {
        ContainerWithMostWater obj = new ContainerWithMostWater();
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = obj.area(heights);
        System.out.println("Maximum area of water the container can hold: " + result);
    }
}
