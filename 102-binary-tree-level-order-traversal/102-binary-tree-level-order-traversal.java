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
    
    /* we can use recursion for this problem in order to add each level to a list, starting from the leftmost side */
    
    
  public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        compute(ans,root,0);
        return ans;
    }
    
    
    /* this helper function will go down each level and add the nodes to a list from left to right */
    public void compute(List<List<Integer>> ans,TreeNode curr,int level)
    {
        if(curr==null) return;
        
        if(ans.size()==level) 
            ans.add(new ArrayList<Integer>()); // this means we are traversing a new level
        
        ans.get(level).add(curr.val);
        
        compute(ans,curr.left,level+1); // we will not first add the left side
        compute(ans,curr.right,level+1); // then we add the right side
    }
}