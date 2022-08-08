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
    
    /* We can solve this problem by performing a DFS and maintaining a max value checker
     * to see which nodes are good and which are not
     */
    
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }
    
    
    private int dfs(TreeNode root, int v) {
        if (root == null) return 0; // base case
        int max = Math.max(root.val, v); // maximum so far on the path.
        
        // checking to see if node is goor or not and updating the final count
        return (root.val >= v ? 1 : 0) + dfs(root.left, max) + dfs(root.right, max); // recurse to children.
    }
    
    
}