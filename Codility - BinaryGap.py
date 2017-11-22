def binary(n, b):
    if n<=0:
        return b
    b = str(n%2) + b
    return binary(n//2, b)


def solution(N):
	b = binary(N, b='')
	binary_gap = -1
	count = 0

	s = b[b.index('1')+1:]
	for i in s:
		if i == '1':
			if binary_gap < count:
				binary_gap = count
			s = s[s.index('1')+1:]
			
			count = 0
		else:
			count +=1

	return binary_gap
	
def main():
	N = 15
	print(solution(N))
	
	N = 15
	print(solution(N))
	
