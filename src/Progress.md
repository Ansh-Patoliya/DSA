# 🚀 My 90-Day DSA Grind 🚀

<div align="center">

![Days](https://img.shields.io/badge/Days_Completed-27%2F90-blue?style=for-the-badge)
![Problems](https://img.shields.io/badge/Problems_Solved-47-success?style=for-the-badge)
![Streak](https://img.shields.io/badge/Current_Streak-1_Days-orange?style=for-the-badge)

</div>

---

> *"The journey of a thousand miles begins with a single step."*

---

<br>

## 📅 **Day 1** – The Foundation & Setup *(2 Oct 2025)*

### 🎯 **Focus of the Day** 
Building the right environment for consistent coding

---

### ✅ **Tasks Completed**

- **`Initialized Git Repository`**: Successfully created a dedicated GitHub repository to track daily progress and code commits.
- **`Structured Roadmap`**: Organized a comprehensive list of all DSA topics and curated a problem set for each.
- **`Created Progress Log`**: Set up a clean markdown file (README.md or progress.log) to document descriptions of solved problems and daily learnings.

---

### 💭 **Comment**
> A strong setup is the first step towards success. The foundation is now laid for the next 89 days of consistent effort! 👍

---

<br>

## 📅 **Day 2** – Binary Search *(3 Oct 2025)*

### 🎯 **Focus of the Day**
Applying the "Divide and Conquer" strategy and understanding its time complexity implications.

---

### ✅ **Tasks Completed**

#### 🔹 **Problem 1**: LeetCode 704 - `Binary Search`

- **`Problem`**: Given a sorted array of integers and a target value, find the index of the target. If the target does not exist, return -1.

- **`Approach`**: Implemented an iterative solution using start, end, and mid pointers to continuously narrow down the search space by half.

- **Complexity Analysis**:
  - **`Time`**: O(log n) — The search area is halved with each iteration.
  - **`Space`**: O(1) — No extra space is used besides the pointers.

- **`Edge Cases Handled`**: Empty array, target not present, target at the beginning or end of the array.

---

#### 🔹 **Problem 2**: LeetCode 1 - `Two Sum` (using Binary Search)

- **`Problem`**: Given an array of integers, return indices of the two numbers such that they add up to a specific target.

- **`Approach`**: First sorted the array and then used binary search to find the complement for each element.

- **Complexity Analysis**:
  - **`Time`**: O(n log n) — Sorting takes O(n log n) and each binary search takes O(log n).
  - **`Space`**: O(1) — Sorting is done in place.

- **`Edge Cases Handled`**: No solution exists, multiple pairs exist.

---

### 💭 **Reflection**

- Today was a great deep dive into Binary Search. The core logic of halving the search space is elegant and the O(log n) time complexity is a massive improvement <br>over a linear scan. The key insight from "Search Insert Position" was realizing how the loop termination condition and the final state of the pointers can solve variations <br>of the problem.

- A crucial learning moment was recognizing that while Binary Search can be used for the "Two Sum" problem after sorting, a HashMap approach is far more efficient <br>(O(n) time). This highlights that knowing multiple data structures is key to finding the optimal solution. Solid progress! 💪

---

## 📅 **Day 3** – Remove Duplicates from Sorted Array and Remove Element *(4 Oct 2025)*

### 🎯 **Focus of the Day**
Mastering in-place array manipulation using the two-pointer technique.

---
### ✅ **Tasks Completed**
#### 🔹 **Problem 1**: LeetCode 26 - `Remove Duplicates from Sorted Array`
- **`Problem`**: Given a sorted array, remove the duplicates in-place such that each element appears only once and return the new length.
- **`Approach`**: Used two pointers - one to iterate through the array and another to track the position of unique elements.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each element is processed once.
  - **`Space`**: O(1) — No extra space is used.
- **`Edge Cases Handled`**: Empty array, all elements are the same.
---
#### 🔹 **Problem 2**: LeetCode 27 - `Remove Element`
- **`Problem`**: Given an array and a value, remove all instances of that value in-place and return the new length.
- **`Approach`**: Similar two-pointer technique, where one pointer iterates and the other tracks the position of non-target elements.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each element is processed once.
  - **`Space`**: O(1) — No extra space is used.
- **`Edge Cases Handled`**: Empty array, target value not present, all elements are the target value.
---
- ### 💭 **Reflection**
- Today's focus on in-place array manipulation using the two-pointer technique was incredibly insightful. Both problems reinforced the importance of maintaining a clean and efficient approach to modifying arrays without extra space.
- The key takeaway from "Remove Duplicates from Sorted Array" was the realization that the sorted property of the array allows us to easily identify duplicates by comparing adjacent elements. This significantly simplifies the logic and ensures we only traverse the array once.
- In "Remove Element," the flexibility of the two-pointer technique was further highlighted. By adjusting the pointers based on whether the current element matches the target value, we can efficiently filter out unwanted elements while maintaining the order of the remaining elements.

---
## 📅 **Day 4** – Plus One *(5 Oct 2025)*

### 🎯 **Focus of the Day**
Handling carry-over in digit-based problems and understanding array manipulation.

---
### ✅ **Tasks Completed**
#### 🔹 **Problem**: LeetCode 66 - `Plus One`
- **`Problem`**: Given a non-empty array of digits representing a non-negative integer, increment one to the integer.
- **`Approach`**: Traversed the array from the end to the beginning, handling carry-over as needed.
- **Complexity Analysis**:
  - **`Time`**: O(n) — In the worst case, we may need to traverse the entire array.
  - **`Space`**: O(1) — No extra space is used, except for the output array in case of a carry-over.
- **`Edge Cases Handled`**: All digits are 9 (e.g., [9,9,9]), single digit arrays, no carry-over needed.
--- 
### 💭 **Reflection**
- Today's problem, "Plus One," was a fantastic exercise in handling carry-over logic in digit-based problems. The approach of traversing the array from the end allowed for a straightforward way to manage carry-overs, similar to how addition is performed manually.
- A key insight was recognizing that if all digits are 9, we need to create a new array to accommodate the extra digit resulting from the carry-over. This edge case was crucial to handle correctly to avoid index errors.
--- 

## 📅 **Day 5** – Move Zeroes and Apply Operation to Array *(6 Oct 2025)*

### 🎯 **Focus of the Day**
Efficiently rearranging elements in an array while maintaining the order of non-zero elements.

---
### ✅ **Tasks Completed**
#### 🔹 **Problem**: LeetCode 283 - `Move Zeroes`
- **`Problem`**: Given an array, move all 0's to the end while maintaining the relative order of the non-zero elements.
- **`Approach`**: Used the two-pointer technique to shift non-zero elements forward and fill the rest with zeros.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each element is processed once.
  - **`Space`**: O(1) — No extra space is used.
- **`Edge Cases Handled`**: All elements are zero, no zeros in the array, mixed zeros and non-zeros.
---

#### 🔹 **Problem**: LeetCode 2460 - `Apply Operations to an Array`
- **`Problem`**: Given an array, apply a specific operation to adjacent equal elements.
- **`Approach`**: Iterated through the array, applying the operation and shifting elements as needed.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each element is processed once.
  - **`Space`**: O(1) — No extra space is used.
- **`Edge Cases Handled`**: No adjacent equal elements, all elements are the same.
---
### 💭 **Reflection**
- Today's problems, "Move Zeroes" and "Apply Operations to an Array," were excellent exercises in array manipulation and the two-pointer technique. Both problems required careful handling of element positions to achieve the desired outcomes efficiently.
- In "Move Zeroes," the challenge was to maintain the relative order of non-zero elements while shifting zeros to the end. The two-pointer approach proved to be an effective solution, allowing for a single pass through the array.
- "Apply Operations to an Array" introduced a different kind of manipulation, where adjacent equal elements needed to be processed. This problem reinforced the importance of careful iteration and condition checking to ensure the correct application of operations without disrupting the array's structure.

---

## 📅 **Day 6** – Majority Element , Best Time to Buy and Sell Stock , Contains Duplicate *(7 Oct 2025)*

### 🎯 **Focus of the Day**
Solving diverse problems to reinforce different algorithmic techniques and data structures.

---
### ✅ **Tasks Completed**
#### 🔹 **Problem**: LeetCode 169 - `Majority Element`
- **`Problem`**: Given an array, find the majority element (the element that appears more than n/2 times).
- **`Approach`**: Implemented the Boyer-Moore Voting Algorithm to efficiently find the majority element.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each element is processed once.
  - **`Space`**: O(1) — No extra space is used.
- **`Edge Cases Handled`**: Array with all identical elements, array with no majority element (though the problem guarantees one).
---

#### 🔹 **Problem**: LeetCode 121 - `Best Time to Buy and Sell Stock`
- **`Problem`**: Given an array of prices, find the maximum profit by choosing a single buy and sell.
- **`Approach`**: Tracked the minimum price and calculated potential profits in a single pass.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each price is processed once.
  - **`Space`**: O(1) — No extra space is used.
- **`Edge Cases Handled`**: Prices in descending order (no profit), single day prices.
---
#### 🔹 **Problem**: LeetCode 217 - `Contains Duplicate`
- **`Problem`**: Given an array, determine if it contains any duplicates.
- **`Approach`**: Used a HashSet to track seen elements and check for duplicates.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each element is processed once.
  - **`Space`**: O(n) — In the worst case, all elements are unique.
- **`Edge Cases Handled`**: Empty array, all elements are the same, no duplicates.
---
### 💭 **Reflection**
- Today's problems, "Majority Element," "Best Time to Buy and Sell Stock," and "Contains Duplicate," provided a diverse set of challenges that reinforced different algorithmic techniques and data structures.
- The Boyer-Moore Voting Algorithm in "Majority Element" was particularly enlightening. It showcased how we can efficiently determine the majority element in linear time and constant space, which is a significant improvement over naive counting methods.
- "Best Time to Buy and Sell Stock" highlighted the importance of tracking minimum values and calculating potential profits in a single pass, which is a common pattern in optimization problems.
- "Contains Duplicate" was a straightforward problem that emphasized the utility of HashSets for quick lookups and duplicate detection.
---

## 📅 **Day 7** - Missing Number , Find All Numbers Disappeared in an Array *(8 Oct 2025)*

### 🎯 **Focus of the Day**
Mastering array manipulation and mathematical properties to solve problems efficiently.\

---
### ✅ **Tasks Completed**
#### 🔹 **Problem**: LeetCode 268 - `Missing Number`
- **`Problem`**: Given an array containing n distinct numbers taken from 0 to n, find the missing number.
- **`Approach`**: Used the mathematical formula for the sum of the first n natural numbers to find the missing number.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each element is processed once.
  - **`Space`**: O(1) — No extra space is used.
- **`Edge Cases Handled`**: Missing number is 0, missing number is n, single element array.
---
- #### 🔹 **Problem**: LeetCode 448 - `Find All Numbers Disappeared in an Array`
- **`Problem`**: Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), find all the numbers that do not appear in the array.
- **`Approach`**: Used the input array itself to mark the presence of numbers by negating the values at corresponding indices.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each element is processed once.
  - **`Space`**: O(1) — No extra space is used.
- **`Edge Cases Handled`**: All numbers present, no numbers present, single element array.
---
### 💭 **Reflection**
- Today's problems, "Missing Number" and "Find All Numbers Disappeared in an Array," were excellent exercises in array manipulation and leveraging mathematical properties to solve problems efficiently.
- In "Missing Number," the use of the mathematical formula for the sum of the first n natural numbers provided a clever way to find the missing number without needing extra space or complex data structures. This approach is both time and space efficient.
- "Find All Numbers Disappeared in an Array" showcased a unique technique of using the input array itself to track the presence of numbers. By negating values at corresponding indices, we could efficiently identify which numbers were missing without additional space.
- Both problems reinforced the importance of thinking creatively about how to use existing data structures to solve problems in optimal ways.

---

## 📅 **Day 8** – Merge Sorted Array *(9 Oct 2025)*
### 🎯 **Focus of the Day**
Efficiently merging two sorted arrays in-place using the two-pointer technique.

---
### ✅ **Tasks Completed**
#### 🔹 **Problem**: LeetCode 88 - `Merge Sorted Array`
- **`Problem`**: Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
- **`Approach`**: Used three pointers to merge the arrays from the end to avoid overwriting elements in nums1.
- **Complexity Analysis**:
  - **`Time`**: O(m + n) — Each element from both arrays is processed once.
  - **`Space`**: O(1) — No extra space is used.
- **`Edge Cases Handled`**: One or both arrays are empty, all elements in one array are smaller/larger than the other.
---
### 💭 **Reflection**
- Today's problem, "Merge Sorted Array," was a great exercise in using the two-pointer technique to efficiently merge two sorted arrays in-place. The approach of starting from the end of both arrays was particularly clever, as it allowed us to avoid overwriting elements in nums1 that had not yet been processed.
- A key insight was recognizing that by using three pointers (one for each array and one for the position in nums1), we could effectively manage the merging process without needing additional space. This is especially important in scenarios where memory usage is a concern.
- Handling edge cases, such as when one or both arrays are empty, reinforced the importance of thorough testing and validation in algorithm design.

---

## 📅 **Day 9** – Single Number , Pascal's Triangle , Maximum Subarray *(10 Oct 2025)*
### 🎯 **Focus of the Day**
Diverse problem-solving to enhance understanding of bit manipulation, combinatorial generation, and dynamic programming.

---
### ✅ **Tasks Completed**

#### 🔹 **Problem**: LeetCode 136 - `Single Number`
- **`Problem`**: Given a non-empty array of integers, every element appears twice except for one. Find that single one.
- **`Approach`**: Used the XOR bitwise operation to find the unique element.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each element is processed once.
  - **`Space`**: O(1) — No extra space is used.
- **`Edge Cases Handled`**: Single element array, all elements are the same.
---

- #### 🔹 **Problem**: LeetCode 118 - `Pascal's Triangle`
- **`Problem`**: Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
- **`Approach`**: Built the triangle row by row, using the properties of binomial coefficients.
- **Complexity Analysis**:
  - **`Time`**: O(numRows^2) — Each row is built based on the previous row.
  - **`Space`**: O(numRows^2) — The output triangle requires space proportional to the number of rows.
- **`Edge Cases Handled`**: numRows = 0, numRows = 1.
---
- #### 🔹 **Problem**: LeetCode 53 - `Maximum Subarray`
- **`Problem`**: Given an integer array, find the contiguous subarray with the largest sum.
- **`Approach`**: Implemented Kadane's Algorithm to find the maximum subarray sum in a single pass.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each element is processed once.
  - **`Space`**: O(1) — No extra space is used.
- **`Edge Cases Handled`**: All negative numbers, single element array.
---
- ### 💭 **Reflection**
- Today's problems, "Single Number," "Pascal's Triangle," and "Maximum Subarray," provided a diverse set of challenges that enhanced my understanding of bit manipulation, combinatorial generation, and dynamic programming.
- The use of the XOR operation in "Single Number" was particularly elegant, showcasing how bitwise operations can solve problems efficiently without additional space.
- "Pascal's Triangle" reinforced the concept of building solutions iteratively based on previous results, a foundational idea in combinatorics and dynamic programming.
- "Maximum Subarray" was a classic problem that highlighted the power of Kadane's Algorithm, demonstrating how a seemingly complex problem can be solved in linear time with a simple yet effective approach.

---

## 📅 **Day 10** – Valid Anagram , Ransom Note , Intersection of Two Arrays *(25 Oct 2025)*

### 🎯 **Focus of the Day**
Strengthening string manipulation and set operations through practical problems.

---
### ✅ **Tasks Completed**
#### 🔹 **Problem**: LeetCode 242 - `Valid Anagram`
- **`Problem`**: Given two strings, determine if one is an anagram of the other.
- **`Approach`**: Used a frequency count array to compare character counts.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each character in both strings is processed once.
  - **`Space`**: O(1) — The frequency array has a fixed size of 26 for lowercase letters.
- **`Edge Cases Handled`**: Different lengths, empty strings.
---
#### 🔹 **Problem**: LeetCode 383 - `Ransom Note`
- **`Problem`**: Given two strings, determine if the ransom note can be constructed from the magazine.
- **`Approach`**: Used a frequency count array to track character availability.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each character in both strings is processed once.
  - **`Space`**: O(1) — The frequency array has a fixed size of 26 for lowercase letters.
- **`Edge Cases Handled`**: Empty ransom note, magazine shorter than ransom note.
---
#### 🔹 **Problem**: LeetCode 349 - `Intersection of Two Arrays`
- **`Problem`**: Given two arrays, return their intersection.
- **`Approach`**: Used sets to find common elements between the two arrays.
- **Complexity Analysis**:
  - **`Time`**: O(n + m) — Each element in both arrays is processed once.
  - **`Space`**: O(min(n, m)) — The smaller set is used to store unique elements.
- **`Edge Cases Handled`**: No common elements, one or both arrays are empty.
---
### 💭 **Reflection**
- Today's problems, "Valid Anagram," "Ransom Note," and "Intersection of Two Arrays," were excellent exercises in string manipulation and set operations.
- The frequency count approach used in both "Valid Anagram" and "Ransom Note" was efficient and straightforward, allowing for quick comparisons of character availability. This method is particularly effective for problems involving character counts and can be easily adapted for different character sets.
- "Intersection of Two Arrays" highlighted the utility of sets for finding common elements efficiently. By leveraging the properties of sets, we can quickly identify intersections without the need for nested loops, which would increase time complexity.
- Overall, these problems reinforced the importance of choosing the right data structures and algorithms based on the specific requirements of the problem at hand.
---

## 📅 **Day 11** – Two Sum II - Input Array Is Sorted , Square of a Sorted Array *(26 Oct 2025)*
### 🎯 **Focus of the Day**
Utilizing the two-pointer technique to solve problems involving sorted arrays.

---
### ✅ **Tasks Completed**
#### 🔹 **Problem**: LeetCode 167 - `Two Sum II - Input Array Is Sorted`
- **`Problem`**: Given a sorted array, find two numbers that add up to a specific target.
- **`Approach`**: Used the two-pointer technique to find the pair that sums to the target.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each element is processed once.
  - **`Space`**: O(1) — No extra space is used.
- **`Edge Cases Handled`**: No solution exists, multiple pairs exist.
---
#### 🔹 **Problem**: LeetCode 977 - `Square of a Sorted Array`
- **`Problem`**: Given a sorted array, return an array of the squares of each number sorted in non-decreasing order.
- **`Approach`**: Used the two-pointer technique to fill the result array from the largest square to the smallest.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each element is processed once.
  - **`Space`**: O(n) — The output array requires space proportional to the input array.
- **`Edge Cases Handled`**: All negative numbers, all positive numbers, mixed numbers.
---
### 💭 **Reflection**
- Today's problems, "Two Sum II - Input Array Is Sorted" and "Square of a Sorted Array," were excellent exercises in utilizing the two-pointer technique to solve problems involving sorted arrays.
- The two-pointer approach in "Two Sum II" allowed for an efficient search for the target pair by leveraging the sorted property of the array. By adjusting the pointers based on the current sum, we could quickly converge on the solution without needing additional space or complex data structures.
- In "Square of a Sorted Array," the two-pointer technique was again employed effectively to fill the result array in a single pass. By comparing the absolute values of the elements at both ends of the array, we could determine which square to place next in the result array, ensuring that the output remained sorted.
- Both problems reinforced the versatility and efficiency of the two-pointer technique, particularly when dealing with sorted data.
---

## 📅 **Day 12** – Valid Palindrome , Container With Most Water *(27 Oct 2025)*

### 🎯 **Focus of the Day**
Enhancing string manipulation skills and mastering the two-pointer technique for optimization problems.

---
### ✅ **Tasks Completed**
#### 🔹 **Problem**: LeetCode 125 - `Valid Palindrome`
- **`Problem`**: Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
- **`Approach`**: Used two pointers to compare characters from both ends of the string, skipping non-alphanumeric characters.
- **Complexity Analysis:
  - **`Time`**: O(n) — Each character is processed once.
  - **`Space`**: O(1) — No extra space is used.
- **`Edge Cases Handled`**: Empty string, string with only non-alphanumeric characters.
---
#### 🔹 **Problem**: LeetCode 11 - `Container With Most Water`
- **`Problem`**: Given n non-negative integers representing the heights of vertical lines, find two lines that together with the x-axis form a container that holds the most water.
- **`Approach`**: Used the two-pointer technique to maximize the area by adjusting pointers based on the heights of the lines.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each line is processed once.
  - **`Space`**: O(1) — No extra space is used.
- **`Edge Cases Handled`**: All lines of equal height, single line.
---
### 💭 **Reflection**
- Today's problems, "Valid Palindrome" and "Container With Most Water," were excellent exercises in string manipulation and the two-pointer technique for optimization problems.
- In "Valid Palindrome," the two-pointer approach allowed for an efficient comparison of characters while effectively handling non-alphanumeric characters. This method ensured that we only focused on relevant characters, making the solution both time and space efficient.
- "Container With Most Water" showcased the power of the two-pointer technique in maximizing area. By intelligently adjusting the pointers based on the heights of the lines, we could explore all potential containers in a single pass.
- Both problems reinforced the versatility of the two-pointer technique and highlighted its effectiveness in solving a variety of problems.
---

## 📅 **Day 13 ** – Maximum Average Subarray I , Longest Substring Without Repeating Characters , Minimum Size Subarray Sum *(28 Oct 2025)*
### 🎯 **Focus of the Day**
Mastering the sliding window technique for efficient subarray and substring problems.

---
### ✅ **Tasks Completed**
#### 🔹 **Problem**: LeetCode 643 - `Maximum Average Subarray I`
- **`Problem`**: Given an array and an integer k, find the contiguous subarray of length k that has the maximum average value.
- **`Approach`**: Used the sliding window technique to calculate the sum of subarrays of length k and track the maximum average.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each element is processed once.
  - **`Space`**: O(1) — No extra space is used.
- **`Edge Cases Handled`**: k equals the length of the array, all elements are the same.
---
#### 🔹 **Problem**: LeetCode 3 - `Longest Substring Without Repeating Characters`
- **`Problem`**: Given a string, find the length of the longest substring without repeating characters.
- **`Approach`**: Used the sliding window technique with a HashMap to track the last seen index of characters.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each character is processed once.
  - **`Space`**: O(min(m, n)) — The HashMap stores characters, where m is the size of the character set.
- **`Edge Cases Handled`**: Empty string, all characters are the same.
---
#### 🔹 **Problem**: LeetCode 209 - `Minimum Size Subarray Sum`
- **`Problem`**: Given an array of positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s.
- **`Approach`**: Used the sliding window technique to expand and contract the window based on the current sum.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each element is processed once.  
  - **`Space`**: O(1) — No extra space is used.
- **`Edge Cases Handled`**: No valid subarray exists, single element array.
---
### 💭 **Reflection**
  - Today's problems, "Maximum Average Subarray I," "Longest Substring Without Repeating Characters," and "Minimum Size Subarray Sum," were excellent exercises in mastering the sliding window technique for efficient subarray and substring problems.
  - The sliding window approach in "Maximum Average Subarray I" allowed for efficient calculation of subarray sums by maintaining a running total and adjusting the window size as needed. This method ensured that we could find the maximum average in linear time.
  - In "Longest Substring Without Repeating Characters," the combination of the sliding window technique with a HashMap provided an effective way to track character indices and manage the window boundaries. This approach allowed us to dynamically adjust the window size based on character repetitions.
  - "Minimum Size Subarray Sum" further reinforced the sliding window concept by demonstrating how to expand and contract the window based on the current sum. This problem highlighted the importance of maintaining a balance between window size and the target sum.
  - Overall, these problems solidified my understanding of the sliding window technique and its versatility in solving a variety of problems efficiently.
--- 

## 📅 **Day 14 ** – Fruit Into Baskets *(29 Oct 2025)*
### 🎯 **Focus of the Day**
Applying the sliding window technique to solve problems involving contiguous subarrays with constraints.

---
### ✅ **Tasks Completed**
#### 🔹 **Problem**: LeetCode 904 - `Fruit Into Baskets`
- **`Problem`**: Given an array representing types of fruits, find the length of the longest subarray containing at most two different types of fruits.
- **`Approach`**: Used the sliding window technique with a HashMap to track the count of each fruit type within the window.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each element is processed once.
  - **`Space`**: O(1) — The HashMap stores at most two fruit types.
- **`Edge Cases Handled`**: All fruits are the same type, only one type of fruit present.
---
### 💭 **Reflection**
- Today's problem, "Fruit Into Baskets," was an excellent exercise in applying the sliding window technique to solve problems involving contiguous subarrays with constraints.
- The sliding window approach, combined with a HashMap to track fruit counts, allowed for efficient management of the window size while ensuring that we adhered to the constraint of having at most two different fruit types. This method enabled us to dynamically adjust the window boundaries based on the current fruit counts.
- A key insight was recognizing that when the number of fruit types exceeded two, we needed to shrink the window from the left until we were back within the constraint. This required careful tracking of the counts and ensuring that we updated the maximum length of valid subarrays accordingly.
- Overall, this problem reinforced the versatility of the sliding window technique and highlighted its effectiveness in solving a variety of problems efficiently.
---

## 📅 **Day 15 ** – Reverse Linked List *(31 Oct 2025)*
### 🎯 **Focus of the Day**
Mastering linked list manipulation through iterative and recursive approaches.

---
### ✅ **Tasks Completed**
#### 🔹 **Problem**: LeetCode 206 - `Reverse Linked List`
- **`Problem`**: Given the head of a singly linked list, reverse the list.
- **`Approach`**: Implemented both iterative and recursive methods to reverse the linked list.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each node is processed once.
  - **`Space`**: O(1) for iterative, O(n) for recursive due to call stack.
- **`Edge Cases Handled`**: Empty list, single node list.
--- 
### 💭 **Reflection**
- Today's problem, "Reverse Linked List," was a great exercise in mastering linked list manipulation through both iterative and recursive approaches.
- The iterative method provided a straightforward way to reverse the linked list by maintaining three pointers: previous, current, and next. This approach allowed for in-place reversal of the list with constant space complexity.
- The recursive method offered a more elegant solution, leveraging the call stack to reverse the list. However, it came with the trade-off of increased space complexity due to the call stack.
- A key insight was understanding the importance of updating pointers correctly to avoid losing access to nodes during the reversal process. Careful management of the pointers ensured that we could successfully reverse the list without any data loss.
- Overall, this problem reinforced my understanding of linked list operations and highlighted the different approaches that can be taken to solve the same problem. 
---

## 📅 **Day 16 ** – Middle of the Linked List , Delete Node in a Linked List *(3 Nov 2025)*
### 🎯 **Focus of the Day**
Enhancing linked list manipulation skills by solving common problems.

---
### ✅ **Tasks Completed**
#### 🔹 **Problem**: LeetCode 876 - `Middle of the Linked List`
- **`Problem`**: Given the head of a singly linked list, return the middle node.
- **`Approach`**: Used the slow and fast pointer technique to find the middle node.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each node is processed once.
  - **`Space`**: O(1) — No extra space is used.
  - **`Edge Cases Handled`**: Empty list, single node list.
---
#### 🔹 **Problem**: LeetCode 237 - `Delete Node in a Linked List`
- **`Problem`**: Given a node in a singly linked list, delete that node.
- **`Approach`**: Copied the value of the next node to the current node and adjusted pointers to bypass the next node.
- **Complexity Analysis**:
  - **`Time`**: O(1) — The operation is done in constant time.
  - **`Space`**: O(1) — No extra space is used.
- **`Edge Cases Handled`**: Node to be deleted is the last node (though not applicable as per problem constraints).
---
### 💭 **Reflection**
- Today's problems, "Middle of the Linked List" and "Delete Node in a Linked List," were excellent exercises in enhancing linked list manipulation skills by solving common problems.
- The slow and fast pointer technique used in "Middle of the Linked List" provided an efficient way to find the middle node in a single pass through the list. This approach effectively balances the traversal speed of two pointers to pinpoint the middle node without needing to know the length of the list beforehand.
- In "Delete Node in a Linked List," the strategy of copying the value from the next node and adjusting pointers allowed for a quick deletion of the specified node. This method is particularly clever as it avoids the need to traverse the list to find the previous node, which is not possible given the problem constraints.
- A key insight from both problems was the importance of pointer manipulation in linked lists. Properly managing pointers is crucial to ensure the integrity of the list during operations such as finding nodes and deleting nodes.
- Overall, these problems reinforced my understanding of linked list operations and highlighted efficient techniques for common tasks.
---

## 📅 **Day 17 ** – Merge Two Sorted Lists , Palindrome Linked List *(4 Nov 2025)*
### 🎯 **Focus of the Day**
Strengthening linked list manipulation skills through merging and palindrome checking.

---
### ✅ **Tasks Completed**
#### 🔹 **Problem**: LeetCode 21 - `Merge Two Sorted Lists`
- **`Problem`**: Given two sorted linked lists, merge them into a single sorted linked list.
- **`Approach`**: Used a dummy node to simplify the merging process and iteratively compared nodes from both lists.
- **Complexity Analysis**:
  - **`Time`**: O(n + m) — Each node from both lists is processed once.
  - **`Space`**: O(1) — No extra space is used.
- **`Edge Cases Handled`**: One or both lists are empty.
---
#### 🔹 **Problem**: LeetCode 234 - `Palindrome Linked List`
- **`Problem`**: Given the head of a singly linked list, determine if it is a palindrome.
- **`Approach`**: Used the fast and slow pointer technique to find the middle of the list, reversed the second half, and compared both halves.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each node is processed once.
  - **`Space`**: O(1) — No extra space is used.
- **`Edge Cases Handled`**: Empty list, single node list.
---
### 💭 **Reflection**
- Today's problems, "Merge Two Sorted Lists" and "Palindrome Linked List," were excellent exercises in strengthening linked list manipulation skills through merging and palindrome checking.
- The use of a dummy node in "Merge Two Sorted Lists" simplified the merging process significantly. By maintaining a pointer to the current position in the merged list, we could easily append nodes from either list based on their values. This approach ensured that the merged list remained sorted without the need for additional data structures.
- In "Palindrome Linked List," the combination of the fast and slow pointer technique with list reversal provided an efficient way to check for palindromicity. By reversing the second half of the list, we could directly compare the two halves without needing extra space for storage.
- A key insight from both problems was the importance of careful pointer manipulation in linked lists. Properly managing pointers is crucial to ensure the integrity of the list during operations such as merging and checking for palindromes.
- Overall, these problems reinforced my understanding of linked list operations and highlighted efficient techniques for common tasks.
---

## 📅 **Day 18 ** – Linked List Cycle , Remove Nth Node From End of List *(5 Nov 2025)*
### 🎯 **Focus of the Day**
Mastering linked list cycle detection and node removal techniques.

---
### ✅ **Tasks Completed**
#### 🔹 **Problem**: LeetCode 141 - `Linked List Cycle`
- **`Problem`**: Given the head of a linked list, determine if it has a cycle in it.
- **`Approach`**: Used the Floyd's Tortoise and Hare algorithm with slow and fast pointers.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each node is processed once.
  - **`Space`**: O(1) — No extra space is used.
- **`Edge Cases Handled`**: Empty list, single node list.
---
#### 🔹 **Problem**: LeetCode 19 - `Remove Nth Node From End of List`
- **`Problem`**: Given the head of a linked list, remove the nth node from the end of the list and return its head.
- **`Approach`**: Used two pointers to find the nth node from the end in a single pass.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each node is processed once.
  - **`Space`**: O(1) — No extra space is used.
- **`Edge Cases Handled`**: Removing the head node, single node list.
---
### 💭 **Reflection**
- Today's problems, "Linked List Cycle" and "Remove Nth Node From End of List," were excellent exercises in mastering linked list cycle detection and node removal techniques.
- The Floyd's Tortoise and Hare algorithm used in "Linked List Cycle" provided an efficient way to detect cycles in a linked list. By using two pointers moving at different speeds, we could determine the presence of a cycle without needing extra space for tracking visited nodes.
- In "Remove Nth Node From End of List," the two-pointer technique allowed us to find and remove the nth node from the end in a single pass. By maintaining a gap between the two pointers, we could easily identify the target node for removal without needing to calculate the length of the list beforehand.
- A key insight from both problems was the importance of pointer manipulation in linked lists. Properly managing pointers is crucial to ensure the integrity of the list during operations such as cycle detection and node removal.
- Overall, these problems reinforced my understanding of linked list operations and highlighted efficient techniques for common tasks.
---

## 📅 **Day 19 ** – Linked List Cycle II , Add Two Numbers , Intersection of Two Linked Lists *(6 Nov 2025)*
### 🎯 **Focus of the Day**
Enhancing linked list manipulation skills through cycle detection, addition, and intersection problems.

---
### ✅ **Tasks Completed**
#### 🔹 **Problem**: LeetCode 142 - `Linked List Cycle II`
- **`Problem`**: Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
- **`Approach`**: Used Floyd's Tortoise and Hare algorithm to detect the cycle and find the starting node.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each node is processed once.
  - **`Space`**: O(1) — No extra space is used.
- **`Edge Cases Handled`**: Empty list, single node list.
---
#### 🔹 **Problem**: LeetCode 2 - `Add Two Numbers`
- **`Problem`**: Given two non-empty linked lists representing two non-negative integers, add the two numbers and return the sum as a linked list.
- **`Approach`**: Iterated through both lists, adding corresponding digits and managing carry-over.
- **Complexity Analysis:
  - **`Time`**: O(max(m, n)) — Each node from both lists is processed once.
  - **`Space`**: O(max(m, n)) — The output list requires space proportional to the larger input list.
- **`Edge Cases Handled`: Different lengths of lists, carry-over at the end.
---
#### 🔹 **Problem**: LeetCode 160 - `Intersection of Two Linked Lists`
- **`Problem`**: Given the heads of two singly linked lists, return the node at which the two lists intersect. If the two linked lists have no intersection, return null.
- **`Approach`**: Used two pointers to traverse both lists, switching heads when reaching the end.
- **Complexity Analysis**:
  - **`Time`**: O(m + n) — Each node from both lists is processed once.
  - **`Space`**: O(1) — No extra space is used.
- **`Edge Cases Handled`**: No intersection, one or both lists are empty.
---
### 💭 **Reflection**
- Today's problems, "Linked List Cycle II," "Add Two Numbers," and "Intersection of Two Linked Lists," were excellent exercises in enhancing linked list manipulation skills through cycle detection, addition, and intersection problems.
- The Floyd's Tortoise and Hare algorithm used in "Linked List Cycle II" provided an efficient way to detect cycles and find the starting node of the cycle. By using two pointers moving at different speeds, we could determine the presence of a cycle and locate its entry point without needing extra space for tracking visited nodes.
- In "Add Two Numbers," the iterative approach allowed us to add corresponding digits from both linked lists while managing carry-over effectively. This method ensured that we could handle lists of different lengths and produce the correct sum as a new linked list.
- "Intersection of Two Linked Lists" showcased a clever technique of using two pointers to traverse both lists. By switching heads when reaching the end, we could align the pointers to find the intersection point without needing extra space.
- A key insight from all three problems was the importance of pointer manipulation in linked lists. Properly managing pointers is crucial to ensure the integrity of the list during operations such as cycle detection, addition, and intersection finding.
- Overall, these problems reinforced my understanding of linked list operations and highlighted efficient techniques for common tasks.
---

## 📅 **Day 20 ** – Valid Parentheses *(7 Nov 2025)*
### 🎯 **Focus of the Day**
Strengthening stack operations through parentheses validation.

---
### ✅ **Tasks Completed**
#### 🔹 **Problem**: LeetCode 20 - `Valid Parentheses`
- **`Problem`**: Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
- **`Approach`**: Used a stack to track opening parentheses and matched them with closing ones.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each character is processed once.
  - **`Space`**: O(n) — The stack may store all opening parentheses in the worst case.
- **`Edge Cases Handled`**: Empty string, unmatched parentheses.
---
### 💭 **Reflection**
- Today's problem, "Valid Parentheses," was an excellent exercise in strengthening stack operations through parentheses validation.
- The stack data structure proved to be an ideal choice for this problem, as it allowed us to efficiently track opening parentheses and match them with their corresponding closing ones. By pushing opening parentheses onto the stack and popping them when a matching closing parenthesis is encountered, we could easily determine the validity of the input string.
- A key insight was recognizing that the order of parentheses matters, and using a stack naturally enforces this order. If at any point a closing parenthesis does not match the top of the stack, we can immediately conclude that the string is invalid.
- Handling edge cases, such as an empty string or unmatched parentheses, reinforced the importance of thorough testing and validation in algorithm design.
- Overall, this problem reinforced my understanding of stack operations and highlighted their effectiveness in solving problems involving matching and validation.
---
## 📅 **Day 21 ** – Evaluate Reverse Polish Notation *(8 Nov 2025)*
### 🎯 **Focus of the Day**
Mastering stack operations through expression evaluation.

---
### ✅ **Tasks Completed**
#### 🔹 **Problem**: LeetCode 150 - `Evaluate Reverse Polish Notation`
- **`Problem`**: Given an array of strings representing an expression in Reverse Polish Notation, evaluate the expression.
- **`Approach`**: Used a stack to evaluate the expression by pushing operands and applying operators.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each token is processed once.
  - **`Space`**: O(n) — The stack may store all operands in the worst case.
- **`Edge Cases Handled`**: Single operand, division by zero.
---
### 💭 **Reflection**
- Today's problem, "Evaluate Reverse Polish Notation," was an excellent exercise in mastering stack operations through expression evaluation.
- The stack data structure proved to be an ideal choice for this problem, as it allowed us to efficiently manage operands and apply operators in the correct order. By pushing operands onto the stack and popping them when an operator is encountered, we could easily evaluate the expression step by step.
- A key insight was recognizing that Reverse Polish Notation eliminates the need for parentheses and operator precedence, simplifying the evaluation process. The stack naturally handles the order of operations, ensuring that operands are combined correctly. 
- Handling edge cases, such as a single operand or division by zero, reinforced the importance of thorough testing and validation in algorithm design.
- Overall, this problem reinforced my understanding of stack operations and highlighted their effectiveness in solving problems involving expression evaluation.
---
## 📅 **Day 22 ** – Min Stack *(10 Nov 2025)*
### 🎯 **Focus of the Day**
Implementing a stack with constant time minimum retrieval.

---
### ✅ **Tasks Completed**
#### 🔹 **Problem**: LeetCode 155 - `Min Stack`
- **`Problem`**: Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
- **`Approach`**: Used two stacks: one for the main stack and another for tracking minimums.
- **Complexity Analysis**:
  - **`Time`**: O(1) for all operations — Each operation is performed in constant time.
  - **`Space`**: O(n) — The auxiliary stack may store all elements in the worst case.
- **`Edge Cases Handled`**: Popping from an empty stack, retrieving minimum from an empty stack.
---
### 💭 **Reflection**
- Today's problem, "Min Stack," was an excellent exercise in implementing a stack with constant time minimum retrieval.
- The use of two stacks allowed us to efficiently manage both the main stack and the minimum values. By pushing elements onto the main stack and updating the auxiliary stack with the current minimum, we could ensure that all operations, including retrieving the minimum element, were performed in constant time.
- A key insight was recognizing that maintaining a separate stack for minimum values simplifies the retrieval process. Whenever an element is pushed onto the main stack, we compare it with the current minimum and update the auxiliary stack accordingly. This approach ensures that we always have access to the minimum element without needing to traverse the main stack.
- Handling edge cases, such as popping from an empty stack or retrieving the minimum from an empty stack, reinforced the importance of robust error handling in data structure design.
- Overall, this problem reinforced my understanding of stack operations and highlighted effective techniques for enhancing stack functionality.
---

## 📅 **Day 23 ** – Evaluate Reverse Polish Notation *(8 Nov 2025)*
### 🎯 **Focus of the Day**
Mastering stack operations through expression evaluation.

---
### ✅ **Tasks Completed**
#### 🔹 **Problem**: LeetCode 150 - `Evaluate Reverse Polish Notation`
- **`Problem`**: Given an array of strings representing an expression in Reverse Polish Notation, evaluate the expression.
- **`Approach`**: Used a stack to evaluate the expression by pushing operands and applying operators.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each token is processed once.
  - **`Space`**: O(n) — The stack may store all operands in the worst case.
- **`Edge Cases Handled`**: Single operand, division by zero.
---
### 💭 **Reflection**
- Today's problem, "Evaluate Reverse Polish Notation," was an excellent exercise in mastering stack operations through expression evaluation.
- The stack data structure proved to be an ideal choice for this problem, as it allowed us to efficiently manage operands and apply operators in the correct order. By pushing operands onto the stack and popping them when an operator is encountered, we could easily evaluate the expression step by step.
- A key insight was recognizing that Reverse Polish Notation eliminates the need for parentheses and operator precedence, simplifying the evaluation process. The stack naturally handles the order of operations, ensuring that operands are combined correctly. 
- Handling edge cases, such as a single operand or division by zero, reinforced the importance of thorough testing and validation in algorithm design.
- Overall, this problem reinforced my understanding of stack operations and highlighted their effectiveness in solving problems involving expression evaluation.
---

## 📅 **Day 24 ** – Min Stack *(9 Nov 2025)*
### 🎯 **Focus of the Day**
Implementing a stack with constant time minimum retrieval.

---
### ✅ **Tasks Completed**
#### 🔹 **Problem**: LeetCode 155 - `Min Stack`
- **`Problem`**: Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
- **`Approach`**: Used two stacks: one for the main stack and another for tracking minimums.
- **Complexity Analysis**:
  - **`Time`**: O(1) for all operations — Each operation is performed in constant time.
  - **`Space`**: O(n) — The auxiliary stack may store all elements in the worst case.
- **`Edge Cases Handled`**: Popping from an empty stack, retrieving minimum from an empty stack.
---
### 💭 **Reflection**
- Today's problem, "Min Stack," was an excellent exercise in implementing a stack with constant time minimum retrieval.
- The use of two stacks allowed us to efficiently manage both the main stack and the minimum values. By pushing elements onto the main stack and updating the auxiliary stack with the current minimum, we could ensure that all operations, including retrieving the minimum element, were performed in constant time.
- A key insight was recognizing that maintaining a separate stack for minimum values simplifies the retrieval process. Whenever an element is pushed onto the main stack, we compare it with the current minimum and update the auxiliary stack accordingly. This approach ensures that we always have access to the minimum element without needing to traverse the main stack.
- Handling edge cases, such as popping from an empty stack or retrieving the minimum from an empty stack, reinforced the importance of robust error handling in data structure design.
- Overall, this problem reinforced my understanding of stack operations and highlighted effective techniques for enhancing stack functionality.
---

## 📅 **Day 25 ** – Implement Queue using Stacks , Implement Stack using Queues *(10 Nov 2025)*
### 🎯 **Focus of the Day**
Implementing fundamental data structures using alternative structures.

---
### ✅ **Tasks Completed**
#### 🔹 **Problem**: LeetCode 232 - `Implement Queue using Stacks`
- **`Problem`**: Implement a queue using two stacks.
- **`Approach`**: Used two stacks to simulate queue operations (enqueue and dequeue).
- **Complexity Analysis**:
  - **`Time`**: O(1) for enqueue, O(n) for dequeue in the worst case.
  - **`Space`**: O(n) — The stacks may store all elements.
- **`Edge Cases Handled`**: Dequeuing from an empty queue.
---
#### 🔹 **Problem**: LeetCode 225 - `Implement Stack using Queues`
- **`Problem`**: Implement a stack using two queues.
- **`Approach`**: Used two queues to simulate stack operations (push and pop).
- **Complexity Analysis**:
- **`Time`**: O(1) for push, O(n) for pop in the worst case.
  - **`Space`**: O(n) — The queues may store all elements.
- **`Edge Cases Handled`**: Popping from an empty stack.
---
### 💭 **Reflection**
- Today's problems, "Implement Queue using Stacks" and "Implement Stack using Queues," were excellent exercises in implementing fundamental data structures using alternative structures.
- In "Implement Queue using Stacks," the use of two stacks allowed us to simulate queue operations effectively. By pushing elements onto one stack and popping them from the other, we could maintain the FIFO order of a queue. This approach highlighted the versatility of stacks in implementing different data structures.
- In "Implement Stack using Queues," the use of two queues enabled us to simulate stack operations. By enqueuing elements into one queue and dequeuing them from the other, we could maintain the LIFO order of a stack. This method demonstrated the adaptability of queues in implementing various data structures.
- A key insight from both problems was the importance of understanding the fundamental properties of data structures and how they can be manipulated to achieve desired behaviors.
- Overall, these problems reinforced my understanding of data structure operations and highlighted effective techniques for implementing one data structure using another.
---

## 📅 **Day 26 ** – Number of Recent Calls , Daily Temperatures *(11 Nov 2025)*
### 🎯 **Focus of the Day**
Applying stack techniques to solve real-world problems.

---
### ✅ **Tasks Completed**
#### 🔹 **Problem**: LeetCode 933 - `Number of Recent Calls`
- **`Problem`**: Implement a class that counts the number of recent calls within a 3000 milliseconds window.
- **`Approach`**: Used a queue to store timestamps and remove outdated calls.
- **Complexity Analysis**:
  - **`Time`**: O(1) for each call — Each call is processed in constant time.
  - **`Space`**: O(n) — The queue may store all recent calls.
- **`Edge Cases Handled`**: No recent calls, multiple calls at the same timestamp.
---
#### 🔹 **Problem**: LeetCode 739 - `Daily Temperatures`
- **`Problem`**: Given a list of daily temperatures, return a list where each element indicates how many days you would have to wait until a warmer temperature.
- **`Approach`**: Used a stack to track indices of temperatures and calculate waiting days.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each temperature is processed once.
  - **`Space`**: O(n) — The stack may store all temperature indices.
- **`Edge Cases Handled`**: All temperatures are the same, decreasing temperature sequence.
---
### 💭 **Reflection**
- Today's problems, "Number of Recent Calls" and "Daily Temperatures," were excellent exercises in applying stack techniques to solve real-world problems.
- In "Number of Recent Calls," the use of a queue allowed us to efficiently manage timestamps and count recent calls within a specified time window. By removing outdated calls, we could maintain an accurate count of recent calls in constant time.
- In "Daily Temperatures," the stack data structure enabled us to track indices of temperatures and calculate the number of days until a warmer temperature. By pushing indices onto the stack and popping them when a warmer temperature was encountered, we could efficiently determine the waiting days for each temperature.
- A key insight from both problems was the importance of choosing the right data structure to manage dynamic data efficiently. Both the queue and stack proved to be effective in handling the specific requirements of each problem.
- Overall, these problems reinforced my understanding of stack and queue operations and highlighted their effectiveness in solving real-world problems.
---

## 📅 **Day 27 ** – Maximum Depth of Binary Tree , invert Binary Tree *(24 Nov 2025)*
### 🎯 **Focus of the Day**
Mastering binary tree traversal and manipulation techniques.

---
### ✅ **Tasks Completed**
#### 🔹 **Problem**: LeetCode 104 - `Maximum Depth of Binary Tree`
- **`Problem`**: Given the root of a binary tree, return its maximum depth.
- **`Approach`**: Used depth-first search (DFS) to traverse the tree and calculate the maximum depth.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each node is processed once.
  - **`Space`**: O(h) — The recursion stack may store up to h nodes, where h is the height of the tree.
- **`Edge Cases Handled`: Empty tree, single node tree.
---
#### 🔹 **Problem**: LeetCode 226 - `Invert Binary Tree`
- **`Problem`**: Given the root of a binary tree, invert the tree and return its root.
- **`Approach`**: Used depth-first search (DFS) to swap left and right children of each node.
- **Complexity Analysis**:
  - **`Time`**: O(n) — Each node is processed once.
  - **`Space`**: O(h) — The recursion stack may store up to h nodes, where h is the height of the tree.
- **`Edge Cases Handled`: Empty tree, single node tree.
---
### 💭 **Reflection**
- Today's problems, "Maximum Depth of Binary Tree" and "Invert Binary Tree," were excellent exercises in mastering binary tree traversal and manipulation techniques.
- The depth-first search (DFS) approach used in both problems provided an efficient way to traverse the binary tree and perform the required operations. In "Maximum Depth of Binary Tree," DFS allowed us to explore each path from the root to the leaves, calculating the depth along the way. This method ensured that we could determine the maximum depth in a single pass through the tree.
- In "Invert Binary Tree," DFS enabled us to swap the left and right children of each node recursively. This approach allowed us to invert the tree structure effectively while maintaining the integrity of the tree.
- A key insight from both problems was the versatility of DFS in handling various binary tree operations. Whether calculating depth or manipulating node relationships, DFS proved to be a powerful technique.
- Overall, these problems reinforced my understanding of binary tree operations and highlighted efficient techniques for traversal and manipulation.
---
**🔥 Keep the momentum going! 🔥**


