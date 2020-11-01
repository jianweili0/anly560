

class Test:
    grade1 = 91.14
    grade2 = 85.01
    grade3 = 72
    grade4 = 63
    grade5 = 81.14

    sum = 0
    list = [grade1,grade2,grade3,grade4,grade5]

    i=0
    while i<len(list):
        sum+=list[i]
        i+=1
    print(list)
    average = sum/len(list)

    print('\n')
    print("The average of those grades : {}".format(average))
    print('\n')



solution = Test()
