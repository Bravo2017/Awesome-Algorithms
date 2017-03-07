def count_substring(string, sub_string):
    flag = True
    count = 0
    start = 0
    while flag:
        a = string.find(sub_string,start)
        
        if a == -1:
            flag = False
        else:
            count += 1
            start = a+1
            
    return count
	
if __name__ == '__main__':
    string = raw_input().strip()
    sub_string = raw_input().strip()
    
    count = count_substring(string, sub_string)
    print count