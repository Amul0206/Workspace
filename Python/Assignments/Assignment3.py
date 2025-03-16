#CRYPTOGRAPHY
#Caesar Cipher using Dictionary

dict1 = {chr(x):chr(x+13) if x<110 else chr(x-13) for x in range(97, 123)}

#print(dict1)


# Problem Statement::
# Create a function which can take any input CamelCase or snake_case and will return vice versa

def typenameconvert(str):
    if '_' in str:
        print("true")
        token = str.split('_')
        listC = []
        snakec= "";
        for bit in token:
            listC.append(bit.capitalize())
        snakec.join(listC)
        return snakec
    else:

        print("false")


print(typenameconvert("snake_case"))