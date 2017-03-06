#!/bin/python

import sys

s = raw_input().strip()
t = raw_input().strip()
k = int(raw_input().strip())

n = len(s)
count = 0;
commonlen=''

while n>0:
    if (s[:n] == t[:n]):
        s1 = s[:n]
        commonlen = len(s1)
        break
    n = n-1

count = count + len(t[-(len(t)-len(s1)):])

if (len(s)+len(t)-commonlen)<0 or (len(s)+len(t)-2*commonlen)%2==k%2:
    print 'Yes'
else:
    print 'No'