class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        /* The approach to this problem was to use a sliding window. I created a new array and inputted the counter of each symbol
         * given in the string. If the count ever became 2, I would move the starting position to that index and adjust the count
         * accordingly. By doing this, I create a sliding window that will return only the greatest length of the string with no
         * repeating characters */
        
        char str[] = s.toCharArray();
        
        int charArr[] = new int[256]; // this is to account for all letters, numbers, symbols, etc
        
        int finalLen = 0, start = 0, counter = 0;
        
        
        while (counter < str.length){
         
            charArr[str[counter]]++; // this will update the count of each letter in the string
            
            while(charArr[str[counter]] > 1) { // this while loop will adjust the start position to the position of the repeating index, while also updating the count of each letter is passes
                charArr[str[start]]--;
                start++;
            }
            
            finalLen = Math.max(finalLen, (counter - start + 1)); // this will compare the length of the calculated string with the previous largest length to find the max length
            counter++;
            
        }
        
        return finalLen;
        
        
        
    }
}