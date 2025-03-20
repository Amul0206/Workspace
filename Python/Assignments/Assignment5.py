def longwords(lst, n):
    new_list = []

    for word in lst:
        if len(word)>n:
            new_list.append(word)

    return new_list


list1 = ["abcd", "pqrs", "fjkd", "sdhfkjhjfhe", "hufhsesd"]
length = 4

print(longwords(list1, length))


print([i for i in list1 if len(i)>length])