package LinkedList.CommonPatterns;

/**
 * LINKED LIST CYCLE (Floyd's Cycle Detection Algorithm) (Leetcode #141)
 *
 * Problem Statement:
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * There is a cycle in a linked list if there is some node in the list that can be reached again
 * by continuously following the next pointer.
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 *
 * Real-World Analogy:
 * Imagine two runners on a circular track - one fast and one slow. If the track is circular (has a cycle),
 * the faster runner will eventually lap the slower runner and meet them again. If the track is straight
 * (no cycle), the fast runner will reach the end first and they'll never meet.
 *
 * Example 1:
 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 * Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
 * Visual: 3 -> 2 -> 0 -> -4
 *              ↑__________↓
 *
 * Example 2:
 * Input: head = [1,2], pos = 0
 * Output: true
 * Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
 * Visual: 1 -> 2
 *         ↑____↓
 *
 * Example 3:
 * Input: head = [1], pos = -1
 * Output: false
 * Explanation: There is no cycle in the linked list.
 *
 * Approach (Floyd's Tortoise and Hare):
 * 1. Initialize two pointers: slow (moves 1 step) and fast (moves 2 steps)
 * 2. Move both pointers through the list
 * 3. If there's a cycle, fast pointer will eventually meet slow pointer
 * 4. If fast pointer reaches null, there's no cycle
 *
 * Time Complexity: O(n) where n is the number of nodes
 * Space Complexity: O(1) - only using two pointers
 *
 * Key Concepts:
 * - Floyd's Cycle Detection Algorithm (Tortoise and Hare)
 * - Two pointer technique
 * - Cycle detection in graphs
 * - Space-efficient solution
 *
 * Why This Works:
 * In a cycle, the distance between fast and slow pointers increases by 1 each iteration.
 * Eventually, this distance becomes a multiple of the cycle length, causing them to meet.
 */
public class LinkedListCycle {
}
