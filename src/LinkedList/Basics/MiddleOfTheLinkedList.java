package LinkedList.Basics;

/**
 * MIDDLE OF THE LINKED LIST (Leetcode #876)
 *
 * Problem Statement:
 * Given the head of a singly linked list, return the middle node of the linked list.
 * If there are two middle nodes, return the second middle node.
 *
 * Real-World Analogy:
 * Imagine two people walking along a path - one walks at normal speed and the other runs
 * at double speed. When the faster person reaches the end, the slower person will be
 * exactly at the middle. This is the slow-fast pointer technique.
 *
 * Example 1:
 * Input: head = [1,2,3,4,5]
 * Output: [3,4,5]
 * Explanation: The middle node of the list is node 3.
 *
 * Example 2:
 * Input: head = [1,2,3,4,5,6]
 * Output: [4,5,6]
 * Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 *
 * Example 3:
 * Input: head = [1]
 * Output: [1]
 * Explanation: Single node is the middle node.
 *
 * Approach:
 * 1. Slow and Fast Pointer Technique (Optimal):
 *    - Initialize slow and fast pointers at head
 *    - Move slow pointer 1 step and fast pointer 2 steps at a time
 *    - When fast reaches the end, slow is at the middle
 *    - This works because fast moves twice as fast as slow
 *
 * 2. Two-Pass Solution (Alternative):
 *    - First pass: count total nodes
 *    - Second pass: traverse to middle (count/2)
 *
 * Time Complexity: O(n) where n is the number of nodes (single pass)
 * Space Complexity: O(1) - only using two pointers
 *
 * Key Concepts:
 * - Slow and Fast pointer technique (Tortoise and Hare)
 * - Single-pass solution
 * - Finding middle without counting nodes
 * - Space-efficient algorithm
 *
 * Why This Works:
 * When fast pointer moves 2x speed of slow pointer, by the time fast reaches the end,
 * slow has covered exactly half the distance, positioning it at the middle.
 *
 * Pattern Recognition:
 * This slow-fast pointer pattern is widely used in linked list problems for:
 * - Finding middle element
 * - Detecting cycles
 * - Finding kth element from end
 */
public class MiddleOfTheLinkedList {
    // Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public void addLast(ListNode head, int value) {
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

    public void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
