class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        /* the goal of this approach is to create 2 sliding frequency arrays, 
         * if at anytime the frequency of both arrays is the same, then a substring
         * has been discovered and will return true */
        
       int s1arr = s1.length();
     int s2arr = s2.length();
	
  
    if(s2arr < s1arr) return false;
		
	
    // creating out 2 frequency arrays to include all letters
    int[] freq1 = new int[26];
    int[] freq2 = new int[26];
    
        // this loop is adding the frequencies of each letter in the s1 string;
    for(int i = 0; i < s1arr; i++){
        freq1[s1.charAt(i) - 'a']++; // the reason we do '-a' is to make sure we shift the ascii/unicode value so that A - Z have values 0 - 25
        freq2[s2.charAt(i) - 'a']++;
    }
    
    for(int i = s1arr; i < s2arr; i++){ // now we shift our window to see if any group of frequencies match
        if(Arrays.equals(freq1,freq2)){
        return true;
        }
        
        //adjusting the window
        freq2[s2.charAt(i - s1arr) - 'a']--;
        freq2[s2.charAt(i) - 'a']++;
    }

    
    if(Arrays.equals(freq1,freq2)) return true;
		
    return false;
        
        
    }
}