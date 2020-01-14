t=int(input())

for _ in range(t):
    str=raw_input()
    n,sx,sy,ex,ey,bx,by=map(int,str.split())

    if sx==bx==ex or sy==ey==by:
        print abs(sx-ex) + abs(sy-ey)+2

    else:
        print abs(sx-ex) + abs(sy-ey)


    
