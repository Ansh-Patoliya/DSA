package LinkedList.Basics;

/**
 * MERGE TWO SORTED LISTS (Leetcode #21)
 *
 * Problem Statement:
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted list. The list should be made by splicing together
 * the nodes of the first two lists.
 * Return the head of the merged linked list.
 *
 * Real-World Analogy:
 * Think of merging two sorted decks of playing cards into one sorted deck. You compare
 * the top cards from each deck and take the smaller one, repeating until all cards are merged.
 * This is exactly how we merge two sorted linked lists.
 *
 * Example 1:
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * Explanation: Merge two sorted lists while maintaining sorted order.
 *
 * Example 2:
 * Input: list1 = [], list2 = []
 * Output: []
 *
 * Example 3:
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 *
 * Approach:
 * 1. Iterative Solution:
 *    - Create a dummy node to simplify edge cases
 *    - Use a current pointer to build the result list
 *    - Compare values from both lists and attach the smaller node
 *    - Move the pointer in the list from which node was taken
 *    - Attach remaining nodes when one list is exhausted
 *
 * 2. Recursive Solution (Alternative):
 *    - Base cases: if one list is empty, return the other
 *    - Compare heads and recursively merge the rest
 *
 * Time Complexity: O(m + n) where m and n are lengths of the two lists
 * Space Complexity: O(1) for iterative, O(m + n) for recursive (call stack)
 *
 * Key Concepts:
 * - Merge algorithm (similar to merge sort's merge step)
 * - Dummy node technique for simplifying edge cases
 * - Pointer manipulation in linked lists
 * - Comparison and conditional linking
 *
 * Pattern Recognition:
 * This is a fundamental merge operation used in many algorithms including merge sort.
 * Understanding this problem helps in sorting and merging data structures.
 */
public class MergeTwoSortedLists {
}
