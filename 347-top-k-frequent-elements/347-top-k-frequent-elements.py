class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        dic = {}
        
        for val in nums:
            if val in dic:
                dic[val] += 1
            else:
                dic[val] = 1
                
                
        num = []
        s = sorted(dic.items(), key=lambda x: x[1], reverse=True) # this will order the list by greatest to least value

        for i in range(k):
            k = s[i][0]
            num.append(k)
        return num
            