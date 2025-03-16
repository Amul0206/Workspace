# functions:: are the code which you can use again and again. (Reuseability and Portabilty).
from docutils.utils.math.latex2mathml import munder


# to make use of functions write def and end it with colon

def factorials(n):
    fact = 1
    res = 1
    while fact <= n:
        res *= fact
        fact += 1
    return res



#print(factorials(4))

#even odd num
def isEvenOdd(n):
    if n % 2 == 0:
        print("Is Even")
    else:
        print("Is Odd")


#isEvenOdd(7)
#prime num



#NAMED PARAMETERS
def add( a= 0, b =0):
    print('Value of a:',a)
    print('Value of b:' , b)
    return  a + b

#add(b=10, a=10) # can be used to send values as argument to a particular parameters without stressing about the order


# send multiple argument '*' this is similar to '...' eleptical operator in java
def sumatinator(*args):
    return sum(args)

print(sumatinator(30,34,3123,42))


