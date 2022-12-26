def linearSearch(arr,x):
    for i in range(arr.length):
        if(arr[i] == x):
            print(i)
            return
        i+=1
    print("Not found")
    return

if __name__=="__main__":
    n = int(input())
    arr = []
    for i in range(n):
        arr[i] = int(input)
        i+=1
    x = int(input())
    linearSearch(arr,x)