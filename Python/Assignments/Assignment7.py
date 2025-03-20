def square(num):
    return num*num


l = list(range(1, 11))

l_square = []

for i in l:
    l_square.append(square(i))

print(l_square)
