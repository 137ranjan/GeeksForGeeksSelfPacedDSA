class UpdatedSolution
{
    static int d= 256;
    //Function to check if the pattern is present in string or not.
    static boolean search(String pat, String txt, int q)
    {
        int m = pat.length();
        int n = txt.length();
        
        int h = 1;
        
        for(int i=0; i<m-1; i++){
            h = (h*d)%q;
        }
        int p = 0;
        int t = 0;
        
        for(int i=0; i<m; i++){
            p = (p*d + pat.charAt(i))%q;
            t = (t*d + txt.charAt(i))%q;
        }
        
        for(int i=0; i <= n - m; i++){
            if(p == t){
                boolean flag = true;
                for(int j=0; j<m; j++){
                    if(txt.charAt(i+j) != pat.charAt(j)){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    return true;
                }
            }
            if( i < n-m){
                t = (d*(t - txt.charAt(i)*h) + txt.charAt(i+m))%q;
                if(t < 0){
                    t = t+q;
                }
            }
        }
        return false;
        
    }
}
