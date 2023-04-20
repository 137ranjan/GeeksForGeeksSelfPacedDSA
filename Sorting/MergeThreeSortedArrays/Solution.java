class Solution
{
    // A[], B[], C[]: input arrays
    //Function to merge three sorted lists into a single list.
    static ArrayList<Integer> merge3sorted(int A[], int B[], int C[])
    {
        // add ypur code here
        ArrayList<Integer> output = new ArrayList<Integer>();
        int i=0, j=0, k=0, l=0;
        int n = A.length;
        int m = B.length;
        int p = C.length;
        while(i<n && j<m && k<p){
            if(A[i] <= B[j] && A[i] <= C[k]){
                output.add(A[i]);
                i++;
            }
            else if(B[j] <= A[i] && B[j] <= C[k]){
                output.add(B[j]);
                j++;
            }else if(C[k] <= A[i] && C[k] <= B[j]){
                output.add(C[k]);
                k++;
            }
        }
        
        if(i >= n ){
            while(j< m && k<p){
                if( B[j] <= C[k]){
                   output.add(B[j]);
                   j++;
                }else if(C[k] <= B[j]){
                   output.add(C[k]);
                   k++;
                }
            }
        }else if(j >= m){
            while(i< n && k<p){
                if(A[i] <= C[k]){
                   output.add(A[i]);
                   i++;
                }else if(C[k] <= A[i]){
                   output.add(C[k]);
                   k++;
                }
            }
        } else if(k >=p){
            while(i< n && j<m){
                if(A[i] <= B[j]){
                   output.add(A[i]);
                   i++;
                }else if(B[j] <= A[i]){
                   output.add(B[j]);
                   j++;
                }
            }
        }
        
        while(i < n){ 
            output.add(A[i]);
            i++;
        }
        while(j < m){
            output.add(B[j]);
            j++;
        }
        while(k < p){
            output.add(C[k]);
            k++;
        }
        
        return output;
        
    }
}
