#code

def toh(n, A, B, C):
    if(n == 1):
        print("Move 1 from ",A," to ",C)
        return
    toh(n-1, A, C, B)
    print("Move",n,"from ",A," to ",C)
    toh(n-1, B, A, C)
    
if(__name__=="__main__"):
    toh(3,'A','B','C');
