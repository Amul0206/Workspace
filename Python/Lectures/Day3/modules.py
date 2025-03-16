# Modules are like packages in Java

import  functions       # calling the whole file                                    ## Basic Import
import  functions as f #using 'as' to make a easy to use while writing the code     ## Import with rename
from functions import  factorials # this will only import the required function     ## Specific Import


print(functions.isEvenOdd(4))
print(f.add(30, 30))

print(factorials(5))