class Solution {
    public boolean isAnagram(String s, String t) {
    
      char string1[] = s.toCharArray();
      char string2[] = t.toCharArray();
        
        
        
      Arrays.sort(string1);
      Arrays.sort(string2);
        
        String comp1 = new String(string1);
        String comp2 = new String(string2);
       return comp1.equals(comp2);

    
    }
}