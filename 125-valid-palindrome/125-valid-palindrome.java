class Solution {
    public boolean isPalindrome(String s) {
        
        if (s.isEmpty() == true){
            return true;
        } 
        
        String news = s.toLowerCase();
        StringBuffer result = new StringBuffer ("");        
        
        for(int i = 0; i < news.length(); i++){
            
            char c = news.charAt(i);
            
            if (Character.isLetter(c) || Character.isDigit(c)){
                
                result.append(c);
            }
        }
        
        
       
        
        StringBuffer r = new StringBuffer (result);
        
        

        Boolean boo = result.toString().equals(r.reverse().toString());
        
        System.out.println(boo);
        
        System.out.println(result);
        System.out.println(result.reverse());
        
        
        
         if (result.toString().equals(r.reverse().toString())){
             return true;
         }     
        return false;    
    }
}