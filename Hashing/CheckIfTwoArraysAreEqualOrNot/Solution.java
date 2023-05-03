class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        Map<Long,Long> mapA = new HashMap<Long,Long>();
        Map<Long,Long> mapB = new HashMap<Long,Long>();
        
        for(int i=0; i<N; i++){
            mapA.put(A[i],mapA.getOrDefault(A[i],0L)+1L);
            mapB.put(B[i],mapB.getOrDefault(B[i],0L)+1L);
        }
        
        for(Long i: mapA.keySet()){
            if(mapA.get(i) != mapB.get(i)){
                return false;
            }
        }
        
        return true;
    }
}
