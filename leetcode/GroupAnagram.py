from typing import List


class Solution:
    # groups existing anagram in a sequence
    # return a senteces of itself if there is not anagram found
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # use hashmap to find the anagram
        group = {}
        for text in strs:
            # sort the text, and use it in a key of a dict
            key = tuple(sorted(text))
            #check if the key doesnt have any anagram return itself
            if key not in group:
                group[key] = []
            # if text is an anagram and not in the group, group it based on the key
            if text not in group:
                group[key].append(text)
        #return all groups of anagram
        return list(group.values())