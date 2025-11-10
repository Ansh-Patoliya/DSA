package Stack_Queue;

// LeetCode Problem 225: Implement Stack using Queues
// Link: https://leetcode.com/problems/implement-stack-using-queues/

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * PROBLEM DESCRIPTION:
 * ====================
 * Implement a last-in-first-out (LIFO) stack using only queues.
 * The implemented stack should support all the functions of a normal stack
 * (push, top, pop, and empty).
 *
 * Implement the MyStack class:
 * - void push(int x): Pushes element x to the top of the stack
 * - int pop(): Removes the element on the top of the stack and returns it
 * - int top(): Returns the element on the top of the stack
 * - boolean empty(): Returns true if the stack is empty, false otherwise
 *
 * PROBLEM CONSTRAINTS:
 * ===================
 * - 1 <= x <= 9
 * - At most 100 calls will be made to push, pop, top, and empty
 * - All calls to pop and top are valid (stack is not empty)
 *
 * NOTES:
 * ======
 * - You must use ONLY standard operations of a queue (push to back, peek/pop from front, size, is empty)
 * - Depending on your language, the queue may not be supported natively
 * - You may simulate a queue using a list or deque as long as you use only standard queue operations
 *
 * KEY CONCEPTS:
 * =============
 * - Single Queue Approach (Most Efficient)
 * - Two Queue Approach (Alternative)
 * - LIFO (Last In First Out) - Stack behavior
 * - FIFO (First In First Out) - Queue behavior
 * - Time Complexity: push O(n), pop O(1), top O(1), empty O(1)
 * - Space Complexity: O(n) - where n is number of elements in stack
 *
 * THE CHALLENGE:
 * ==============
 * Queue: FIFO - First element added is first to remove
 * Stack: LIFO - Last element added should be first to remove
 *
 * How to convert FIFO to LIFO? Rotate the queue!
 *
 * APPROACH 1: SINGLE QUEUE (OPTIMAL)
 * ===================================
 * Use one queue and rotate elements during push operation
 *
 * PUSH Operation (O(n)):
 * 1. Add new element to the back of queue
 * 2. Rotate the queue: Remove and add back all previous elements
 * 3. This places the new element at the front
 *
 * Example: Queue has [1, 2, 3], push 4
 * Step 1: Add 4 → [1, 2, 3, 4]
 * Step 2: Rotate 3 times (size - 1):
 *   - Remove 1, add back → [2, 3, 4, 1]
 *   - Remove 2, add back → [3, 4, 1, 2]
 *   - Remove 3, add back → [4, 1, 2, 3]
 * Now 4 (newest) is at front!
 *
 * POP Operation (O(1)):
 * - Just remove from front of queue
 *
 * TOP Operation (O(1)):
 * - Just peek at front of queue
 *
 * APPROACH 2: TWO QUEUES
 * =======================
 * Use two queues and transfer during push operation
 *
 * PUSH Operation (O(n)):
 * 1. Add new element to empty queue2
 * 2. Transfer all elements from queue1 to queue2
 * 3. Swap queue1 and queue2 references
 *
 * This ensures newest element is always at front of queue1
 *
 * WHY THIS WORKS?
 * ===============
 * Stack needs most recent element accessible first.
 * By rotating queue during push, we maintain the property that
 * the front of queue always contains the most recently added element.
 * Trade-off: Push becomes O(n), but pop/top remain O(1).
 *
 * EXAMPLE 1: Single Queue Approach
 * =================================
 * MyStack stack = new MyStack();
 *
 * Operation: stack.push(1)
 * Queue: [1]  (only element, no rotation needed)
 *        ↑ front
 *
 * Operation: stack.push(2)
 * Step 1: Add 2 → [1, 2]
 * Step 2: Rotate once (size-1 = 1):
 *   Remove 1, add back → [2, 1]
 *                         ↑ front
 * Now 2 is at front (most recent)
 *
 * Operation: stack.push(3)
 * Step 1: Add 3 → [2, 1, 3]
 * Step 2: Rotate twice (size-1 = 2):
 *   Remove 2, add back → [1, 3, 2]
 *   Remove 1, add back → [3, 2, 1]
 *                         ↑ front
 * Now 3 is at front (most recent)
 *
 * Operation: stack.top() → Returns 3
 * Queue: [3, 2, 1]  (peek front, no change)
 *        ↑ front
 *
 * Operation: stack.pop() → Returns 3
 * Queue: [2, 1]  (remove front)
 *        ↑ front
 *
 * Operation: stack.empty() → Returns false
 *
 * EXAMPLE 2: Detailed Walkthrough
 * ================================
 * MyStack stack = new MyStack();
 * Queue state shown as [front ... back]
 *
 * push(10):
 *   Before: []
 *   Add 10: [10]
 *   Rotate 0 times (size-1 = 0)
 *   After:  [10]
 *
 * push(20):
 *   Before: [10]
 *   Add 20: [10, 20]
 *   Rotate 1 time:
 *     Remove 10, add back: [20, 10]
 *   After:  [20, 10]
 *
 * push(30):
 *   Before: [20, 10]
 *   Add 30: [20, 10, 30]
 *   Rotate 2 times:
 *     Remove 20, add back: [10, 30, 20]
 *     Remove 10, add back: [30, 20, 10]
 *   After:  [30, 20, 10]
 *
 * top() → 30
 *   Queue: [30, 20, 10] (unchanged)
 *
 * pop() → 30
 *   Before: [30, 20, 10]
 *   Remove from front
 *   After:  [20, 10]
 *
 * pop() → 20
 *   Before: [20, 10]
 *   Remove from front
 *   After:  [10]
 *
 * push(40):
 *   Before: [10]
 *   Add 40: [10, 40]
 *   Rotate 1 time:
 *     Remove 10, add back: [40, 10]
 *   After:  [40, 10]
 *
 * EXAMPLE 3: Two Queue Approach
 * ==============================
 * push(1):
 *   queue1: []      queue2: []
 *   Add 1 to queue2: queue2 = [1]
 *   Transfer queue1 to queue2: (nothing)
 *   Swap: queue1 = [1], queue2 = []
 *
 * push(2):
 *   queue1: [1]     queue2: []
 *   Add 2 to queue2: queue2 = [2]
 *   Transfer queue1 to queue2: queue2 = [2, 1]
 *   Swap: queue1 = [2, 1], queue2 = []
 *
 * pop() → 2:
 *   Remove from queue1 front: queue1 = [1]
 *
 * EDGE CASES:
 * ===========
 * 1. Single element: push(1), pop() → Works correctly
 * 2. Push after multiple pops: Maintains correct order
 * 3. Empty stack: empty() returns true
 * 4. Alternating push/pop: Each operation maintains LIFO property
 *
 * VISUAL COMPARISON:
 * ==================
 * Stack (Logical):        Queue (Physical):
 * [Top]                   [Front]
 *   5  ← pop/top here      5  ← pop/top here (after rotation)
 *   4                      4
 *   3                      3
 *   2                      2
 *   1                      1
 * [Bottom]                [Back]
 * ↑ push here             ↑ push here, then rotate
 *
 * ALGORITHM COMPLEXITY ANALYSIS:
 * ==============================
 * Single Queue Approach:
 * - Push: O(n) - Need to rotate n-1 elements
 * - Pop:  O(1) - Just remove from front
 * - Top:  O(1) - Just peek at front
 * - Empty: O(1) - Check queue size
 *
 * Two Queue Approach:
 * - Push: O(n) - Transfer all elements
 * - Pop:  O(1) - Remove from front
 * - Top:  O(1) - Peek at front
 * - Empty: O(1) - Check queue size
 *
 * Both approaches have same complexity, but single queue uses less space.
 *
 * COMPARISON WITH QUEUE USING STACKS:
 * ====================================
 * Queue using Stacks: Push O(1), Pop O(1) amortized
 * Stack using Queues: Push O(n), Pop O(1)
 *
 * Why the difference?
 * - Stacks naturally support efficient reversals (via transfer)
 * - Queues require rotation which processes all elements
 * - Stack using Queues is generally less efficient in practice
 *
 * PRACTICAL CONSIDERATIONS:
 * =========================
 * - This problem is mostly theoretical/interview practice
 * - In real applications, use native Stack data structure
 * - Demonstrates understanding of LIFO vs FIFO properties
 * - Shows ability to adapt one data structure to another
 *
 * RELATED PROBLEMS:
 * =================
 * - LeetCode 232: Implement Queue using Stacks
 * - LeetCode 622: Design Circular Queue
 * - LeetCode 641: Design Circular Deque
 * - LeetCode 1381: Design a Stack With Increment Operation
 *
 * DIFFICULTY: Easy
 * TOPICS: Stack, Queue, Design
 */
public class ImplementStackUsingQueues {
    Queue<Integer> q;
    public ImplementStackUsingQueues() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
        for (int i = 0; i < q.size()-1; i++) {
            q.add(q.remove());
        }
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
