def binary_search(input_array, value):
    output = -1
    i = -1
    temp = input_array
    while i < len(input_array):
        mid = len(input_array)//2
        if value == input_array[mid]:
            output = temp.index(input_array[mid])
        elif value > input_array[mid]:
            input_array = input_array[mid:]
        else:
            input_array = input_array[:mid]
        i+=1
    return output
    


test_list = [1,3,9,11,15,19,29]
test_val1 = 25
test_val2 = 15
#test_val3 = 29
print binary_search(test_list, test_val1)
print binary_search(test_list, test_val2)
#print binary_search(test_list, test_val3)