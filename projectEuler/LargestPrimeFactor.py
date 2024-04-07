def LargestPrimeFactor(factor: float) -> int:
    
    i = 2
    while i^2 <= factor:
        if factor % i: 
            i += 1
        else:
            factor //= i
    return factor
print(LargestPrimeFactor(600851475143))