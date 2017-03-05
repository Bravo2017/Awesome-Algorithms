#!/bin/python

import sys


n = int(raw_input().strip())
output = 1

while n>0:
    output = output*n
    n = n-1
print output