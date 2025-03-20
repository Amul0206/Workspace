def greaterThanK(lst, num):

    new_list = []
    for i in lst:
        if i > num :
            new_list.append(i)

    return new_list

l = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

n = 3

print([i for i in l if i > n])

print(greaterThanK(l , n))
