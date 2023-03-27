// Majority Element
class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int candidate = findCandidate(a,size);
        int count = 0;
        for(int i=0; i<size; i++){
            if(a[i] == candidate){
                count++;
            }
        }
        
        if(count > size/2){
            return candidate;
        }
        
        return -1;
       
    }
    
    static int findCandidate(int a[], int size)
    {
        int maj_index = 0, count = 1;
        
        for(int i=1; i<size; i++){
            if(a[maj_index]  == a[i]){
                count++;
            }else{
                count--;
            }
            
            if(count == 0){
                maj_index = i;
                count = 1;
            }
        }
        
        return a[maj_index];
    }
}
