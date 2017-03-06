#!/bin/python3

import sys


s = input().strip()
t = input().strip()
k = int(input().strip())

n = len(s)
commonlen=''

while n>0:
    if (s[:n] == t[:n]):
        commonlen = s[:n]
        break
    n = n-1

if k >= len(s)+len(t) or k>= len(s)+len(t)-(2*len(commonlen)) and (k-len(s)-len(t))%2==0:
    print ('Yes')
else:
    print ('No')