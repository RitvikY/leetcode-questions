class Solution {
    public int longestConsecutive(int[] nums) {
        
        if (nums.length == 0){
            return 0;
        } 
        
        
        Arrays.sort(nums);
        
        int arr[] = nums;
        
        int counter = 0, total = 0;
        
        for(int i= 0; i < arr.length; i++){
            
            if(i + 1 < arr.length) {
                
                
                
                if(arr[i] +1 == arr[i+1]){
                    counter++;
                } else if (arr[i] == arr[i+1]) {
                    // do nothing to preserve order
                } else {
                    counter = 0;
                }
                
                if (counter > total){
                    total = counter;
                }
                
                
            }
            
        }
        
         return ++total;
    }
}