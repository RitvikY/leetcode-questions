class Solution {
    public int search(int[] nums, int target) {
        
        /* simple binary search algo to find position of taget */
        
        int curr = nums.length-1, left = 0, pivot;
                
        while (left <= curr){
            pivot = left + (curr - left) / 2;
            if(nums[pivot] == target){
                return pivot;
            }
            
            if(target < nums[pivot]){
                curr = pivot - 1;
            } else {
                left = pivot + 1;
            }
            
        }
        
        return -1;
        
    }
}