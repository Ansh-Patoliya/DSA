package Array.SlidingWindow;

import java.util.HashMap;

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
    boolean per(String s1,String s2){
        HashMap<Character,Integer> target=new HashMap<>();
        HashMap<Character,Integer> window=new HashMap<>();

        if(s1.length()>s2.length())
            return false;
        for (int i = 0; i < s1.length(); i++) {
            target.put(s1.charAt(i),target.getOrDefault(s1.charAt(i),0)+1);
            window.put(s2.charAt(i),window.getOrDefault(s2.charAt(i),0)+1);
        }
        if(target.equals(window))
            return true;
        for (int i = s1.length(); i <s2.length() ; i++) {
            window.put(s2.charAt(i),window.getOrDefault(s2.charAt(i),0)+1);
            int a= window.get(s2.charAt(i-s1.length()));
            if(a==1)
                window.remove(s2.charAt(i-s1.length()));
            else
                window.replace(s2.charAt(i-s1.length()),--a);

            if(target.equals(window))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PermutationInString permutationInString=new PermutationInString();
        String s1="ab";
        String s2="eidbaooo";
        System.out.println(permutationInString.per(s1,s2));
    }
}
