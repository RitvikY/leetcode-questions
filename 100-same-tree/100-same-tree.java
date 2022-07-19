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
    
    boolean same = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        // we just need to check if the right and left side of both p and q are the same
        
        if (p == null && q == null) return true; // both are empty
        if (q == null || p == null) return false; // only one is empty
        if (p.val != q.val) return false; // checking the values
        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
  }
        
    }
    
 