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
    public boolean isSymmetric(TreeNode root) {
        if(match(root.left,root.right))
        {
            return true;
        }
        return false;
    }
    
    public boolean match(TreeNode root1,TreeNode root2)
    {
        if(root1!=null && root2!=null)
        {
            boolean a = match(root1.left,root2.right);
            boolean b = match(root1.right,root2.left);
            
            if(root1.val==root2.val && a && b )
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        
        if(root1==null && root2==null)
        {
            return true;
        }
        else{
            return false;
        }
    }
}