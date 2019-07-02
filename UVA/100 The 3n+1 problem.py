#Runtime Error

while True:
    i = int(input())
    j = int(input())

    max = 1

    for n in range(i,j):
        m = n
        this_max = 1
        while m != 1:
            if m%2 == 0:
                m /= 2
            else:
                m = 3*m + 1
            this_max += 1

        if this_max > max:
            max = this_max

    print(str(i)+" "+str(j)+" "+str(max))

