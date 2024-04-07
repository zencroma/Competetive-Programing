from typing import List


def multipleof3or5(boundary: int) -> int:
    arr = []
    for i in range(0,boundary):
        if i % 3 == 0 or i % 5 == 0:
            arr.append(i)
    return sum_array(arr)
def sum_array(arr: List) -> int:
    sum = 0
    for i in arr:
        sum += i
    return sum

print(multipleof3or5(1000))