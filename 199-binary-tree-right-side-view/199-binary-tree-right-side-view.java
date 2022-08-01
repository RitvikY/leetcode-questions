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
    // we can perform a bfs and check each level as we go down the tree 
     public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        helper(root, list, 0);
        return list;
    }
    
    private void helper(TreeNode node, List<Integer> list, int depth) {
        if (node != null) {
            if (depth == list.size()) // this means we are done checking the level
                list.add(node.val);
            
            helper(node.right, list, depth + 1);
            helper(node.left, list, depth + 1);
        }
    }
}