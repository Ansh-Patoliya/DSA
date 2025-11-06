package LinkedList.AdvancedProblems;

/**
 * INTERSECTION OF TWO LINKED LISTS (Leetcode #160)
 *
 * Problem Statement:
 * Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect.
 * If the two linked lists have no intersection at all, return null.
 * The test cases are generated such that there are no cycles anywhere in the entire linked structure.
 *
 * Real-World Analogy:
 * Think of two roads that merge into one highway at some point. You need to find the exact point
 * where these two roads meet. Before the merge, they are separate paths, but after the intersection,
 * they share the same path.
 *
 * Example 1:
 * Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
 * Output: Intersected at '8'
 * Explanation: The intersected node's value is 8.
 * ListA: 4 -> 1 ↘
 *                 8 -> 4 -> 5
 * ListB: 5 -> 6 -> 1 ↗
 *
 * Example 2:
 * Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
 * Output: Intersected at '2'
 *
 * Example 3:
 * Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
 * Output: No intersection
 * Explanation: The two lists do not intersect, so return null.
 *
 * Approach:
 * 1. Two Pointer Technique:
 *    - Use two pointers starting at each head
 *    - When a pointer reaches the end, redirect it to the other list's head
 *    - If lists intersect, pointers will meet at intersection node
 *    - If no intersection, both will reach null simultaneously
 *
 * 2. Alternative: Calculate length difference and align starting points
 *
 * Time Complexity: O(m + n) where m and n are lengths of the two lists
 * Space Complexity: O(1) - only using two pointers
 *
 * Key Concepts:
 * - Two pointer technique
 * - Linked list traversal
 * - Understanding of reference equality
 * - Path length equalization
 *
 * Why This Works:
 * If we concatenate both paths (A+B and B+A), any intersection point will be at the same
 * position from the start in both concatenated paths.
 */
public class IntersectionOfTwoLinkedLists {
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA=headA;
        ListNode pB=headB;
        while(pA!=pB){
            if (pA==null)
                pA=headB;
            else
                pA=pA.next;

            if (pB==null)
                pB=headA;
            else
                pB=pB.next;
        }
        return pA;
    }
}
