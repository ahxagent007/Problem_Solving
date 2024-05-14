
n1 = 0
n_n = 1
n_sum = 0
n_terms = int(input())

for n in range(0, n_terms):
    if n == 0:
        print(n1, end=' ')
    elif n ==1:
        print(n_n, end=' ')
    else:
        n_sum = n1 + n_n
        n1 = n_n
        n_n = n_sum
        print(n_sum, end=' ')
