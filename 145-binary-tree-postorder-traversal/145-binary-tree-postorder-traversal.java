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
    public List<Integer> postorderTraversal(TreeNode root) {
       List<Integer> r = new ArrayList<Integer>();
        if(root==null){return r;}
        post(r,root);
        return r;
   
    }
         public void post(List<Integer> r,TreeNode root)
    {
     if(root==null){return;}
        post(r,root.left);
        post(r,root.right);
        r.add(root.val);
        
    }
}