class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        
        /*
        
        
        the optimal strategy for this solution is to find the products to the left of every number
        and the right of every number. Once we do this we can then multiply the 2 arrays in order
        to get the final product excluding that number
        
        */
        
        
        
        
        
       int len = nums.length;
        
        int left[] = new int[len];
        int right[] = new int[len];
        
        
        int finalArr[] = new int[len];
        
        left[0] = 1; // this is to account for there being no value on the leftmost element
        right[len-1] = 1; // this is to acccount for there being no value to the rightmost element
        
        
        
      
        
        // calculate the product from right to left
        for(int i = len-2; i >= 0; i--){
            right[i] = nums[i+1] * right[i+1]; // multiple the number before with the next number
        }
        
          //calculate product from left to right
        for(int j = 1; j < len; j++) {
            left[j] = nums[j -1] * left[j-1]; // multiply the number before with the next paramater value
        }
        
        
        //final answer is multiplying left and right side
        for(int k = 0; k < len; k++){
            finalArr[k] = left[k] * right[k]; 
        }
        
        
        return finalArr;
        
    }
}