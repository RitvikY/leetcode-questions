class Solution {
    public int search(int[] nums, int target) {
        
        /* A Binary search would be the optimal apporach in order to make this solution
         * O(logn) time */
     
        
        int left = 0, right = nums.length - 1;        
        
        // standard binary search syntax
        while (left <= right) {
           
            
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            
            
            // this checks if the array is sorted on the left of middle
            if (nums[left] <= nums[middle]) {
                
                // checks that target is inside the array and adjusts accordingly
               if (target < nums[middle] && target >= nums[left]) 
                    right = middle - 1;
                 else
                    left = middle + 1;
            } else {
                // checks if target is on the right side of the array and adjusts accordingly
                 if (target > nums[middle] && target <= nums[right])  
                   left = middle + 1;
                 else
                    right = middle - 1;
            }
          }
            
        return -1;
        }
        
    }
