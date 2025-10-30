package LinkedList.AdvancedProblems;

/**
 * ADD TWO NUMBERS (Leetcode #2)
 *
 * Problem Statement:
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Real-World Analogy:
 * Think of this like adding two numbers digit by digit from right to left (like elementary school math),
 * but instead of writing on paper, each digit is stored in a linked list node.
 *
 * Example 1:
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807
 *
 * Example 2:
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 *
 * Example 3:
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 * Explanation: 9999999 + 9999 = 10009998
 *
 * Approach:
 * 1. Traverse both linked lists simultaneously from head to tail
 * 2. Add corresponding digits along with any carry from previous addition
 * 3. Create a new node with the sum modulo 10 (to handle carry)
 * 4. Update carry as sum divided by 10
 * 5. Continue until both lists are exhausted and no carry remains
 * 6. Handle edge cases like different list lengths and final carry
 *
 * Time Complexity: O(max(m, n)) where m and n are lengths of two lists
 * Space Complexity: O(max(m, n)) for the result list
 *
 * Key Concepts:
 * - Linked List traversal
 * - Carry handling in addition
 * - Creating new linked list nodes
 * - Handling lists of different lengths
 */
public class AddTwoNumbers {
}
