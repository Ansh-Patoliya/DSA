package LinkedList.Basics;

/**
 * DELETE NODE IN A LINKED LIST (Leetcode #237)
 *
 * Problem Statement:
 * Write a function to delete a node in a singly-linked list. You will NOT be given access to the head of the list.
 * Instead, you will be given access directly to the node to be deleted.
 * It is guaranteed that the node to be deleted is not a tail node in the list.
 *
 * Real-World Analogy:
 * Imagine you're standing in a line (queue) and need to remove the person in front of you.
 * Instead of actually removing them, you ask them to take the identity of the next person,
 * and so on, until the last person leaves. This is similar to copying values forward.
 *
 * Example 1:
 * Input: head = [4,5,1,9], node = 5
 * Output: [4,1,9]
 * Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
 *
 * Example 2:
 * Input: head = [4,5,1,9], node = 1
 * Output: [4,5,9]
 *
 * Example 3:
 * Input: head = [1,2,3,4], node = 3
 * Output: [1,2,4]
 *
 * Approach:
 * 1. Since we don't have access to the previous node, we cannot directly delete current node
 * 2. Copy the value from next node to current node
 * 3. Delete the next node by updating current node's next pointer
 * 4. This effectively "deletes" the current node by replacing it with next node's data
 *
 * Time Complexity: O(1) - constant time operation
 * Space Complexity: O(1) - no extra space needed
 *
 * Key Concepts:
 * - Singly linked list manipulation
 * - Node deletion without head reference
 * - Pointer manipulation
 * - Value swapping technique
 *
 * Important Note:
 * This approach works because we're guaranteed the node is not the tail node.
 * For a more robust solution with head access, we would traverse and delete properly.
 */
public class DeleteNodeInALinkedList {
    // Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    ListNode head=null;

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
