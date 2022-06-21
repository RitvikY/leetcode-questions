class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        /* The way I approached this solution was to use a stack in order to calculate the number of days
         * in order to get a higher temperature. If you start from the end of the array, you can pop off days if 
         * they are lower temperatures and find the difference. */
        
        
        
        Stack <Integer> stack  = new Stack<>();
        int days[] = new int[temperatures.length];
        
        // starting from the end of the array
        for(int i = temperatures.length - 1; i >= 0; i--) {

            // this loop will keep popping off elements in the stack until it reaches an temperature thats greater than the index
            while ((!stack.isEmpty()) && temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }
            
            if(stack.isEmpty()){ // sets the last element to 0;
                days[i] = 0;
            } else {
                days[i] = stack.peek() - i;
            }

            stack.push(i);
            
        }
        
        
        return days;
        
    }
}