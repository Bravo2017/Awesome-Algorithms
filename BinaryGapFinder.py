
def convert_to_binary(s, n):
    if n<=1:
        return
    s = s + str(n%2)
    print(s)
    return convert_to_binary(s, n/2)

s = ''
print(convert_to_binary(s, 15))