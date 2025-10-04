# 🚀 My 90-Day DSA Grind 🚀

<div align="center">

![Days](https://img.shields.io/badge/Days_Completed-3%2F90-blue?style=for-the-badge)
![Problems](https://img.shields.io/badge/Problems_Solved-4-success?style=for-the-badge)
![Streak](https://img.shields.io/badge/Current_Streak-3_Days-orange?style=for-the-badge)

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
- ---
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


**🔥 Keep the momentum going! 🔥**


