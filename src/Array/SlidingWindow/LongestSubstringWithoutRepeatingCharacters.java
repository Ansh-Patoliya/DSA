package Array.SlidingWindow;

import java.util.HashSet;

/**
 * Problem: Longest Substring Without Repeating Characters (LeetCode 3)
 * <p>
 * Goal:
 * - Find the length of the longest substring without repeating characters.
 * <p>
 * Core Idea (Sliding Window + Index Map):
 * - Use a window with two pointers and a map from character -> last seen index.
 * - As you expand right, if the character was seen within the current window,
 * move the left pointer to lastSeen[char] + 1.
 * - Track the maximum window length.
 * <p>
 * Complexity:
 * - Time: O(n) — each character processed at most twice.
 * - Space: O(k) — k distinct characters in the window (bounded by charset).
 * <p>
 * <p>
 * Examples:
 * 1) s = "abcabcbb" -> 3 ("abc")
 * 2) s = "bbbbb" -> 1 ("b")
 * 3) s = "pwwkew" -> 3 ("wke")
 * <p>
 * Edge Cases:
 * - Empty string -> 0
 * - All unique -> length of string
 * - All same -> 1
 * <p>
 * Tips:
 * - Keep left as max(left, lastSeen[c] + 1) to avoid moving backwards.
 */
// Leetcode 3. Longest Substring Without Repeating Characters
public class LongestSubstringWithoutRepeatingCharacters {
    int longestLength(String str) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;
        while(right < str.length()) {
            if (!set.contains(str.charAt(right))) {
                set.add(str.charAt(right));
                int length = right - left + 1;
                if(length>maxLength) {
                    maxLength=length;
                }
                right++;
            }
            else{
                set.remove(str.charAt(left));
                left++;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters obj = new LongestSubstringWithoutRepeatingCharacters();
        String str = "aab";
        System.out.println("Longest substring length without repeating characters: " + obj.longestLength(str));
    }
}
