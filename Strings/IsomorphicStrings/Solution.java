class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        if(str1.length() != str2.length()){
            return false;
        }
        
        int size = 256;
        int[] map = new int[size];
        Boolean[] marked = new Boolean[size];
        Arrays.fill(marked, Boolean.FALSE);
        Arrays.fill(map, -1);
        
        for(int i=0; i<str1.length(); i++){
            if(map[str1.charAt(i)] == -1){
                if(marked[str2.charAt(i)] == true){
                    return false;
                }
                marked[str2.charAt(i)] = true;
                map[str1.charAt(i)] = str2.charAt(i);
            }
            else if(map[str1.charAt(i)] != str2.charAt(i)){
                return false;
            }
        }
        
        return true;
    }
}
