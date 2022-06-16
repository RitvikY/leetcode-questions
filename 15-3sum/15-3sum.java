class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      
        /* the goal of this solution is to use 3 pointers in order to 
         * compare and check each of the posssilble outputs. This method utilizes
         * the same concept as 2sum but with an additional pointer added 
         */
        
        
        Arrays.sort(nums);
        
        List<List<Integer>> list = new ArrayList<>();
        
        
        // checking each left most number against possible solutions
        for(int left = 0; left < nums.length; left++){
            // skip otherwise pointers will cross
            if(left > 0 && nums[left] == nums[left-1]){
                continue;
            }   
            int curr = left+1;
            int right =  nums.length-1;
            
            // checking each possible combination for the leftmost number
            while(curr < right){
                
                if(nums[left] + nums[curr] + nums[right] == 0){
                    
                    list.add(Arrays.asList(nums[left], nums[curr], nums[right]));
                    curr++;
                    
                    // resetting the index pointers
                    while(curr < right && nums[curr] == nums[curr-1]){
                        curr++;
                    }
                }
                
                // since original array is sorted, this means sum is too low, so move the middle pointer
                else if(nums[left] + nums[curr] + nums[right] < 0){
                    curr++;
                }
                
                // this means sum is too high, so we need to move the rightmost pointer to get a lower number
                else{
                    right--;
                }
            }
        }
        
        return list;
    }
}