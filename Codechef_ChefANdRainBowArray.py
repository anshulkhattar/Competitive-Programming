import math

def main():
    N=int(input())
    r=7
    n=(N-13)/2
    if N>=13:
        a=math.factorial(n+r-1)/(math.factorial(n)*math.factorial(r-1))
        print a%1000000007
        
    else:
        print("0")
if __name__ == "__main__":
    main()

