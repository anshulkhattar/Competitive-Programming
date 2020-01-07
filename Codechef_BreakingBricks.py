t=int(input())

for _ in range(t):
    count=0
    str=raw_input()
    s,w1,w2,w3=str.split()
    s=int(s)
    w1=int(w1)
    w2=int(w2)
    w3=int(w3)

    sum= w1+w2+w3

    while sum > 0:
        sum=sum-s
        count=count+1

    print(count)