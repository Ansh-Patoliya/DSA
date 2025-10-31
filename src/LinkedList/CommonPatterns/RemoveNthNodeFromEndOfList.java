package LinkedList.CommonPatterns;

/**
 * REMOVE NTH NODE FROM END OF LIST (Leetcode #19)
 * <p>
 * Problem Statement:
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 * You must do this in one pass.
 * <p>
 * Real-World Analogy:
 * Imagine a train with many cars. You need to remove the nth car from the end without counting
 * all cars first. You can use two scouts: send one scout n cars ahead, then move both scouts
 * together. When the front scout reaches the end, the rear scout is at the node before the
 * target node to be removed.
 * <p>
 * Example 1:
 * Input: head = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]
 * Explanation: Remove the 2nd node from the end (node with value 4).
 * Visual: 1 -> 2 -> 3 -> 4 -> 5
 * ↑ (remove this)
 * Result: 1 -> 2 -> 3 -> 5
 * <p>
 * Example 2:
 * Input: head = [1], n = 1
 * Output: []
 * Explanation: After removing the only node, the list is empty.
 * <p>
 * Example 3:
 * Input: head = [1,2], n = 1
 * Output: [1]
 * Explanation: Remove the last node.
 * <p>
 * Example 4:
 * Input: head = [1,2], n = 2
 * Output: [2]
 * Explanation: Remove the first node (which is 2nd from the end).
 * <p>
 * Approach (Two Pointer Technique):
 * 1. Use a dummy node to handle edge cases (removing head)
 * 2. Initialize two pointers: fast and slow, both at dummy
 * 3. Move fast pointer n+1 steps ahead
 * 4. Move both pointers together until fast reaches end
 * 5. Now slow pointer is just before the node to be removed
 * 6. Remove the node by updating slow.next
 * 7. Return dummy.next
 * <p>
 * Time Complexity: O(L) where L is the length of the list (single pass)
 * Space Complexity: O(1) - only using two pointers
 * <p>
 * Key Concepts:
 * - Two pointer technique with fixed gap
 * - Dummy node for edge case handling
 * - Single-pass solution
 * - Node deletion in linked list
 * <p>
 * Why Dummy Node:
 * Using a dummy node simplifies the code by handling the edge case where we need to
 * remove the head node. Without it, we'd need special logic for this case.
 * <p>
 * Pattern Recognition:
 * The "two pointers with fixed gap" pattern is useful for:
 * - Finding kth element from end
 * - Removing nth element from end
 * - Checking if lists have cycles at specific positions
 */
public class RemoveNthNodeFromEndOfList {
    ListNode head = null;

    public void addLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
