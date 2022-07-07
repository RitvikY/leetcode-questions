class Solution {
    public int findMin(int[] nums) {
        
        /* We can use a modified version of binary search for this solution to find the 
         * index at which the array became rotated */
      
        int len = nums.length;
        int left = 0, right = len - 1;
        
        if (nums[left] < nums[right]) return nums[left]; // array is sorted
        
        
        // finding the point of rotation
        while (right - left > 1) {
            int middle = left + (right - left) / 2;
            if (nums[left] > nums[middle]) { // this means that the rotation point is on the left side of the array 
                right = middle;
            } else { // this means the rotation point is on the right side of the array
                left = middle;
            }
        }
         // in the case of shifts, the left element will always be greater than the right element. Since we have found the midpoint, we know that the min element is the value assigned to the index 'right'        
        return nums[right]; 
    
    }
}