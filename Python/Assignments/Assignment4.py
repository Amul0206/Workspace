def Translate(sentence):
    ans=''
    for i in sentence:
        if(i.lower() not in ['a','e','i','o','u',' ']):
            ans+=i+'o'+i
        else:
            ans+=i
    return ans

str="this is fun"
print(Translate(str))

print("".join([i+'o'+i  if i not in ['a','e','i','o','u',' '] else i for i in str]))