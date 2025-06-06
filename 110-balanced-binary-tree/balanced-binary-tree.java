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
   boolean res=true;
    int LRP(TreeNode tptr)
    {
        if(tptr==null)	return 0;
	  int left_depth=LRP(tptr.left);
	  int right_depth=LRP(tptr.right);
        if(Math.abs(left_depth-right_depth)>1)
                res=false;

        return 1+Math.max(left_depth,right_depth);
    }
    public boolean isBalanced(TreeNode root)
     {
        LRP(root);
        return res;
    }
    }
