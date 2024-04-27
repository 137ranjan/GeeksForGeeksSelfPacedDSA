class Solution
{
    //Function to find out the number of ways we can place a black and a 
    //white Knight on this chessboard such that they cannot attack each other.
    static long numOfWays(int N, int M)
    {
        long result = 0;
        long mod = 1000000007;
        int[] dx = {-2, -1, 1, 2,  2,  1, -1, -2};
        int[] dy = { 1,  2, 2, 1, -1, -2, -2, -1};
        
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                int count = N*M - 1;
                for(int k=0; k<8; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx >= 0 && nx < N && ny >=0 && ny < M){
                        count--;
                    }
                }
                result = (result + count)%mod;
            }
        }
        
        return result;
    }
}
