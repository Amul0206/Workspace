from sympy import *


def is_Prime(num):
    if num<2:
        return false

    for i in range(2, int(num**0.5)+1):
        
        if (num%i==0):
            return false

    return true

list_even = []
list_odd = []
list_prime = []

for i in range(1, 101):
    if (i%2 == 0):
        list_even.append(i)
    else:
        list_odd.append(i)
        
    if is_Prime(i):
        list_prime.append(i)

tup1 = tuple(list_even)
tup2 = tuple(list_odd)
tup3 = tuple(list_prime)

print("Even numbers:-", tup1)
print("Odd numbers:-", tup2)
print("Prime Numbers:- ", tup3)