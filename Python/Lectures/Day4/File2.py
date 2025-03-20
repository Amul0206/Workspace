from FUNCS import evenOdd
from FUNCS import factorial

l = []

for i in range(2, 101):
    if evenOdd(i):
        l.append(i)

print(l)

for i in range(1, 11):
    print(factorial(i))

x = [i for i in range(1,11)]
print(x)

y = [i for i in range(1, 11) if i % 2 == 0]
print(y)

l = [10, 12, 68, 3, 2, 7, 9, 11, 56, 43, 67]

z = [a for a in l if evenOdd(a)]
print(z)

names_list = ["Amit", "Ajay", "Ankita", "Mehul", "Minal", "Priya", "Harsh", "Vedarth", "Ajinkya"]

filtered_list = [name for name in names_list if name.lower().startswith("a") and name.lower().endswith("a")]
print(filtered_list)

print()

def countVowels(word):
    count_vowel = 0
    for letter in word:
        if letter == 'a' or letter == 'e' or letter == 'i' or letter == 'o' or letter == 'u':
            count_vowel+=1
    return count_vowel

names_list_1 = ["Amit", "Ajay", "Ankita", "Mehul", "Minal", "Priya", "Harsh", "Vedarth", "Ajinkya"]

Filtered_list = [word for word in names_list_1 if(countVowels(word.lower())>=2)]
print(Filtered_list)

print([i for i in names_list_1 if i.lower().count(j in ['a' , 'e' ,'i' , 'o','u'])>1])