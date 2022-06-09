class Solution {
    public int longestConsecutive(int[] nums) {
        
        if (nums.length == 0){
            return 0;
        } 
        
        
        Arrays.sort(nums);
        
        int arr[] = nums;
        
        //counter will check the # of consecutives from the pointer while total will be the final highest number
        int counter = 0, total = 0;
        
        for(int i= 0; i < arr.length; i++){
            
            
            if(i + 1 < arr.length) { // this is to prevent Out of bounds error
                
                if(arr[i] +1 == arr[i+1]){
                    counter++;
                } else if (arr[i] == arr[i+1]) {
                    // do nothing to preserve order if next number is the same
                } else {
                    counter = 0;
                }
                
                
                // update the highest order
                if (counter > total){
                    total = counter;
                }
                
                
            }
            
        }
        
         return ++total;
    }
}