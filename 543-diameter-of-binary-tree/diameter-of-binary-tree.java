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
 class Solution
 {
int max_dia=0;
   int LRP(TreeNode tptr)
    {
        if(tptr==null)	return 0;
	 int left_depth=LRP(tptr.left);
	int right_depth=LRP(tptr.right);
       int curr_dia=1+left_depth+right_depth;
	if(curr_dia>max_dia) max_dia=curr_dia;
        return 1+Math.max(left_depth,right_depth);
    }
    public int diameterOfBinaryTree(TreeNode root) {
       LRP(root);
       return max_dia-1; 
    }
 }

