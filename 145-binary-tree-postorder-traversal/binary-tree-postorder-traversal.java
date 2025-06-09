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
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        List<Integer> a=new ArrayList<Integer>();
        postorder(root,a);
        return a;
    }
    private void postorder(TreeNode root,List<Integer> a)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left,a);
         postorder(root.right,a);
         a.add(root.val);

    }
}