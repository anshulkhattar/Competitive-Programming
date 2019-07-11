#  Geeks For Geeks
#  Reverse Each word of the string
#  Practice
#  Company tags - Flipkart , Amazon , etc

str=input()
x=str.split(".")
list=[]

for w in x:
	list.append(w[::-1])

print(".".join(list))
