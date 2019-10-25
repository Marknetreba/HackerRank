
def gameWinner(colors):
    wstr = ''
    bstr = ''

    for i in range(len(colors)):
        if colors[i] == 'w':
            wstr += 'w'
            bstr += ' '
        if colors[i] == 'b':
            wstr += ' '
            bstr += 'b'

    wstr = [x for x in wstr.split(' ') if x]
    bstr = [x for x in bstr.split(' ') if x]

    wcount = 0
    for w in wstr:
        wcount += len(w)-2

    bcount = 0
    for b in bstr:
        bcount += len(b)-2

    result = ''
    if wcount>bcount:
        result = "Wendy"
    else:
        result = "Bob"

    return result


if __name__ == '__main__':

    test = 'wwwwbbwww'
    #colors = input()
    result = gameWinner(test)
