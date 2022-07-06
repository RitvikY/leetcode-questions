class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    /* We can use a binary search for this approach in order to find the min time for Koko to eat bannas.
     * If we find the Max and Min speeds, we can perform a binary search until we get the lowest possible speed */
    int minspeed = 1, maxspeed =  1;
    
    // finding the max bananas consumed 
    for (int b : piles) {
        maxspeed = Math.max(maxspeed, b);
    }
    
        
        // performing the binary search
    while (minspeed < maxspeed) {
        int middle = minspeed + (maxspeed-minspeed) / 2;
        int time = 0;
        
        // this will calculate the time it takes per pile 
        for (int b : piles) {
            time += (b + middle - 1) / middle;
        }
        
        //checking if middle is the correct speed and adjusting
        if (time <= h) {
            maxspeed = middle;
        } else {
            minspeed = middle+1;
        }
         
      
        
        }
    
          return maxspeed;
        
        
        
    }
}