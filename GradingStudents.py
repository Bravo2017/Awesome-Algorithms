#!/bin/python

import sys


n = int(raw_input().strip())
for a0 in xrange(n):
    grade = int(raw_input().strip())
    # your code goes here
    if grade < 38:
        print grade
    else:
        if (grade+2)%5==0:
            print grade+2
        elif (grade+1)%5==0:
            print grade+1
        else:
            print grade
        
