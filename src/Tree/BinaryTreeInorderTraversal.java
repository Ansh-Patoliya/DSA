package Tree;

/**
 * PROBLEM OVERVIEW:
 * Performs an inorder sweep of a binary tree, ensuring nodes are reported in left ➜ root ➜ right order.
 * INPUT / OUTPUT CONTRACT:
 * - Input: reference to the tree root (may be null).
 * - Output: list of node values following inorder sequencing.
 * CORE APPROACH:
 * - Traverse left subtree, record root, traverse right subtree; recursion or explicit stack both preserve ordering.
 * - Guarantees O(n) time for visiting each node once and O(h) auxiliary space (stack depth h = tree height).
 * EXAMPLE NARRATIVE:
 * - Tree rooted at 1 with left child 2 and right child 3 yields traversal [2, 1, 3]; balanced trees produce naturally sorted lists when the tree encodes a BST.
 * EDGE CONSIDERATIONS:
 * - Empty root returns an empty list.
 * - Degenerate chains behave like linked lists, so recursion depth equals node count if unguarded.
 * - Duplicates remain in-place; no deduplication occurs.
 */
public class BinaryTreeInorderTraversal {
}
