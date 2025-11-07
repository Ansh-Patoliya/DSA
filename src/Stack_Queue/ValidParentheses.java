package Stack_Queue;

// LeetCode Problem 20: Valid Parentheses
// Link: https://leetcode.com/problems/valid-parentheses/

import java.util.Stack;

/**
 * PROBLEM DESCRIPTION:
 * ====================
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 *
 * An input string is valid if:
 * 1. Open brackets must be closed by the same type of brackets
 * 2. Open brackets must be closed in the correct order
 * 3. Every close bracket has a corresponding open bracket of the same type
 *
 * PROBLEM CONSTRAINTS:
 * ===================
 * - 1 <= s.length <= 10^4
 * - s consists of parentheses only: '()[]{}'
 *
 * KEY CONCEPTS:
 * =============
 * - Stack Data Structure (LIFO)
 * - Bracket Matching Pattern
 * - Opening/Closing pair validation
 * - Time Complexity: O(n) - Single pass through string
 * - Space Complexity: O(n) - Stack can store n/2 opening brackets in worst case
 *
 * THE CHALLENGE:
 * ==============
 * Need to ensure:
 * 1. Every opening bracket has matching closing bracket
 * 2. Brackets are closed in correct order (last opened, first closed)
 * 3. No extra or mismatched brackets
 *
 * APPROACH: STACK-BASED MATCHING
 * ===============================
 * Use a stack to track opening brackets:
 *
 * 1. Iterate through each character in string:
 *    a. If opening bracket '(', '{', '[' → Push to stack
 *    b. If closing bracket ')', '}', ']':
 *       - If stack is empty → Invalid (no matching opening)
 *       - Pop from stack and check if it matches
 *       - If doesn't match → Invalid (wrong type)
 *
 * 2. After processing all characters:
 *    - If stack is empty → Valid (all brackets matched)
 *    - If stack not empty → Invalid (unmatched opening brackets)
 *
 * WHY STACK?
 * ==========
 * Stack's LIFO property perfectly matches bracket nesting rules:
 * - Most recently opened bracket should be closed first
 * - Stack top always holds the bracket waiting to be closed
 * - Natural handling of nested structures
 *
 * EXAMPLE 1: Simple Valid Case
 * =============================
 * Input: s = "()"
 *
 * Step 1: char = '('
 *   Opening bracket → Push to stack
 *   Stack: ['(']
 *
 * Step 2: char = ')'
 *   Closing bracket → Check stack
 *   Pop '(' from stack → Matches with ')' ✓
 *   Stack: []
 *
 * End: Stack is empty → Valid → Return true
 *
 * EXAMPLE 2: Multiple Bracket Types
 * ==================================
 * Input: s = "()[]{}"
 *
 * Step 1: '(' → Push → Stack: ['(']
 * Step 2: ')' → Pop '(', matches ✓ → Stack: []
 * Step 3: '[' → Push → Stack: ['[']
 * Step 4: ']' → Pop '[', matches ✓ → Stack: []
 * Step 5: '{' → Push → Stack: ['{']
 * Step 6: '}' → Pop '{', matches ✓ → Stack: []
 *
 * End: Stack is empty → Valid → Return true
 *
 * EXAMPLE 3: Nested Brackets
 * ===========================
 * Input: s = "([{}])"
 *
 * Step 1: '(' → Push → Stack: ['(']
 * Step 2: '[' → Push → Stack: ['(', '[']
 * Step 3: '{' → Push → Stack: ['(', '[', '{']
 * Step 4: '}' → Pop '{', matches ✓ → Stack: ['(', '[']
 * Step 5: ']' → Pop '[', matches ✓ → Stack: ['(']
 * Step 6: ')' → Pop '(', matches ✓ → Stack: []
 *
 * End: Stack is empty → Valid → Return true
 *
 * Visual representation:
 * ( [ { } ] )
 * ↑ ↑ ↑ ↑ ↑ ↑
 * 1 2 3 3 2 1  (nesting level)
 *
 * EXAMPLE 4: Invalid - Wrong Order
 * =================================
 * Input: s = "(]"
 *
 * Step 1: '(' → Push → Stack: ['(']
 * Step 2: ']' → Pop '(', check if matches ']'
 *   '(' does NOT match ']' ✗
 *
 * Return false immediately
 *
 * EXAMPLE 5: Invalid - Missing Opening
 * =====================================
 * Input: s = "())"
 *
 * Step 1: '(' → Push → Stack: ['(']
 * Step 2: ')' → Pop '(', matches ✓ → Stack: []
 * Step 3: ')' → Stack is empty! No opening bracket to match ✗
 *
 * Return false immediately
 *
 * EXAMPLE 6: Invalid - Missing Closing
 * =====================================
 * Input: s = "(()"
 *
 * Step 1: '(' → Push → Stack: ['(']
 * Step 2: '(' → Push → Stack: ['(', '(']
 * Step 3: ')' → Pop '(', matches ✓ → Stack: ['(']
 *
 * End: Stack NOT empty (one '(' unmatched) ✗ → Return false
 *
 * EXAMPLE 7: Complex Nested Valid
 * ================================
 * Input: s = "{[()()]}"
 *
 * Step 1: '{' → Push → Stack: ['{']
 * Step 2: '[' → Push → Stack: ['{', '[']
 * Step 3: '(' → Push → Stack: ['{', '[', '(']
 * Step 4: ')' → Pop '(', matches ✓ → Stack: ['{', '[']
 * Step 5: '(' → Push → Stack: ['{', '[', '(']
 * Step 6: ')' → Pop '(', matches ✓ → Stack: ['{', '[']
 * Step 7: ']' → Pop '[', matches ✓ → Stack: ['{']
 * Step 8: '}' → Pop '{', matches ✓ → Stack: []
 *
 * End: Stack is empty → Valid → Return true
 *
 * Visual:
 * { [ ( ) ( ) ] }
 * 1 2 3 3 3 3 2 1  (nesting level)
 *
 * EXAMPLE 8: Complex Nested Invalid
 * ==================================
 * Input: s = "{[(])}"
 *
 * Step 1: '{' → Push → Stack: ['{']
 * Step 2: '[' → Push → Stack: ['{', '[']
 * Step 3: '(' → Push → Stack: ['{', '[', '(']
 * Step 4: ']' → Pop '(', check if matches ']'
 *   '(' does NOT match ']' ✗
 *
 * Return false immediately
 *
 * Visual (showing the problem):
 * { [ ( ] ) }
 *     ↑ ↑
 *     Wrong order! '(' should be closed before '['
 *
 * EDGE CASES:
 * ===========
 * 1. Single opening bracket: "(" → false (no closing)
 * 2. Single closing bracket: ")" → false (no opening)
 * 3. Empty string: "" → true (technically valid, no brackets to match)
 * 4. Only opening brackets: "(((" → false (stack not empty at end)
 * 5. Only closing brackets: ")))" → false (stack empty when trying to match)
 * 6. Mismatched types: "([)]" → false (wrong bracket types)
 * 7. Correct types, wrong order: "{[(])}" → false
 *
 * MATCHING RULES:
 * ===============
 * Opening → Closing
 * '('     → ')'
 * '{'     → '}'
 * '['     → ']'
 *
 * Any other combination is invalid!
 *
 * ALGORITHM STEP-BY-STEP:
 * ========================
 * 1. Initialize empty stack
 * 2. For each character c in string s:
 *    IF c is '(' or '{' or '[':
 *       Push c onto stack
 *    ELSE (c is closing bracket):
 *       IF stack is empty:
 *          Return false (no matching opening)
 *       Pop top from stack
 *       IF popped bracket doesn't match c:
 *          Return false (wrong type)
 * 3. After loop:
 *    IF stack is empty:
 *       Return true (all matched)
 *    ELSE:
 *       Return false (unmatched openings)
 *
 * IMPLEMENTATION VARIATIONS:
 * ==========================
 * Variation 1: Push opening, pop and compare
 * Variation 2: Push corresponding closing, pop and compare
 * Variation 3: Use HashMap to store bracket pairs
 *
 * WHY NOT OTHER DATA STRUCTURES?
 * ===============================
 * Array/List: Could work but needs explicit index management
 * Queue: FIFO doesn't match nesting pattern (wrong order)
 * Set: Doesn't preserve order, can't track nesting
 * Stack: Perfect LIFO matches bracket nesting rules!
 *
 * COMPLEXITY ANALYSIS:
 * ====================
 * Time Complexity: O(n)
 * - Single pass through string of length n
 * - Each character processed once
 * - Stack operations (push/pop) are O(1)
 *
 * Space Complexity: O(n)
 * - Worst case: all opening brackets → stack stores n/2 elements
 * - Example: "(((((" → stack has 5 elements
 * - Best case: alternating brackets → stack has at most 1 element
 *
 * REAL-WORLD APPLICATIONS:
 * ========================
 * - Compiler syntax validation
 * - HTML/XML tag matching
 * - Mathematical expression validation
 * - Code editor bracket highlighting
 * - JSON/XML parser validation
 *
 * COMMON MISTAKES:
 * ================
 * 1. Not checking if stack is empty before popping
 * 2. Forgetting to check if stack is empty at the end
 * 3. Wrong bracket matching logic
 * 4. Not handling all three bracket types
 * 5. Returning true when finding first match (need to check all)
 *
 * EXTENDED PROBLEM VARIATIONS:
 * ============================
 * - Add more bracket types: < >, « »
 * - Allow other characters in string (ignore non-brackets)
 * - Find the minimum additions to make string valid
 * - Find longest valid parentheses substring
 *
 * RELATED PROBLEMS:
 * =================
 * - LeetCode 22: Generate Parentheses
 * - LeetCode 32: Longest Valid Parentheses
 * - LeetCode 301: Remove Invalid Parentheses
 * - LeetCode 678: Valid Parenthesis String
 * - LeetCode 921: Minimum Add to Make Parentheses Valid
 * - LeetCode 1111: Maximum Nesting Depth of Two Valid Parentheses Strings
 *
 * DIFFICULTY: Easy
 * TOPICS: String, Stack
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(!st.isEmpty()) {
                    char poped = st.pop();
                    if (ch == ')' && poped == '(')
                        continue;
                    if (ch == '}' && poped == '{')
                        continue;
                    if (ch == ']' && poped == '[')
                        continue;
                    return false;
                }
                else
                    return false;

            }
        }
        if(!st.isEmpty())
            return false;
        return true;

    }

    public static void main(String[] args) {
        ValidParentheses vp=new ValidParentheses();
        String s="([{}])";
        System.out.println(vp.isValid(s)); // true
    }
}
