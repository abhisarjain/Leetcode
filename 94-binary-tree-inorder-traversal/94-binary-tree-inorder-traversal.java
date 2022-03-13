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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> r = new ArrayList<Integer>();
        if(root==null){return r;}
        in(r,root);
        
        return r;
    }
    
    public void in(List<Integer> r,TreeNode root)
    {
     if(root==null){return;}
        in(r,root.left);
        r.add(root.val);
        in(r,root.right);
        
    }
}