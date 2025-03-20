import re

#findall, search, sub, split

s="hello cutie how are you5 again aaaaaaaaaaaaaaaaaaaaa %utfd"

print(re.findall(r"\b[a-zA-Z0-9]+\b",s))

print(re.sub("\s",'#',s)) 