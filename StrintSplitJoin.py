def split_and_join(line):
    # write your code here
    text = line.split(" ")    
    return '-'.join(text)

if __name__ == '__main__':
    line = raw_input()
    result = split_and_join(line)
    print result