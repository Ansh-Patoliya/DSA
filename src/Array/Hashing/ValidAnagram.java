package Array.Hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Valid Anagram (LeetCode 242)
 * <p>
 * Goal:
 * - Check if two strings are anagrams (contain the same characters with the same counts).
 * <p>
 * Core Idea (Frequency Counting):
 * - If lengths differ, return false.
 * - Count characters from the first string and subtract counts using the second.
 * - If any count goes negative, not an anagram.
 * <p>
 * Complexity:
 * - Time: O(n)
 * - Space: O(1) for fixed alphabet (e.g., lowercase letters).
 * <p>
 * Examples:
 * 1) s = "anagram", t = "nagaram" -> true
 * 2) s = "rat", t = "car" -> false
 * <p>
 * Edge Cases:
 * - Mixed cases or unicode (adjust data structure accordingly)
 * - Empty strings
 * <p>
 * Tips:
 * - Prefer arrays over maps for performance if alphabet is limited.
 */
// LeetCode 242. Valid Anagram
public class ValidAnagram {
    HashMap<Character, Integer> count(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }
            else{
                int c=map.get(str.charAt(i));
                map.replace(str.charAt(i),++c);
            }
        }

        return map;
    }

    boolean valid(String s1,String s2){

        return s1.length() == s2.length() ? count(s1).equals(count(s2)) : false;
    }

    public static void main(String[] args) {
        System.out.println(new ValidAnagram().valid("anaram","aanagrm"));
    }
}
