# 🚀 My 90-Day DSA Grind 🚀

<div align="center">

![Days](https://img.shields.io/badge/Days_Completed-2%2F90-blue?style=for-the-badge)
![Problems](https://img.shields.io/badge/Problems_Solved-2-success?style=for-the-badge)
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


**🔥 Keep the momentum going! 🔥**

*Next Target: Day 3 🎯*

