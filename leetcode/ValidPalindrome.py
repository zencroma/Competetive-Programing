import re
class Solution:
    # Check if a sentence is palindrome after removing non alphanumerical characters
    def isPalindrome(self, s: str) -> bool:
        isPal = False
        #get rid of non-alphanumerical characters
        only_string =  re.sub(r'[^A-Za-z0-9]','',s)
        #lower case any uppercase
        low_string  = only_string.lower()
        #reverse the string
        rev_string = low_string[::-1]
        # check if reverse string is the same as input string
        if low_string == rev_string:
            isPal = True
            return isPal
        return isPal