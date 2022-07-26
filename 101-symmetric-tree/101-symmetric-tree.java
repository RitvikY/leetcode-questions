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
        
        if (root == null) return true;
        return helper(root.left, root.right);
    }
    
    /* helper function will check to make sure each leaf is symmetric */
    private boolean helper (TreeNode first, TreeNode second) {
        if (first == null && second == null) return true;
        if (first == null || second == null) return false;
        if (first.val != second.val) return false;
        
        /* We check each trees left node with the opposite trees right node because in order to be 
         * symmetric for a tree, it needs to be able to fold onto itself like in the picture*/
        return helper(first.left, second.right) &&  helper (first.right, second.left);
    }
}