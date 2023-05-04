class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();
        int minIndex = Integer.MAX_VALUE;
        boolean flag = false;
        for(int i=n-1; i>=0; i--){
            if(set.contains(arr[i])){
                if(i < minIndex){
                    minIndex = i;
                    flag = true;
                    // System.out.println("i= "+i+" min= "+minIndex);
                }
            }
            set.add(arr[i]);
        }
        if(flag){
            return minIndex + 1;
        }else{
            return -1;
        }
        
    }
}
