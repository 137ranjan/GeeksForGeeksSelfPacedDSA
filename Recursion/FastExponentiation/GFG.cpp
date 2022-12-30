class Solution{
    public:
    //You need to complete this fucntion
    long long y = 0;
    //long long mod = 1000000007;
    long long modfun(long long n, long long R){
        if(n == 0){
            return 0;
        }
        if(R == 0){
            return 1;
        }
        if(R%2 == 0){
            y = modfun(n, R/2);
            y = (y * y) % mod; 
        }
        else{
            y = n%mod;
            y = (y * modfun(n, R-1)% mod) % mod ;
        }
        
        return ((y + mod)% mod);
    }
    
    long long power(int N,int R)
    {
       //Your code here
       
        return modfun(N, R)%mod;
        
    }

};
