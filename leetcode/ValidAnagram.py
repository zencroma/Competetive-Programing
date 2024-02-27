class Solution:
    # Cek if string s and t are anagram
    def isAnagram(self, s: str, t: str) -> bool:
        #O(1)
        result = False 
        #use sorted to check if 2 sentences is anagram
        if sorted(s) == sorted(t):
            result = True
        
        return result
