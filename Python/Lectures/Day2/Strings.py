str = input("Enter a string:- ")

len1 = 0

for i in str:
    if i == ' ':
        pass
    else:
        len1+=1

print(len1)

str2 = '76535674'
print(len(str2))

for i in range(len(str2)-1, -1, -1):
    print(str2[i])