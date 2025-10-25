package Array.Hashing;

import java.util.HashMap;

/**
 * Problem: Ransom Note (LeetCode 383)
 *
 * Goal:
 * - Determine if the ransomNote string can be constructed from the magazine string.
 * - Each letter in magazine can only be used once in ransomNote.
 *
 * Core Idea (Counting / Hash Map):
 * - Count character frequencies in magazine, then decrement while scanning ransomNote.
 * - If any needed character is unavailable (count < 0), return false; otherwise true.
 *
 * Complexity:
 * - Time: O(n + m) — where n = |ransomNote|, m = |magazine|.
 * - Space: O(1) — constant if limited alphabet (e.g., lowercase letters).
 *
 * Examples:
 * 1) ransomNote = "a", magazine = "b" -> false
 * 2) ransomNote = "aa", magazine = "ab" -> false
 * 3) ransomNote = "aa", magazine = "aab" -> true
 *
 * Edge Cases:
 * - ransomNote longer than magazine
 * - Characters outside expected range
 *
 * Tips:
 * - Prefer fixed-size array for lowercase letters to optimize.
 */
// LeetCode 383. Ransom Note
public class RansomNote {


    boolean valid(String ransomNote,String magazine){
        int a[]=new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            a[magazine.charAt(i)-'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if(a[ransomNote.charAt(i)-'a']==0)
                return false;
            a[ransomNote.charAt(i)-'a']--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new RansomNote().valid("aab","aaabbb"));
    }
}
