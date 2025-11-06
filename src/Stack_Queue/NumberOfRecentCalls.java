package Stack_Queue;

// LeetCode Problem 933: Number of Recent Calls
// Link: https://leetcode.com/problems/number-of-recent-calls/

/**
 * PROBLEM DESCRIPTION:
 * ====================
 * You have a RecentCounter class which counts the number of recent requests within
 * a certain time frame.
 *
 * Implement the RecentCounter class:
 * - RecentCounter(): Initializes the counter with zero recent requests
 * - int ping(int t): Adds a new request at time t, where t represents some time in
 *   milliseconds, and returns the number of requests that have happened in the past
 *   3000 milliseconds (including the new request). Specifically, return the number
 *   of requests that have happened in the inclusive range [t - 3000, t].
 *
 * PROBLEM CONSTRAINTS:
 * ===================
 * - 1 <= t <= 10^9
 * - Each test case will call ping with strictly increasing values of t
 * - At most 10^4 calls will be made to ping
 *
 * GUARANTEE:
 * ==========
 * It is guaranteed that every call to ping uses a strictly larger value of t
 * than the previous call. (Timestamps are always increasing)
 *
 * KEY CONCEPTS:
 * =============
 * - Queue Data Structure (FIFO)
 * - Sliding Time Window
 * - Removing outdated requests
 * - Time Complexity: O(1) amortized per ping
 * - Space Complexity: O(n) where n is number of requests in 3000ms window
 *
 * THE CHALLENGE:
 * ==============
 * We need to efficiently track requests within a moving 3000ms time window.
 * As time moves forward, old requests become irrelevant and should be removed.
 *
 * APPROACH: QUEUE WITH SLIDING WINDOW
 * ====================================
 * Use a queue to store timestamps of requests:
 *
 * 1. When ping(t) is called:
 *    a. Add t to the queue (new request)
 *    b. Remove all timestamps from front that are < t - 3000 (outdated requests)
 *    c. Return the size of queue (requests in [t-3000, t] range)
 *
 * 2. Why Queue?
 *    - FIFO structure: oldest requests at front, newest at back
 *    - Old requests naturally get removed from front
 *    - Easy to maintain time-ordered sequence
 *
 * WHY THIS WORKS?
 * ===============
 * - Timestamps are strictly increasing (guaranteed by problem)
 * - We only care about requests in last 3000ms
 * - Requests older than t-3000 will NEVER be relevant again
 * - Queue efficiently adds new and removes old in O(1) amortized
 *
 * EXAMPLE 1: Basic Operations
 * ============================
 * RecentCounter counter = new RecentCounter();
 *
 * ping(1):
 *   Time window: [1-3000, 1] = [-2999, 1]
 *   Queue: [1]
 *   Requests in window: 1 → Return 1
 *
 * ping(100):
 *   Time window: [100-3000, 100] = [-2900, 100]
 *   Check if any request < -2900? No
 *   Queue: [1, 100]
 *   Requests in window: 2 → Return 2
 *
 * ping(3001):
 *   Time window: [3001-3000, 3001] = [1, 3001]
 *   Check if any request < 1?
 *     - Request 1: NOT < 1, keep it
 *     - Request 100: NOT < 1, keep it
 *   Queue: [1, 100, 3001]
 *   Requests in window: 3 → Return 3
 *
 * ping(3002):
 *   Time window: [3002-3000, 3002] = [2, 3002]
 *   Check if any request < 2?
 *     - Request 1: 1 < 2, remove it!
 *   Queue: [100, 3001, 3002]
 *   Requests in window: 3 → Return 3
 *
 * EXAMPLE 2: Detailed Walkthrough
 * ================================
 * counter = new RecentCounter()
 *
 * ping(1):
 *   Add 1 to queue → Queue: [1]
 *   Window: [1-3000, 1] = [-2999, 1]
 *   Remove timestamps < -2999: none
 *   Count: 1
 *
 * ping(10):
 *   Add 10 to queue → Queue: [1, 10]
 *   Window: [10-3000, 10] = [-2990, 10]
 *   Remove timestamps < -2990: none
 *   Count: 2
 *
 * ping(500):
 *   Add 500 to queue → Queue: [1, 10, 500]
 *   Window: [500-3000, 500] = [-2500, 500]
 *   Remove timestamps < -2500: none
 *   Count: 3
 *
 * ping(3000):
 *   Add 3000 to queue → Queue: [1, 10, 500, 3000]
 *   Window: [3000-3000, 3000] = [0, 3000]
 *   Remove timestamps < 0: none
 *   Count: 4
 *
 * ping(3001):
 *   Add 3001 to queue → Queue: [1, 10, 500, 3000, 3001]
 *   Window: [3001-3000, 3001] = [1, 3001]
 *   Remove timestamps < 1: none (1 is exactly on boundary)
 *   Count: 5
 *
 * ping(3002):
 *   Add 3002 to queue → Queue: [1, 10, 500, 3000, 3001, 3002]
 *   Window: [3002-3000, 3002] = [2, 3002]
 *   Remove timestamps < 2:
 *     - 1 < 2, remove → Queue: [10, 500, 3000, 3001, 3002]
 *   Count: 5
 *
 * ping(4000):
 *   Add 4000 to queue → Queue: [10, 500, 3000, 3001, 3002, 4000]
 *   Window: [4000-3000, 4000] = [1000, 4000]
 *   Remove timestamps < 1000:
 *     - 10 < 1000, remove → Queue: [500, 3000, 3001, 3002, 4000]
 *     - 500 < 1000, remove → Queue: [3000, 3001, 3002, 4000]
 *   Count: 4
 *
 * EXAMPLE 3: Visual Sliding Window
 * =================================
 * Imagine time moving forward with a 3000ms window:
 *
 * Time 1: Window [−2999, 1]
 *   |-------3000ms-------|
 *                        ↑ ping(1)
 *   Requests: [1] → Count: 1
 *
 * Time 100: Window [−2900, 100]
 *       |-------3000ms-------|
 *                            ↑ ping(100)
 *   Requests: [1, 100] → Count: 2
 *
 * Time 3001: Window [1, 3001]
 *                   |-------3000ms-------|
 *                                        ↑ ping(3001)
 *   Requests: [1, 100, 3001] → Count: 3
 *
 * Time 3002: Window [2, 3002]
 *                    |-------3000ms-------|
 *                                         ↑ ping(3002)
 *   Request 1 is now outside! Remove it.
 *   Requests: [100, 3001, 3002] → Count: 3
 *
 * Time 5000: Window [2000, 5000]
 *                              |-------3000ms-------|
 *                                                   ↑ ping(5000)
 *   Requests 100, 3001, 3002 are all < 2000! Remove all.
 *   Requests: [5000] → Count: 1
 *
 * EDGE CASES:
 * ===========
 * 1. First request: Always returns 1
 * 2. All requests within 3000ms: Queue grows, no removals
 * 3. Large time gaps: Multiple requests removed at once
 * 4. Requests exactly at boundaries: [t-3000, t] is INCLUSIVE
 * 5. Maximum time: t can be up to 10^9, queue handles it
 *
 * BOUNDARY CONDITIONS:
 * ====================
 * Window is [t-3000, t] INCLUSIVE on both ends!
 *
 * If t = 3000:
 *   Window = [0, 3000]
 *   Request at time 0 is INCLUDED
 *   Request at time -1 would be EXCLUDED
 *
 * If t = 3001:
 *   Window = [1, 3001]
 *   Request at time 1 is INCLUDED
 *   Request at time 0 would be EXCLUDED
 *
 * WHY NOT USE ARRAY OR LIST?
 * ===========================
 * Array/ArrayList:
 * - Removing from front is O(n) - requires shifting all elements
 * - Would make each ping potentially O(n)
 *
 * Queue:
 * - Removing from front is O(1)
 * - Adding to back is O(1)
 * - Perfect for FIFO sliding window pattern
 *
 * COMPLEXITY ANALYSIS:
 * ====================
 * Time Complexity:
 * - ping(): O(1) amortized
 *   - Adding to queue: O(1)
 *   - Removing old requests: Each request removed at most once
 *   - Across all operations, total removals = total additions
 *
 * Space Complexity:
 * - O(W) where W is max requests in 3000ms window
 * - In worst case: O(n) if all n requests within 3000ms
 * - Typically much smaller in practice
 *
 * REAL-WORLD APPLICATION:
 * =======================
 * This pattern is used for:
 * - Rate limiting (API request throttling)
 * - Activity tracking (users active in last X minutes)
 * - Real-time analytics (events in last hour)
 * - Network traffic monitoring
 * - Log aggregation systems
 *
 * ALTERNATIVE APPROACHES:
 * =======================
 * 1. Store all timestamps, count on each ping:
 *    - Time: O(n) per ping - Too slow!
 *    - Space: O(n)
 *
 * 2. Binary search + list:
 *    - Time: O(log n) per ping
 *    - Space: O(n)
 *    - More complex, not needed here
 *
 * 3. Queue (Current):
 *    - Time: O(1) amortized
 *    - Space: O(W)
 *    - Optimal!
 *
 * IMPLEMENTATION TIPS:
 * ====================
 * - Use LinkedList as Queue in Java
 * - poll() removes from front
 * - offer() or add() adds to back
 * - peek() checks front without removal
 * - size() gives current count
 *
 * COMMON MISTAKES:
 * ================
 * 1. Using < instead of <= for window check
 * 2. Forgetting to add new request before checking
 * 3. Not removing old requests (queue grows indefinitely)
 * 4. Using wrong data structure (ArrayList instead of Queue)
 *
 * RELATED PROBLEMS:
 * =================
 * - LeetCode 362: Design Hit Counter
 * - LeetCode 346: Moving Average from Data Stream
 * - LeetCode 359: Logger Rate Limiter
 * - LeetCode 1500: Design a File Sharing System
 *
 * DIFFICULTY: Easy
 * TOPICS: Queue, Design, Data Stream
 */
public class NumberOfRecentCalls {
}
