package Stack_Queue;

// LeetCode Problem 155: Min Stack
// Link: https://leetcode.com/problems/min-stack/

import java.util.Stack;

/**
 * PROBLEM DESCRIPTION:
 * ====================
 * Design a stack that supports push, pop, top, and retrieving the minimum element
 * in constant time.
 *
 * Implement the MinStack class:
 * - MinStack(): Initializes the stack object
 * - void push(int val): Pushes the element val onto the stack
 * - void pop(): Removes the element on the top of the stack
 * - int top(): Gets the top element of the stack
 * - int getMin(): Retrieves the minimum element in the stack
 *
 * PROBLEM CONSTRAINTS:
 * ===================
 * - -2^31 <= val <= 2^31 - 1
 * - Methods pop, top and getMin will always be called on non-empty stacks
 * - At most 3 * 10^4 calls will be made to push, pop, top, and getMin
 *
 * KEY REQUIREMENT:
 * ================
 * All operations (push, pop, top, getMin) must run in O(1) time complexity!
 *
 * KEY CONCEPTS:
 * =============
 * - Auxiliary Stack (Two Stack Approach)
 * - Single Stack with Pair/Node (Space Optimized)
 * - Minimum tracking without rescanning
 * - Time Complexity: O(1) for all operations
 * - Space Complexity: O(n) - Additional space for min tracking
 *
 * THE CHALLENGE:
 * ==============
 * Regular stack can push/pop/top in O(1), but finding minimum requires O(n) scan.
 * How to track minimum without scanning?
 * Solution: Keep track of minimum at each state!
 *
 * APPROACH 1: TWO STACKS (MOST INTUITIVE)
 * ========================================
 * Use two stacks:
 * 1. Main Stack: Stores all elements normally
 * 2. Min Stack: Stores minimum values corresponding to each state
 *
 * Operations:
 * - push(val):
 *   - Push val to main stack
 *   - Push min(val, current_min) to min stack
 *
 * - pop():
 *   - Pop from both main stack and min stack
 *
 * - top():
 *   - Return top of main stack
 *
 * - getMin():
 *   - Return top of min stack (always contains current minimum)
 *
 * APPROACH 2: SINGLE STACK WITH PAIRS
 * ====================================
 * Store pairs (value, min_at_this_point) in one stack
 * Each element knows the minimum at the time it was added
 *
 * WHY THIS WORKS?
 * ===============
 * By maintaining parallel min values, when we pop elements,
 * we automatically know what the previous minimum was.
 * No need to rescan the entire stack!
 *
 * EXAMPLE 1: Basic Operations
 * ============================
 * MinStack minStack = new MinStack();
 *
 * push(-2):
 *   Main Stack: [-2]
 *   Min Stack:  [-2]  (first element is minimum)
 *
 * push(0):
 *   Main Stack: [-2, 0]
 *   Min Stack:  [-2, -2]  (min(-2, 0) = -2)
 *
 * push(-3):
 *   Main Stack: [-2, 0, -3]
 *   Min Stack:  [-2, -2, -3]  (min(-2, -3) = -3)
 *
 * getMin() → -3
 *   Return top of min stack
 *
 * pop():
 *   Main Stack: [-2, 0]  (removed -3)
 *   Min Stack:  [-2, -2] (removed -3)
 *
 * top() → 0
 *   Return top of main stack
 *
 * getMin() → -2
 *   Return top of min stack (automatically restored to previous min!)
 *
 * EXAMPLE 2: Detailed Walkthrough
 * ================================
 * minStack = new MinStack()
 * State shown as: Main | Min
 *
 * push(5):
 *   Main: [5]          Min: [5]
 *   Current min: 5
 *
 * push(3):
 *   Main: [5, 3]       Min: [5, 3]
 *   Current min: 3 (min of 5 and 3)
 *
 * push(7):
 *   Main: [5, 3, 7]    Min: [5, 3, 3]
 *   Current min: 3 (min of 3 and 7)
 *
 * push(2):
 *   Main: [5, 3, 7, 2] Min: [5, 3, 3, 2]
 *   Current min: 2 (min of 3 and 2)
 *
 * getMin() → 2
 *   Top of min stack
 *
 * pop():
 *   Main: [5, 3, 7]    Min: [5, 3, 3]
 *   Current min: 3 (automatically restored!)
 *
 * getMin() → 3
 *   Top of min stack
 *
 * push(1):
 *   Main: [5, 3, 7, 1] Min: [5, 3, 3, 1]
 *   Current min: 1 (min of 3 and 1)
 *
 * getMin() → 1
 *   Top of min stack
 *
 * top() → 1
 *   Top of main stack
 *
 * pop():
 *   Main: [5, 3, 7]    Min: [5, 3, 3]
 *   Current min: 3
 *
 * pop():
 *   Main: [5, 3]       Min: [5, 3]
 *   Current min: 3
 *
 * EXAMPLE 3: Same Elements
 * =========================
 * Handling duplicates and same values:
 *
 * push(2):
 *   Main: [2]          Min: [2]
 *
 * push(2):
 *   Main: [2, 2]       Min: [2, 2]
 *   Even if same, we push to min stack!
 *
 * push(2):
 *   Main: [2, 2, 2]    Min: [2, 2, 2]
 *
 * pop():
 *   Main: [2, 2]       Min: [2, 2]
 *   Still maintains minimum correctly
 *
 * getMin() → 2
 *
 * EXAMPLE 4: Single Stack with Pairs
 * ===================================
 * Using pairs (value, min_at_this_state):
 *
 * push(5):
 *   Stack: [(5, 5)]
 *   Pair: (value=5, min_so_far=5)
 *
 * push(3):
 *   Stack: [(5, 5), (3, 3)]
 *   Pair: (value=3, min_so_far=3)
 *
 * push(7):
 *   Stack: [(5, 5), (3, 3), (7, 3)]
 *   Pair: (value=7, min_so_far=3)
 *
 * getMin() → 3
 *   Return second element of top pair
 *
 * top() → 7
 *   Return first element of top pair
 *
 * pop():
 *   Stack: [(5, 5), (3, 3)]
 *   Removed (7, 3)
 *
 * getMin() → 3
 *   Previous minimum automatically available!
 *
 * EDGE CASES:
 * ===========
 * 1. Single element: push(x), getMin() → x
 * 2. All same elements: [5,5,5,5] → min always 5
 * 3. Decreasing order: [5,4,3,2,1] → min changes with each push
 * 4. Increasing order: [1,2,3,4,5] → min stays 1
 * 5. Negative numbers: [-5, -10, -3] → handles correctly
 * 6. Min at bottom: [1,5,7,9] then pop all → min changes correctly
 *
 * WHY NOT JUST KEEP A MIN VARIABLE?
 * ==================================
 * Problem: When we pop the minimum element, how do we know the previous minimum?
 *
 * Example:
 * push(3), push(1), push(5)
 * min = 1
 * pop() → removes 5, min still 1 ✓
 * pop() → removes 1, min = ??? (we lost track of 3!)
 *
 * Solution: Min stack remembers ALL previous minimums!
 *
 * SPACE OPTIMIZATION:
 * ===================
 * Instead of always pushing to min stack, only push when:
 * - Stack is empty, OR
 * - New value <= current minimum
 *
 * When popping, only pop from min stack if popped value == current min
 *
 * This reduces space but adds complexity. Trade-off decision!
 *
 * VISUAL REPRESENTATION:
 * ======================
 * Two Stack Approach:
 *
 *   Main Stack    Min Stack
 *   [  7  ] ←top  [  3  ] ←top (current min)
 *   [  3  ]       [  3  ]
 *   [  5  ]       [  5  ]
 *   Bottom        Bottom
 *
 * When we pop 7:
 *   Main becomes [3, 5]
 *   Min becomes [3, 5]
 *   New minimum is top of min stack: 3
 *
 * COMPLEXITY ANALYSIS:
 * ====================
 * Time Complexity:
 * - push():   O(1) - Just push to both stacks
 * - pop():    O(1) - Just pop from both stacks
 * - top():    O(1) - Access top of main stack
 * - getMin(): O(1) - Access top of min stack
 *
 * Space Complexity:
 * - O(n) - Auxiliary min stack stores n elements
 * - Worth the trade-off for O(1) getMin!
 *
 * ALTERNATIVE APPROACHES (NOT O(1)):
 * ==================================
 * 1. Scan on getMin(): O(n) time - violates requirement
 * 2. Sort on each operation: O(n log n) - violates requirement
 * 3. Min heap: getMin O(1), but push/pop not O(1)
 *
 * COMMON MISTAKES:
 * ================
 * 1. Forgetting to pop from min stack when popping main stack
 * 2. Not handling the case when new element equals current min
 * 3. Trying to use single variable for min (loses history)
 * 4. Not synchronizing both stacks properly
 *
 * RELATED PROBLEMS:
 * =================
 * - LeetCode 239: Sliding Window Maximum
 * - LeetCode 716: Max Stack
 * - LeetCode 895: Maximum Frequency Stack
 * - LeetCode 1381: Design a Stack With Increment Operation
 *
 * DIFFICULTY: Medium
 * TOPICS: Stack, Design
 */
class MinStack {
    Stack<Integer> minStack ;
    Stack<Integer> mainStack;
    public MinStack() {
        minStack=new Stack<>();
        mainStack=new Stack<>();
    }

    public void push(int val) {
        mainStack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    public void pop() {
        int poped=mainStack.pop();
        if(poped==minStack.peek())
            minStack.pop();
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.isEmpty()?-1:minStack.peek();
    }
}

