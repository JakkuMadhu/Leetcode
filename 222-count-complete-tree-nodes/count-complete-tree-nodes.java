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
    // public int plr(TreeNode root,int count)
    // {
    //     if(root==null)
    //     {
    //         return count;
    //     }
    //     count++;
    //     count=plr(root.left,count);
    //     count=plr(root.right,count);
    //     return count;
    // }
    public int lrp(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        return 1+lrp(root.left)+lrp(root.right);
    }
    public int countNodes(TreeNode root) {
        // return plr(root,0);
        return lrp(root);
    }
    }
