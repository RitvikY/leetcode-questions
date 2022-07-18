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
    public int maxDepth(TreeNode root) {
        
        /* A DFS approach would be the best way to find the Max Depth of a Binary Tree */
        if (root == null) {
            return 0;
        }
       
        // We do Max of MaxDepth(left, right) because we want to check the side which has the most nodes connected
        return Math.max (maxDepth(root.left), maxDepth(root.right)) + 1;
        
    }
}