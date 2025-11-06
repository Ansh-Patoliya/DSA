package Stack_Queue;

// LeetCode Problem 232: Implement Queue using Stacks
// Link: https://leetcode.com/problems/implement-queue-using-stacks/

/**
 * PROBLEM DESCRIPTION:
 * ====================
 * Implement a first in first out (FIFO) queue using only two stacks.
 * The implemented queue should support all the functions of a normal queue
 * (push, peek, pop, and empty).
 *
 * Implement the MyQueue class:
 * - void push(int x): Pushes element x to the back of the queue
 * - int pop(): Removes the element from the front of the queue and returns it
 * - int peek(): Returns the element at the front of the queue
 * - boolean empty(): Returns true if the queue is empty, false otherwise
 *
 * PROBLEM CONSTRAINTS:
 * ===================
 * - 1 <= x <= 9
 * - At most 100 calls will be made to push, pop, peek, and empty
 * - All calls to pop and peek are valid (queue is not empty)
 *
 * NOTES:
 * ======
 * - You must use ONLY standard operations of a stack (push, pop, peek, size, isEmpty)
 * - Depending on your language, the stack may not be supported natively
 * - You may simulate a stack using a list or deque as long as you use only standard stack operations
 *
 * KEY CONCEPTS:
 * =============
 * - Two Stack Approach
 * - FIFO (First In First Out) - Queue behavior
 * - LIFO (Last In First Out) - Stack behavior
 * - Amortized Time Complexity for efficient operations
 * - Time Complexity: push O(1), pop O(1) amortized, peek O(1) amortized, empty O(1)
 * - Space Complexity: O(n) - where n is number of elements in queue
 *
 * THE CHALLENGE:
 * ==============
 * Stack: LIFO - Last element pushed is first to pop
 * Queue: FIFO - First element pushed should be first to pop
 *
 * How to convert LIFO to FIFO? Use TWO stacks!
 *
 * APPROACH (TWO STACK METHOD):
 * ============================
 * Use two stacks: input stack and output stack
 *
 * 1. PUSH Operation:
 *    - Always push new elements to the input stack
 *    - Time: O(1)
 *
 * 2. POP/PEEK Operations:
 *    - If output stack is not empty, pop/peek from output stack
 *    - If output stack is empty, transfer all elements from input stack to output stack
 *      (This reverses the order, making the oldest element on top)
 *    - Then pop/peek from output stack
 *    - Time: O(1) amortized (each element moved at most once)
 *
 * 3. EMPTY Operation:
 *    - Queue is empty when both stacks are empty
 *    - Time: O(1)
 *
 * WHY TWO STACKS?
 * ===============
 * - Input stack: Receives new elements (maintains insertion order)
 * - Output stack: Serves front elements (reversed order for FIFO access)
 * - Transferring elements between stacks reverses their order
 * - Double reversal gives us FIFO: LIFO → reversed → FIFO
 *
 * EXAMPLE 1: Basic Operations
 * ============================
 * MyQueue queue = new MyQueue();
 *
 * Operation: queue.push(1)
 * Input Stack:  [1]        Output Stack: []
 *
 * Operation: queue.push(2)
 * Input Stack:  [1, 2]     Output Stack: []
 *                ↑ top
 *
 * Operation: queue.peek()  → Returns 1
 * Transfer all from input to output (because output is empty):
 * Input Stack:  []         Output Stack: [2, 1]
 *                                         ↑ top
 * The oldest element (1) is now on top of output stack!
 *
 * Operation: queue.pop()   → Returns 1
 * Input Stack:  []         Output Stack: [2]
 *                                         ↑ top
 *
 * Operation: queue.empty() → Returns false
 * (Output stack still has element 2)
 *
 * EXAMPLE 2: Detailed Walkthrough
 * ================================
 * MyQueue queue = new MyQueue();
 *
 * Step 1: push(10)
 * Input:  [10]             Output: []
 *
 * Step 2: push(20)
 * Input:  [10, 20]         Output: []
 *         bottom↑ ↑top
 *
 * Step 3: push(30)
 * Input:  [10, 20, 30]     Output: []
 *         bottom↑     ↑top
 *
 * Step 4: pop() → Should return 10 (first inserted)
 * Output stack is empty, so transfer from input:
 * - Pop 30 from input, push to output → Output: [30]
 * - Pop 20 from input, push to output → Output: [30, 20]
 * - Pop 10 from input, push to output → Output: [30, 20, 10]
 *                                               bottom↑     ↑top
 * Input:  []               Output: [30, 20, 10]
 * Now pop from output → Returns 10
 * Input:  []               Output: [30, 20]
 *
 * Step 5: push(40)
 * Input:  [40]             Output: [30, 20]
 *
 * Step 6: pop() → Should return 20 (second inserted)
 * Output stack is NOT empty, so directly pop from output
 * Input:  [40]             Output: [30]
 * Returns 20
 *
 * Step 7: peek() → Should return 30 (next in line)
 * Output stack is NOT empty, so directly peek from output
 * Input:  [40]             Output: [30]
 * Returns 30 (doesn't remove)
 *
 * EXAMPLE 3: Understanding Amortized O(1)
 * ========================================
 * Sequence: push(1), push(2), push(3), pop(), pop(), pop()
 *
 * push(1): Input[1], Output[] - 1 operation
 * push(2): Input[1,2], Output[] - 1 operation
 * push(3): Input[1,2,3], Output[] - 1 operation
 * pop(): Transfer 3 elements + pop = 4 operations → Returns 1
 * pop(): Just pop from output = 1 operation → Returns 2
 * pop(): Just pop from output = 1 operation → Returns 3
 *
 * Total: 9 operations for 6 method calls
 * Average: 1.5 operations per call
 *
 * Key insight: Each element is moved exactly ONCE from input to output
 * After that, all subsequent pops/peeks on that element are O(1)
 *
 * EDGE CASES:
 * ===========
 * 1. Single element: push(1), pop() → Works correctly
 * 2. Interleaved operations: push, push, pop, push, pop → Maintains FIFO order
 * 3. Empty queue: empty() returns true when both stacks are empty
 * 4. Multiple transfers: Each pop may or may not trigger transfer based on output stack state
 *
 * VISUAL REPRESENTATION:
 * ======================
 * Think of it as:
 *
 *     QUEUE (Logical View)
 *     [Front] 1 ← 2 ← 3 ← 4 [Back]
 *     Pop here ↑           ↑ Push here
 *
 *     Implementation (Physical View)
 *     Output Stack    Input Stack
 *     [1]  ← Top      [4]  ← Top
 *     [2]             [3]
 *     ↓ Pop from      ↓ Push to
 *     here            here
 *
 * ALGORITHM COMPLEXITY ANALYSIS:
 * ==============================
 * Push: Always O(1) - just push to input stack
 * Pop:  Amortized O(1) - each element transferred once
 * Peek: Amortized O(1) - same logic as pop
 * Empty: O(1) - check if both stacks empty
 *
 * Worst case single pop: O(n) when transferring n elements
 * But this happens only once per element across all operations
 * Hence amortized O(1)
 *
 * ALTERNATIVE APPROACH (Not Optimal):
 * ===================================
 * Could use one stack and temporary stack:
 * - For each pop/peek: Transfer all to temp, get bottom element, transfer back
 * - This gives O(n) for every pop/peek operation
 * - Two-stack approach is significantly better!
 *
 * RELATED PROBLEMS:
 * =================
 * - LeetCode 225: Implement Stack using Queues
 * - LeetCode 622: Design Circular Queue
 * - LeetCode 641: Design Circular Deque
 * - LeetCode 1670: Design Front Middle Back Queue
 *
 * DIFFICULTY: Easy
 * TOPICS: Stack, Queue, Design
 */
public class ImplementQueueUsingStacks {
}
