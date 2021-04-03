import math



def Series_3(n):
    #1^1+2^2+3^3+.......+n^n
    sum = 0
    for i in range(1,n+1):
        sum += math.pow(i,i)
    print(int(sum))


Series_3(3)