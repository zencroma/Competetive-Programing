from typing import List


class Solution:
    # Find 2 value's sum that matches target
    # O(n^2)
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # using binary search
        for i in range(len(nums)) :
            for j in range(i+1, len(nums)):
                # if num[i] + num[j] == target return the 2 values
                if(i != j and (nums[i]+nums[j])==target):
                    return [i,j]
        return []