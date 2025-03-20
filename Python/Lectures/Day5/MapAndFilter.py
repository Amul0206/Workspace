l = [12, 1, 3, 3, 4, 5, 6, 78]


def multiply(a):
    return a*a

#WE CAN WRITE LAMBDA IN PLACE OF MULTIPLY


y = map(multiply, l)

x = list(map(multiply, l))

print(x)

for i in y:
    print(i)


m = [1, 2, 3]
n = [4, 5, 6]
o = [7 , 8, 9]

z = list(map(lambda p, q, r: p + q + r, m , n, o))
print(z)

l1 = [1, 2, 3, 4, 5]
l2 = [2, 3, 4, 6, 7]

print(list(filter(lambda a: a in l2,l1)))

s="hello cutie how are you"

print(list(map(lambda a: [a.upper(),a.lower(),len(a)],s.split())))