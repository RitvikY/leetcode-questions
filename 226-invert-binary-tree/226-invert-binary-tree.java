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
    public TreeNode invertTree(TreeNode root) {
        
        // we can do a recursive call on the left and right side of the tree to invert easily
        
        if (root == null) return null;
        
        TreeNode temp = new TreeNode();
        
        invertTree(root.left);
        invertTree(root.right);
        
        //doing the actual inverting
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        
        return root;
        
    }
}