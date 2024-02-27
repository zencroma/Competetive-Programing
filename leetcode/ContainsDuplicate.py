from typing import List


class Solution:
    # Cek if integer has duplicates in sequence
    def containsDuplicate(self, nums: List[int]) -> bool:
        #O(1)
        # get panjang sequence
        len_num = len(nums)
        #use hashmap set so the list isnt able to be duplicated
        set_num = set(nums)
        #get panjang set 
        len_set = len(set_num)
        
        result = False
        # jika panjang set sama dengan input return true
        if len_set < len_num:
            result = True
        return result
    
        