package Array.Hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Problem: Intersection of Two Arrays (LeetCode 349)
 * <p>
 * Goal:
 * - Return the unique intersection of two arrays.
 * - The result should contain each element only once, in any order.
 * <p>
 * Core Idea (Hash Set):
 * - Insert elements of the first array into a set.
 * - Iterate the second array; if an element exists in the set, add it to the result set.
 * - Convert the result set to an array.
 * <p>
 * Complexity:
 * - Time: O(n + m) — building and checking sets.
 * - Space: O(n + m) — sets for seen and result (bounded by unique elements).
 * <p>
 * Examples:
 * 1) nums1 = [1,2,2,1], nums2 = [2,2] -> [2]
 * 2) nums1 = [4,9,5], nums2 = [9,4,9,8,4] -> [9,4] (order may vary)
 * <p>
 * Edge Cases:
 * - One or both arrays empty
 * - No overlapping elements
 * - All elements overlap
 * <p>
 * Tips:
 * - Use sets to deduplicate automatically.
 * - Order of the result does not matter.
 */
// LeetCode 349. Intersection of Two Arrays
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> rs = new HashSet<>();
        for (int i : a) {
            set.add(i);
        }
        for (int i = 0; i < b.length; i++) {
            if(set.contains(b[i]))
                rs.add(b[i]);
        }


        int[] res = new int[rs.size()];
        Iterator<Integer> it = rs.iterator();
        int index=0;
        while(it.hasNext()) {
            res[index++] = it.next();
        }
        return res;
    }
}
