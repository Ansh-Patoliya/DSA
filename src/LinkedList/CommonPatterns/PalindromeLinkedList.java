package LinkedList.CommonPatterns;

/**
 * PALINDROME LINKED LIST (Leetcode #234)
 *
 * Problem Statement:
 * Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
 * A palindrome is a sequence that reads the same forward and backward.
 *
 * Real-World Analogy:
 * Think of checking if a word like "RACECAR" or "MADAM" reads the same forwards and backwards.
 * For a linked list, we need to verify if the first half mirrors the second half when reversed.
 *
 * Example 1:
 * Input: head = [1,2,2,1]
 * Output: true
 * Explanation: The list reads the same forward (1->2->2->1) and backward (1->2->2->1).
 *
 * Example 2:
 * Input: head = [1,2]
 * Output: false
 * Explanation: 1->2 is not the same as 2->1.
 *
 * Example 3:
 * Input: head = [1,2,3,2,1]
 * Output: true
 * Explanation: The list is a palindrome with middle element 3.
 *
 * Approach:
 * 1. Optimal Solution (O(1) space):
 *    - Find the middle of the linked list (slow-fast pointer)
 *    - Reverse the second half of the list
 *    - Compare first half with reversed second half
 *    - Optionally restore the list to original state
 *
 * 2. Simple Solution (O(n) space):
 *    - Copy values to an array
 *    - Use two pointers from start and end to compare
 *
 * 3. Recursive Solution:
 *    - Use recursion to reach the end
 *    - Compare values while returning from recursion
 *
 * Time Complexity: O(n) where n is the number of nodes
 * Space Complexity: O(1) for optimal solution (in-place), O(n) for array solution
 *
 * Key Concepts:
 * - Finding middle of linked list (slow-fast pointer)
 * - Reversing a linked list
 * - Two pointer comparison technique
 * - In-place list manipulation
 *
 * Pattern Recognition:
 * This problem combines multiple linked list patterns:
 * - Slow-fast pointer to find middle
 * - List reversal
 * - Two-pointer comparison
 *
 * Important Note:
 * The optimal solution modifies the list structure (reverses second half).
 * If maintaining original structure is required, either:
 * - Reverse the second half back after comparison
 * - Use the array-based approach with O(n) space
 */
public class PalindromeLinkedList {
    // Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    ListNode head = null;
    public void addLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
