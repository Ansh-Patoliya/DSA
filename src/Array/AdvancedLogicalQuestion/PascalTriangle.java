package Array.AdvancedLogicalQuestion;

/*
 Problem: Pascal's Triangle (LeetCode #118)

 Goal
 - Given an integer numRows, generate the first numRows of Pascal's triangle.
 - Each number is the sum of the two directly above it; first and last entries of each row are 1.

 Contract
 - Input: int numRows (numRows ≥ 0).
 - Output: List<List<Integer>> representing rows 1..numRows; empty list if numRows == 0.
 - Time: O(numRows^2), Space: O(numRows^2) for the triangle.

 Examples
 - Example 1: numRows = 5 →
   [
     [1],
     [1,1],
     [1,2,1],
     [1,3,3,1],
     [1,4,6,4,1]
   ]
 - Example 2: numRows = 1 → [[1]]
 - Example 3: numRows = 0 → []

 Approaches
 - Iterative Build (Recommended)
   Idea: Start with row [1]. For each next row i (1-indexed), create a list of size i: first and last entries are 1; inner entries j (1..i-2) are prev[j-1] + prev[j]. Append each row to result.
   Time/Space: O(n^2) where n = numRows.

 - Combinatorial (n choose k)
   Idea: Row r has entries C(r, k) for k=0..r. Compute iteratively using C(r,k) = C(r,k-1) * (r-k+1)/k with long to avoid intermediate overflow. Useful if not building all rows.

 Edge Cases
 - numRows = 0 → empty result.
 - Large numRows may cause integer overflow for binomial coefficients; use long/BigInteger if constraints allow very large rows.

 Pitfalls
 - Don’t mutate previous row while computing the next; build a new list each iteration.
 - Be careful with indices when summing adjacent elements.
*/

import java.util.List;

//(LeetCode #118)
public class PascalTriangle {

    List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new java.util.ArrayList<>();

        if (numRows == 0) return triangle;

        // First row is always [1]
        triangle.add(new java.util.ArrayList<>());
        triangle.get(0).add(1);

        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new java.util.ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);

            // First element is always 1
            row.add(1);

            // Each triangle element (except the first and last) is equal to the sum of the two elements above it
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // Last element is always 1
            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = new PascalTriangle().generate(numRows);
        for (List<Integer> row : result) {
            System.out.println(row);
        }


    }
}
