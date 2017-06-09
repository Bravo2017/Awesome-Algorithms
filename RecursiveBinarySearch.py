def binary_search(input_array, value):	
	if value > input_array[-1] or value < input_array[0]:
        return -1
    else:
        mid = len(input_array)//2
        
        if input_array[mid]==value:
            count +=1
            return count
    
        elif value < input_array[mid]:
            return binary_search(input_array[:mid],value)
    
        elif value > input_array[mid]:
            return binary_search(input_array[mid:],value)
			
			

test_list = [1,3,9,11,15,19,29]
test_val1 = 25
test_val2 = 15
#test_val3 = 29
print binary_search(test_list, test_val1)
print binary_search(test_list, test_val2)
#print binary_search(test_list, test_val3)