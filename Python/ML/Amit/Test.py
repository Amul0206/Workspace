# Enter your code here. Read input from STDIN. Print output to STDOUT

s = input()

char1 = s[0]
char2 = s[1]

if (ord(char1)%2 == 1 and int(char2)%2 == 1):
  print('black')


elif (ord(char1)%2 == 0 and int(char2)%2 == 0):
  print('black')


elif (ord(char1)%2 == 1 and int(char2)%2 == 0):
  print('white')


elif (ord(char1)%2 == 0 and int(char2)%2 == 1):
  print('white')