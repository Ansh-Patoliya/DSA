package Array.SlidingWindow;

/**
 * Problem: Permutation in String (LeetCode 567)
 *
 * Goal:
 * - Given two strings s1 and s2, return true if s2 contains a permutation of s1
 *   (i.e., a substring of s2 with the same character counts as s1).
 *
 * Core Idea (Sliding Window + Frequency Counts):
 * - Count frequencies of characters in s1.
 * - Use a sliding window of size |s1| over s2 and maintain its frequency counts.
 * - If the window's counts match s1's counts at any point, return true.
 *
 * Complexity:
 * - Time: O(n) — linear in |s2| with O(1) alphabet operations.
 * - Space: O(1) — fixed-size count arrays (e.g., 26 for lowercase letters).
 *
 * Examples:
 * 1) s1 = "ab", s2 = "eidbaooo" -> true ("ba")
 * 2) s1 = "ab", s2 = "eidboaoo" -> false
 *
 * Edge Cases:
 * - |s1| > |s2| => false
 * - Duplicate letters
 * - Mixed cases if applicable
 *
 * Tips:
 * - Maintain a match counter or compare arrays when the window size equals |s1|.
 */
// Leetcode 567. Permutation in String
public class PermutationInString {
}
