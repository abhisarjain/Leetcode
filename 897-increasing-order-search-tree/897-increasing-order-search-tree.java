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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> r = new ArrayList<Integer>();
        if(root==null){return null;}
        in(r,root);
        
        TreeNode head = new TreeNode(0);
        TreeNode temp = head;
        int i=0;
        // System.out.print(r);
        while(i<r.size())
        {
            
            TreeNode t = new TreeNode(r.get(i));
            temp.right = t;
            temp = temp.right;
            i++;
        }
        
        return head.right;
    }
    
   public void in(List<Integer> r,TreeNode root)
    {
     if(root==null){return;}
        in(r,root.left);
        r.add(root.val);
        in(r,root.right);
        
    }
    
    
}