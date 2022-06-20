class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        
        
        int start = 0, len = s1.length() - 1, end  = len ;
        
    
        char s1arr[] = s1.toCharArray();
        Arrays.sort(s1arr);
        
        String sorteds1 = new String(s1arr);
        System.out.println(sorteds1);
        
        
        while (start < s2.length() - len) {
            
            String sub = s2.substring(start, end+1);
            //System.out.println(sub);

            char charsSub[] = sub.toCharArray();
            Arrays.sort(charsSub);
            String sortedSub = new String(charsSub);
            
            if (sortedSub.equals(sorteds1)) {
                return true;
            }
            
            end++;
            start++;  
        }
        
    
        
        
        
        
        
        
        return false;
        
        
        
        
        
        
    }
}