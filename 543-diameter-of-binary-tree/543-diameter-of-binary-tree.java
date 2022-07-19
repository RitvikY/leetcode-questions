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
    
    /* the goal of this approach is to find the diameter at each node while also finding the height
     * We can then recursively calculate the Max diameter by comparing all possible diameters */
   
    
    int max = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        dfs(root);
        return max;
    }
    
    /* we can use a DFS implementation in order to find out the longest path for each node, i.e the diameter, while also
     * updating the height (max) as we go along */
    public int dfs(TreeNode root) {

        if(root == null) { // null tree
            return 0;
        } 
        int left =  dfs(root.left);
        int right = dfs(root.right);

         max = Math.max(max, left + right); // calculates diameter and accounts for null tree
         return 1+ Math.max(left, right);
    }
        
}