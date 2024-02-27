class Solution:
    # cek if open parentheses has its closing parentheses match in sequence
    # ex: [ has ], { has }, ( has )
    # make sure that if its matching it is in order
    # ([)] this is false because its not in order
    def isValid(self, s: str) -> bool:
        #O(n)
        #initialize stack for storing open parentheses
        stack = []
        #make a hashmap for matching open parentheses and their closing parentheses
        hash = { ')' : '(', ']': '[', '}': '{'}

        for char in s:
            # check parentheses exist in hashmap 
            if char in hash:
                # check if its empty and check if top of the stack is matching
                # with the key closing parentheses
                if stack and stack[-1] == hash[char]:
                    # pop the top of the stack
                    stack.pop()
                else:
                    return False
            else:
                # if its and open parentheses and arent being matched yet, push it to stack
                stack.append(char)
        # if stack is empty it means all open parentheses has matching closing parentheses
        return True if not stack else False