class Solution {
    public boolean isPalindrome(String s) {
        
        
        // is a palindrome if an empty string
        if (s.isEmpty() == true){
            return true;
        } 
        
        String news = s.toLowerCase();
        StringBuffer result = new StringBuffer ("");  // We use a string buffer since we want to appened letters as we check them      
        
        for(int i = 0; i < news.length(); i++){
            
            char c = news.charAt(i);
            
            if (Character.isLetter(c) || Character.isDigit(c)){ // checks to make sure the current character is an Alphanumeric character
                
                result.append(c);
            }
        }
          
        StringBuffer r = new StringBuffer (result); // since string buffers are mutable, we need to create a seperate stringBuffer when performing our comparison
        
        
        // we need to convert the stringBuffer back into a string before performing our comparison using the toString() method
        if (result.toString().equals(r.reverse().toString())){ 
             return true;
         }     
        return false;    
    }
}