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
    
    /* the approach for this problem would be to run BFS from the bottom of the left and right subtress */
    
    
    boolean result = true;
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return result;
    }
    
    // standard dfs traversal
    private int dfs(TreeNode root) {
        if(!result) return 0; // checking to make sure result is not false
        if (root == null) return 0;
        
        //updating height on left and right subtrees
        int left = dfs(root.left);
        int right = dfs(root.right);
        
        //checking that height does not differ by more then 1
        if(Math.abs(left -right) > 1) { 
            result = false;
            return 0;
        }
        
        return 1 + Math.max(left, right);
        
        
    }
    
    
}