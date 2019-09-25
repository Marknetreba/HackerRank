import textwrap


def merge_the_tools(string, k):
    t = textwrap.wrap(string,k)

    for i in t:
        a = sorted(set(i), key=i.index)

        print(''.join(a))


if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)