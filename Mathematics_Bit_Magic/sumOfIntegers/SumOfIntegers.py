def func1(n):
    return (n*(n+1))/2

def func2(n):
    sum = 0
    for i in range(1,n+1):
        sum+=i
    return sum

if __name__=="__main__":
    print(func1(9000))
    print(func2(9000))

