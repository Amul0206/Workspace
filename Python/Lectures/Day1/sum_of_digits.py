def sum_func(x):
    sum=0
    while(x!=0):
        sum+=x%10
    return sum

x=int(input())
print(sum_func(x))