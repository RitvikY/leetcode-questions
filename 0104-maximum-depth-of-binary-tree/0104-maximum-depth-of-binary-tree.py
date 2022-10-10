# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        
        if root is None:
            return 0
        
        leftmost = self.maxDepth(root.left)
        rightmost = self.maxDepth(root.right)
        
        if rightmost > leftmost:
            return rightmost + 1
        else:
            return leftmost + 1
        