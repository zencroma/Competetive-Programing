from typing import List


def EvenFibSum(boundary: int) -> int:
    current_val = 2
    prev_val = 1
    even_arr = []
    while(current_val <= boundary):
        if current_val % 2 == 0:
             even_arr.append(current_val)
        temp = current_val
        current_val += prev_val
        prev_val = temp
    return SumArray(even_arr)
def SumArray(arr: List) -> int:
    sum = 0
    for i in arr:
        sum += i
    return sum

print(EvenFibSum(4000000))