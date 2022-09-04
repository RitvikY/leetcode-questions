class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        lists = {}
        listt = {}
        
        for letter in s:
            lists[letter] = lists.get(letter,0) + 1
            
        for letter in t:
            listt[letter] = listt.get(letter, 0) + 1
        
        return listt == lists
        