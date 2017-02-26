def swap_case(s):
    text = s.swapcase()
    return ''.join(c.upper() if c.islower() else c.lower() for c in s)    
    #return text
	
if __name__ == '__main__':
    s = raw_input()
    result = swap_case(s)
    print result