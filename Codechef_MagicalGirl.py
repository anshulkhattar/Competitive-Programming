t=int(input())

for _ in range(t):
    str=raw_input()
    r,g,b,m=str.split()
    r=int(r)
    g=int(g)
    b=int(b)
    m=int(m)

    rarr=list(map(int,raw_input().split()))
    garr=list(map(int,raw_input().split()))
    barr=list(map(int,raw_input().split()))

    rmax=max(rarr)
    gmax=max(garr)
    bmax=max(barr)

    arr=[]

    arr.append(rmax)
    arr.append(gmax)
    arr.append(bmax)

    for _ in range(m):
        arr.sort()
        arr[2]/=2

    arr.sort()
    print(arr[2])
