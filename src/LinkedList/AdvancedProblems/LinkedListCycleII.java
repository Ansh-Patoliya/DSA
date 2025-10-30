package LinkedList.AdvancedProblems;

/**
 * LINKED LIST CYCLE II (Find Cycle Start Node) (Leetcode #142)
 *
 * Problem Statement:
 * Given the head of a linked list, return the node where the cycle begins.
 * If there is no cycle, return null.
 * There is a cycle in a linked list if there is some node in the list that can be reached again
 * by continuously following the next pointer.
 * Do not modify the linked list.
 *
 * Real-World Analogy:
 * Imagine you're walking through a maze and notice you're going in circles. Not only do you want
 * to confirm you're in a loop, but you also want to identify the exact entrance point where the
 * loop begins so you can mark it and avoid it.
 *
 * Example 1:
 * Input: head = [3,2,0,-4], pos = 1
 * Output: tail connects to node index 1
 * Explanation: There is a cycle in the linked list, where the tail connects to the second node.
 * Visual: 3 -> 2 -> 0 -> -4
 *              ↑__________↓
 * Return the node with value 2
 *
 * Example 2:
 * Input: head = [1,2], pos = 0
 * Output: tail connects to node index 0
 * Explanation: There is a cycle in the linked list, where the tail connects to the first node.
 * Visual: 1 -> 2
 *         ↑____↓
 *
 * Example 3:
 * Input: head = [1], pos = -1
 * Output: no cycle
 * Explanation: There is no cycle in the linked list.
 *
 * Approach (Floyd's Algorithm Extended):
 * 1. Phase 1: Use slow and fast pointers to detect if cycle exists
 *    - Slow moves 1 step, fast moves 2 steps
 *    - If they meet, a cycle exists
 * 2. Phase 2: Find the cycle start
 *    - Reset one pointer to head
 *    - Move both pointers one step at a time
 *    - The node where they meet is the cycle start
 *
 * Mathematical Proof:
 * Let's say:
 * - Distance from head to cycle start = F
 * - Distance from cycle start to meeting point = a
 * - Cycle length = C
 * When they meet: 2 * (F + a) = F + a + nC (where n is number of cycles fast pointer made)
 * Simplifying: F + a = nC, therefore F = nC - a
 * This means moving F steps from meeting point = moving F steps from head = cycle start
 *
 * Time Complexity: O(n) where n is the number of nodes
 * Space Complexity: O(1) - only using two pointers
 *
 * Key Concepts:
 * - Floyd's Cycle Detection Algorithm (extended version)
 * - Mathematical reasoning for cycle start
 * - Two-phase approach
 * - Pointer manipulation
 */
public class LinkedListCycleII {
}
