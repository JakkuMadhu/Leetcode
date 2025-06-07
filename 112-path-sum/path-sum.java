/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
           if (root == null) return false;

        // Subtract current node's value from targetSum
        targetSum = targetSum-root.val;

        // Check if it's a leaf node
        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }

        // If targetSum becomes zero before reaching a leaf, do not return true
        // Continue searching the children
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}
