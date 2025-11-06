package Stack_Queue;

// LeetCode Problem 739: Daily Temperatures
// Link: https://leetcode.com/problems/daily-temperatures/

/**
 * PROBLEM DESCRIPTION:
 * ====================
 * Given an array of integers 'temperatures' representing the daily temperatures,
 * return an array 'answer' such that answer[i] is the number of days you have to wait
 * after the i-th day to get a warmer temperature. If there is no future day for which
 * this is possible, keep answer[i] == 0 instead.
 *
 * PROBLEM CONSTRAINTS:
 * ===================
 * - 1 <= temperatures.length <= 10^5
 * - 30 <= temperatures[i] <= 100
 *
 * KEY CONCEPTS:
 * =============
 * - Monotonic Stack (Decreasing Stack)
 * - Next Greater Element Pattern
 * - Stack-based optimization for finding next warmer day
 * - Time Complexity: O(n) - Each element is pushed and popped at most once
 * - Space Complexity: O(n) - Stack can store all indices in worst case
 *
 * APPROACH:
 * =========
 * Use a monotonic decreasing stack to store indices of temperatures. For each day:
 * 1. While current temperature is warmer than temperature at stack's top index,
 *    pop the index and calculate the difference (number of days to wait)
 * 2. Push current index onto the stack
 * 3. Remaining indices in stack have no warmer future day (answer remains 0)
 *
 * WHY STACK?
 * ==========
 * Stack helps us efficiently track all previous days that are waiting for a warmer day.
 * When we find a warmer day, we can resolve multiple previous days in one pass.
 * This avoids nested loops and reduces time complexity from O(n²) to O(n).
 *
 * EXAMPLE 1:
 * ==========
 * Input:  temperatures = [73, 74, 75, 71, 69, 72, 76, 73]
 * Output: [1, 1, 4, 2, 1, 1, 0, 0]
 *
 * Explanation:
 * - Day 0 (73°): Next warmer day is Day 1 (74°) → wait 1 day
 * - Day 1 (74°): Next warmer day is Day 2 (75°) → wait 1 day
 * - Day 2 (75°): Next warmer day is Day 6 (76°) → wait 4 days
 * - Day 3 (71°): Next warmer day is Day 5 (72°) → wait 2 days
 * - Day 4 (69°): Next warmer day is Day 5 (72°) → wait 1 day
 * - Day 5 (72°): Next warmer day is Day 6 (76°) → wait 1 day
 * - Day 6 (76°): No warmer day after this → wait 0 days
 * - Day 7 (73°): No warmer day after this → wait 0 days
 *
 * EXAMPLE 2:
 * ==========
 * Input:  temperatures = [30, 40, 50, 60]
 * Output: [1, 1, 1, 0]
 *
 * Explanation:
 * Temperatures are strictly increasing, so each day only waits 1 day for the next
 * warmer temperature, except the last day which has no warmer day ahead.
 *
 * EXAMPLE 3:
 * ==========
 * Input:  temperatures = [30, 60, 90]
 * Output: [1, 1, 0]
 *
 * Explanation:
 * Each day (except last) has the next day as warmer.
 *
 * EXAMPLE 4:
 * ==========
 * Input:  temperatures = [89, 62, 70, 58, 47, 47, 46, 76, 100, 70]
 * Output: [8, 1, 7, 2, 1, 1, 1, 1, 0, 0]
 *
 * Explanation:
 * - Day 0 (89°): Has to wait until Day 8 (100°) for a warmer temperature → 8 days
 * - Day 1 (62°): Next day (Day 2: 70°) is warmer → 1 day
 * - Day 2 (70°): Has to wait until Day 8 (100°) → 6 days from Day 2
 * - And so on...
 *
 * EDGE CASES:
 * ===========
 * 1. Single day: [30] → [0] (no future days to compare)
 * 2. All same temperatures: [75, 75, 75] → [0, 0, 0] (never gets warmer)
 * 3. Strictly decreasing: [90, 80, 70, 60] → [0, 0, 0, 0] (no warmer days ahead)
 * 4. Strictly increasing: [60, 70, 80, 90] → [1, 1, 1, 0] (next day is always warmer)
 *
 * ALGORITHM WALKTHROUGH (Example 1):
 * ===================================
 * temperatures = [73, 74, 75, 71, 69, 72, 76, 73]
 * answer = [0, 0, 0, 0, 0, 0, 0, 0] (initialized)
 * stack = [] (stores indices)
 *
 * i=0, temp=73: stack is empty, push 0 → stack=[0]
 * i=1, temp=74: 74 > 73 (temp at stack top 0), pop 0, answer[0]=1-0=1 → stack=[1]
 * i=2, temp=75: 75 > 74 (temp at stack top 1), pop 1, answer[1]=2-1=1 → stack=[2]
 * i=3, temp=71: 71 < 75, push 3 → stack=[2,3]
 * i=4, temp=69: 69 < 71, push 4 → stack=[2,3,4]
 * i=5, temp=72: 72 > 69, pop 4, answer[4]=5-4=1
 *               72 > 71, pop 3, answer[3]=5-3=2
 *               72 < 75, push 5 → stack=[2,5]
 * i=6, temp=76: 76 > 72, pop 5, answer[5]=6-5=1
 *               76 > 75, pop 2, answer[2]=6-2=4
 *               push 6 → stack=[6]
 * i=7, temp=73: 73 < 76, push 7 → stack=[6,7]
 *
 * Final answer = [1, 1, 4, 2, 1, 1, 0, 0]
 * (Indices 6 and 7 remain in stack with answer[6]=0, answer[7]=0)
 *
 * RELATED PROBLEMS:
 * =================
 * - LeetCode 496: Next Greater Element I
 * - LeetCode 503: Next Greater Element II
 * - LeetCode 901: Online Stock Span
 * - LeetCode 1019: Next Greater Node In Linked List
 *
 * DIFFICULTY: Medium
 * TOPICS: Array, Stack, Monotonic Stack
 */
public class DailyTemperatures {
}
