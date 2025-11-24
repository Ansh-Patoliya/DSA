package Tree;

/**
 * PROBLEM OVERVIEW:
 * Calculates the maximum distance from the root down to any leaf, i.e., the tree height measured in node count.
 * INPUT / OUTPUT CONTRACT:
 * - Input: root node reference (nullable).
 * - Output: integer depth where an empty tree returns 0 and a single node returns 1.
 * ALGORITHM INSIGHT:
 * - Depth-first recursion or iterative BFS; recursively compute max depth of children and add one for current node.
 * - Runs in O(n) time with O(h) recursion stack usage.
 * EXAMPLE SNAPSHOT:
 * - Tree shaped like [3,9,20,null,null,15,7] has deepest path length 3 (3 ➜ 20 ➜ 15 or 3 ➜ 20 ➜ 7).
 * EDGE CONSIDERATIONS:
 * - Null root must map to zero without error.
 * - Degenerate linked-list-like trees push recursion depth to n; tail-call avoidance or iteration may be needed for safety.
 * - Balanced vs. unbalanced structures both conform to the same recurrence.
 */
// LeetCode Problem 104
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return Math.max(left,right);
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

