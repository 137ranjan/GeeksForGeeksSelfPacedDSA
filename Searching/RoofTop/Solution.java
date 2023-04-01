class Solution
{
    //Function to find maximum number of consecutive steps 
    //to gain an increase in altitude with each step.
    static int maxStep(int A[], int N)
    {
        // Your code here
        int maxStep = 0;
        int diff = 0;
        int localStep = 0;
        
        for(int i=0; i<N-1; i++){
            diff = A[i+1] - A[i];
            if(diff > 0){
                localStep++;
                if(localStep > maxStep){
                    maxStep = localStep;
                }
            }
            else{
                localStep = 0;
            }
        }
        
        return maxStep;
     
    }
    
}
