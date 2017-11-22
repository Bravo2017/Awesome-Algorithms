#Python 3
# @author: jubinsoni

def binary(n, b):
    '''Retruns binary b of a positive integer n'''
    if n <= 0:
        return b
    b = str(n % 2) + b
    return binary(n // 2, b)


def solution(N):
    '''Calculates the number of 0s between two 1s. For example: returns 2 for number 9 as binary of 9 is 1001.
    Returns 4 for 541 as max binary gap is 4 in 541 (1000011101). Returns 0 as binary gap for 15 (1111)'''
    if N <= 0:
        return 0
    b = binary(N, b='')
    binary_gap = 0
    count = 0
    s = b[b.index('1') + 1:]
    for i in s:
        if i == '1':
            if binary_gap < count:
                binary_gap = count
            s = s[s.index('1') + 1:]

            count = 0
        else:
            count += 1

    return binary_gap


def main():
    # Test case#1
    N = 9
    print(solution(N))

    # Test case#2
    N = 15
    print(solution(N))

    # Test case#3
    N = 541
    print(solution(N))

    # Test case#4
    N = 0
    print(solution(N))

    # Test case#5
    N = 1
    print(solution(N))

    # Test case#6
    N = 1111111111131111114447777777777785566410024563368412
    print(solution(N))

    # Test case#7
    N = 241586698
    print(solution(N))


if __name__ == '__main__':
    main()
