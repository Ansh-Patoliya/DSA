package LinkedList.Basics;

/**
 * REVERSE LINKED LIST (Leetcode #206)
 * <p>
 * Problem Statement:
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * <p>
 * Real-World Analogy:
 * Think of reversing a chain of people holding hands. Each person needs to turn around and
 * hold the hand of the person who was behind them. You need to do this carefully, one person
 * at a time, so the chain doesn't break.
 * <p>
 * Example 1:
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 * Explanation: Reverse the direction of all pointers.
 * Before: 1 -> 2 -> 3 -> 4 -> 5 -> null
 * After:  1 <- 2 <- 3 <- 4 <- 5 (or) 5 -> 4 -> 3 -> 2 -> 1 -> null
 * <p>
 * Example 2:
 * Input: head = [1,2]
 * Output: [2,1]
 * <p>
 * Example 3:
 * Input: head = []
 * Output: []
 * <p>
 * Approach:
 * 1. Iterative Solution (Optimal):
 * - Use three pointers: previous, current, next
 * - Traverse the list, reversing the next pointer of each node
 * - previous starts as null (new tail will point to null)
 * - Move all three pointers one step forward
 * - Continue until current becomes null
 * - Return previous (new head)
 * <p>
 * 2. Recursive Solution (Elegant):
 * - Recursively reverse the rest of the list
 * - Set the next node's next pointer to current node
 * - Set current node's next to null
 * - Return the new head
 * <p>
 * Time Complexity: O(n) where n is the number of nodes
 * Space Complexity: O(1) for iterative, O(n) for recursive (call stack)
 * <p>
 * Key Concepts:
 * - Pointer reversal in linked list
 * - Three-pointer technique
 * - In-place reversal without extra space
 * - Recursive thinking for list operations
 * <p>
 * Visualization of Iterative Approach:
 * Step by step for [1,2,3]:
 * Initial: prev=null, curr=1, next=2
 * Step 1:  null <- 1  2 -> 3 (reverse 1's pointer)
 * Step 2:  null <- 1 <- 2  3 (reverse 2's pointer)
 * Step 3:  null <- 1 <- 2 <- 3 (reverse 3's pointer)
 * <p>
 * Pattern Recognition:
 * This is one of the most fundamental linked list operations. Many complex problems
 * require reversing lists or parts of lists as a step in their solution:
 * - Reversing in groups
 * - Palindrome checking
 * - Reordering lists
 * - Adding numbers represented as linked lists
 */
public class ReverseLinkedList {

    ListNode head = null;

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        for (int i = 1; i <= 5; i++) {
            list.addLast(i);
        }
        list.display();
        list.reverse(list.head);
        list.display();
    }

    public void reverse(ListNode head) {

        ListNode prev=null;
        ListNode current=head;
        ListNode next_temp=null;
        while(current!=null){
            next_temp=current.next; // Store next node
            current.next=prev;      // Reverse current node's pointer
            prev=current;           // Move pointers one position ahead
            current=next_temp;
        }
        this.head=prev; // Update head to new first element
    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println("end");
    }

    void addLast(int val) {
        ListNode newNode = new ListNode(val);
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

    public class ListNode {
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
