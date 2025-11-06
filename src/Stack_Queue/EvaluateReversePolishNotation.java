package Stack_Queue;

// LeetCode 150: Evaluate Reverse Polish Notation
// https://leetcode.com/problems/evaluate-reverse-polish-notation/

/**
 * PROBLEM DESCRIPTION:
 * ====================
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation (RPN).
 * Valid operators are +, -, *, and /. Each operand may be an integer or another expression.
 *
 * Note that division between two integers should truncate toward zero.
 * It is guaranteed that the given RPN expression is always valid. That means the expression
 * would always evaluate to a result, and there will not be any division by zero operation.
 *
 * PROBLEM CONSTRAINTS:
 * ===================
 * - 1 <= tokens.length <= 10^4
 * - tokens[i] is either an operator: "+", "-", "*", or "/" or an integer in the range [-200, 200]
 *
 * WHAT IS REVERSE POLISH NOTATION (RPN)?
 * =======================================
 * Also known as postfix notation, RPN is a mathematical notation where operators follow
 * their operands. This eliminates the need for parentheses to define operation order.
 *
 * Infix Notation (Normal):  (3 + 4) * 5
 * RPN/Postfix Notation:     3 4 + 5 *
 *
 * How to read RPN:
 * - Scan from left to right
 * - When you see a number, push it onto a stack
 * - When you see an operator, pop two operands, apply operation, push result back
 *
 * KEY CONCEPTS:
 * =============
 * - Stack Data Structure
 * - Postfix Expression Evaluation
 * - String parsing and operator handling
 * - Time Complexity: O(n) - Single pass through all tokens
 * - Space Complexity: O(n) - Stack to store operands
 *
 * APPROACH:
 * =========
 * 1. Initialize an empty stack
 * 2. Iterate through each token in the input array:
 *    - If token is a number, push it onto the stack
 *    - If token is an operator (+, -, *, /):
 *      a. Pop the top two elements from stack (second operand, then first operand)
 *      b. Apply the operation: first operand [operator] second operand
 *      c. Push the result back onto the stack
 * 3. After processing all tokens, the stack contains exactly one element: the final result
 *
 * WHY STACK?
 * ==========
 * Stack is perfect for RPN evaluation because:
 * - LIFO (Last In First Out) naturally handles the order of operations
 * - When we encounter an operator, we need the most recent operands
 * - Stack automatically maintains the intermediate results
 * - No need to handle operator precedence (already encoded in RPN)
 *
 * EXAMPLE 1:
 * ==========
 * Input:  tokens = ["2", "1", "+", "3", "*"]
 * Output: 9
 *
 * Explanation:
 * This represents: ((2 + 1) * 3) = 9
 *
 * Step-by-step execution:
 * Step 1: Read "2"   → Push 2    → Stack: [2]
 * Step 2: Read "1"   → Push 1    → Stack: [2, 1]
 * Step 3: Read "+"   → Pop 1, 2  → Compute 2+1=3  → Push 3  → Stack: [3]
 * Step 4: Read "3"   → Push 3    → Stack: [3, 3]
 * Step 5: Read "*"   → Pop 3, 3  → Compute 3*3=9  → Push 9  → Stack: [9]
 * Final result: 9
 *
 * EXAMPLE 2:
 * ==========
 * Input:  tokens = ["4", "13", "5", "/", "+"]
 * Output: 6
 *
 * Explanation:
 * This represents: (4 + (13 / 5)) = 4 + 2 = 6
 * Note: 13/5 = 2 (integer division, truncates toward zero)
 *
 * Step-by-step execution:
 * Step 1: Read "4"   → Push 4    → Stack: [4]
 * Step 2: Read "13"  → Push 13   → Stack: [4, 13]
 * Step 3: Read "5"   → Push 5    → Stack: [4, 13, 5]
 * Step 4: Read "/"   → Pop 5, 13 → Compute 13/5=2  → Push 2  → Stack: [4, 2]
 * Step 5: Read "+"   → Pop 2, 4  → Compute 4+2=6   → Push 6  → Stack: [6]
 * Final result: 6
 *
 * EXAMPLE 3:
 * ==========
 * Input:  tokens = ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
 * Output: 22
 *
 * Explanation:
 * This represents: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
 *
 * Step-by-step (abbreviated):
 * [10] → [10,6] → [10,6,9] → [10,6,9,3] → [10,6,12] (9+3)
 * → [10,6,12,-11] → [10,6,-132] (12*-11) → [10,0] (6/-132, truncates to 0)
 * → [0] (10*0) → [0,17] → [17] (0+17) → [17,5] → [22] (17+5)
 * Final result: 22
 *
 * EXAMPLE 4:
 * ==========
 * Input:  tokens = ["3", "4", "+", "2", "*", "7", "/"]
 * Output: 2
 *
 * Explanation:
 * This represents: ((3 + 4) * 2) / 7 = (7 * 2) / 7 = 14 / 7 = 2
 *
 * EDGE CASES:
 * ===========
 * 1. Single number: ["42"] → 42 (no operations)
 * 2. Negative numbers: ["-3", "-4", "+"] → -7
 * 3. Division by negative: ["4", "-2", "/"] → -2
 * 4. Complex expression with multiple operators in sequence
 * 5. Result truncates toward zero: ["-3", "2", "/"] → -1 (not -2)
 *
 * OPERATOR OPERATION ORDER:
 * =========================
 * When popping two operands for an operator:
 * First pop  → second operand (b)
 * Second pop → first operand (a)
 * Result: a [operator] b
 *
 * Example: Stack [5, 3], operator "-"
 * Pop → b = 3
 * Pop → a = 5
 * Result: 5 - 3 = 2 (NOT 3 - 5)
 *
 * COMMON MISTAKES TO AVOID:
 * =========================
 * 1. Wrong operand order: Remember stack is LIFO, so order matters for - and /
 * 2. Not handling negative numbers: "-3" is a number, not an operator
 * 3. Incorrect division: Must truncate toward zero (use integer division in Java)
 * 4. Not checking if token is operator vs operand
 *
 * RELATED PROBLEMS:
 * =================
 * - LeetCode 224: Basic Calculator
 * - LeetCode 227: Basic Calculator II
 * - LeetCode 772: Basic Calculator III
 * - LeetCode 1006: Clumsy Factorial
 *
 * DIFFICULTY: Medium
 * TOPICS: Array, Math, Stack
 */
public class EvaluateReversePolishNotation {
}
