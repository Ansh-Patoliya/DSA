# 🚀 My 90-Day DSA Grind 🚀

<div align="center">

![Days](https://img.shields.io/badge/Days_Completed-11%2F90-blue?style=for-the-badge)
![Problems](https://img.shields.io/badge/Problems_Solved-21-success?style=for-the-badge)
![Streak](https://img.shields.io/badge/Current_Streak-2_Days-orange?style=for-the-badge)

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

## 📅 **Day 10** – Valid Anagram , Ransom Note , Intersection of Two Arrays *(24 Oct 2025)*

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

## 📅 **Day 11** – Two Sum II - Input Array Is Sorted , Square of a Sorted Array *(25 Oct 2025)*
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
**🔥 Keep the momentum going! 🔥**


