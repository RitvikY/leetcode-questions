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
  public boolean isSubtree(TreeNode root, TreeNode subRoot) {

    if(root==null) return false;
    if(subRoot==null) return true;
      
    // checking if the left and right of both trees are the same
    return helper(root,subRoot) || isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
}

boolean helper(TreeNode r,TreeNode s){

    if(r==null && s==null) return true;
    if(r==null || s==null) return false;
    
    // return the lsft and right side subtrees are the same as well as the head values
    return (r.val==s.val) && helper(r.left,s.left) && helper(r.right,s.right);
}   
    
}