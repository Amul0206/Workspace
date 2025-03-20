def factorial(num):

    if num == 0 or num == 1:
        return 1

    return factorial(num-1)*num

def add(a=0, b=0):
    return a+b

def sub(a=0, b=0):
    return a-b

def evenOdd(num):
    if num%2 == 0:
        return True
    else:
        return False

