class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        dic = {}
        for string in strs:
            base = "".join(sorted(string)) # sorts the string 
            if base in dic:
                dic[base] += [string] # adds the string if it already exsists
            else:
                dic[base] = [string] # creates a new dict key
        return dic.values()
        
        
        
        
        
        
        
           
            