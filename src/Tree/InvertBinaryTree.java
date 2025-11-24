package Tree;

/**
 * PROBLEM OVERVIEW:
 * Mirrors a binary tree in-place by swapping every node’s left and right children recursively.
 * INPUT / OUTPUT CONTRACT:
 * - Input: root reference (can be null).
 * - Output: same root reference after subtree pointers have been inverted.
 * STRATEGY HIGHLIGHTS:
 * - Visit each node, exchange child pointers, recurse into children; DFS or BFS both achieve O(n) time and O(h) space.
 * EXAMPLE WALKTHROUGH:
 * - Node 4 with children 2 (left) and 7 (right) transforms into a tree where 7 becomes left child and 2 becomes right child, and so on down the structure.
 * EDGE CONSIDERATIONS:
 * - Null root remains null without side effects.
 * - Single-node trees stay unchanged but still satisfy contract.
 * - Skewed trees become skewed in the opposite direction; ensure recursion depth is safe for tall inputs.
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {

        if(root==null)
            return null;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
