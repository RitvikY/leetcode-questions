class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
       
        // making a hashmap to easily add values to keys with the same letters
        Map<String, List<String>> groupAnagrams = new HashMap<>();
        
        
        for(String s: strs){
            
            char c[] = s.toCharArray();
            
            // sorting allows us to add every anagram to one key
            Arrays.sort(c);
            
            String newC = new String(c);
            
            if (!groupAnagrams.containsKey(newC)) {
                
                // this will create a key for every new anagram
                groupAnagrams.put(newC, new ArrayList<>());
            }
            // adds the orginal word to that key
            groupAnagrams.get(newC).add(s);
            
        }
        
      
        
        return new ArrayList<>(groupAnagrams.values());
        
        
    }
}