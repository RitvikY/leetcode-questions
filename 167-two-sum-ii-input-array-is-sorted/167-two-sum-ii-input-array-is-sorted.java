class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        
        // I took the approach of using 2 pointers for this solution, starting from the leftmost and right most side and checking every combination of each number with the numbers to the right of it in the array
        
        
        
        // if array is only 2 numbers
         if (numbers.length == 2){
                return new int[] {1, 2};
        }
        
        
        
        int i = 0;        
        int curr = numbers[i];     
        int counter = numbers.length - 1;   
        int checking = numbers[counter];
        
        
            while(i <= counter) {
                
                // updating the numbers to the current index
                checking = numbers[counter];
                curr = numbers[i];
                
                // making sure target and sum are equal
                if(checking + curr == target){
                 int result[] = new int[] {++i, ++counter};
                 return result;
                }
                
                
                // choosing whether to update the left hand side or right hand side
                if (checking + curr < target){
                    i++;
                } else {
                    counter--;
                }
            }
        
       return new int[2];

    }
}