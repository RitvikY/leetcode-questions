class Solution {
    public int findDuplicate(int[] nums) {
        
        /* since we have to only use constant extra space and cant modify nums
         * a possible solution is to assign each value in nums to a set 
         * and see if there are any duplicates. */
        
         Set<Integer> set = new HashSet<>();
         for(int i = 0; i < nums.length; i++) {
             if(set.contains(nums[i])) {
                 return nums[i];
             }
             set.add(nums[i]);
         }
        return 0;
    }
}