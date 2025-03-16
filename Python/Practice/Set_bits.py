# Enter your code here. Read input from STDIN. Print output to STDOUT
N = int(input())

set_bits = 0

for i in range(1, N+1):

    n = i
    #Decimal to Binary Conversion
    res = ''  # binary result
    while n > 0:
        res = str(n % 2) + res
        n //= 2
    #print(res)
    for digit in res:
      if (digit == 1):
        set_bits += 1

print(set_bits)