import sys
import math

def findHighestAffinity(input) :
    inputArray = input.split()
    dict = affinity(inputArray)
    temp = 0
    for key in dict.keys():
        keys = list(dict)
        num = len(keys)
        if key == keys[num-1]:
            break
        for key_two in keys[1:num]:
            hfc = math.gcd(dict[key], dict[key_two])
            if hfc > temp:
                temp = hfc
#         if keys[0] == key:
#             temp = dict[key]
#         else:
#             temp = math.gcd(temp, dict[key])
#     for sym,aff in dict.items():
#         if dict.keys().index(sym) == 0:
#             temp = aff
#         else :
#             temp = math.gcd(temp, aff)

    return temp

def affinity (inputArray):
    dictionary = initDictionary()
    dic = {}
    for sym in inputArray:
        if len(sym) == 2:
            first = sym[0]
            second = sym[1]
            idx = dictionary.index(second)
            if idx == 0:
                base = 2
            else :
                base = idx + 1
            affinity = base * dictionary.index(first) + idx
            dic[sym] = affinity
        elif len(sym) == 1:
            dic[sym] = dictionary.index(sym)

        return dic

def initDictionary () :
    dictionary = []
    ## 0-9
    for i in (0,10):
        dictionary.append(i)
    ## A-X
        for i in range(0, 26):
           alpha = chr(ord('a') + i)
           dictionary.append(alpha.upper())
    ## a-z
    for i in range(0, 26):
       alpha = chr(ord('a') + i)
       dictionary.append(alpha)
    return dictionary

if __name__ == "__main__":
    input = sys.stdin.readline()
    print(findHighestAffinity(input))
