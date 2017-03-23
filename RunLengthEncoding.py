def RunLengthEncoding(string):
    output = ''
    for c in string:
        if (c not in output):
            output = output + str(string.count(c)) + c
    return output

if __name__ == '__main__':
    string = raw_input().strip()

    print RunLengthEncoding(string)