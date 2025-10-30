package Array.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Fruit Into Baskets (LeetCode 904)
 *
 * Goal:
 * - Given an array of integers representing fruit types, return the length of the
 *   longest subarray that contains at most two distinct types.
 *
 * Core Idea (Sliding Window):
 * - Maintain a window with counts of fruit types using a map.
 * - Expand the right pointer and update counts.
 * - When there are more than two distinct types, shrink from the left until we have at most two.
 * - Keep track of the maximum window size.
 *
 * Complexity:
 * - Time: O(n) — each element is added/removed from the window at most once.
 * - Space: O(1) — at most two keys in the map (bounded by constant 2).
 *
 * Examples:
 * 1) fruits = [1,2,1] -> longest = 3 ([1,2,1])
 * 2) fruits = [0,1,2,2] -> longest = 3 ([1,2,2])
 * 3) fruits = [1,2,3,2,2] -> longest = 4 ([2,3,2,2])
 *
 * Edge Cases:
 * - Single element array
 * - All elements equal
 * - Alternating more than two types
 *
 * Tips:
 * - Use a frequency map to track counts per type.
 * - When map size > 2, move left pointer and decrement counts; remove type when count hits zero.
 */
// Leetcode 904. Fruit Into Baskets
public class FruitIntoBaskets {
    void fruit(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0,maxSum=0;
        for (int i = 0; i < arr.length; i++) {

            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            while (map.size()>2){
                map.put(arr[left],map.getOrDefault(arr[left],1)-1);
                if(map.get(arr[left])==0)
                    map.remove(arr[left]);
                left++;
            }
            int sum=0;
            sum=i-left+1;
            maxSum=Math.max(sum,maxSum);
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        FruitIntoBaskets fruitIntoBaskets=new FruitIntoBaskets();
        int[] arr={1,2,3,2,2};
        fruitIntoBaskets.fruit(arr);
    }
}
