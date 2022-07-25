/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


class Solution {
    
    /* A binary search tree is the same as a binary tree, so we can just check to see if the values are on the left
     * or right half of the original tree and work our way down */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        
        if(root==null) return null;
        
        if(p.val<root.val&&q.val<root.val) {
            return lowestCommonAncestor(root.left,p,q);
        }
        
        else if(p.val>root.val&&q.val>root.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        else
        return root;
        
    }
}