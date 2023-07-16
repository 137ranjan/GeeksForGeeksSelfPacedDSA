class Solution
{
    //Function to find repeated character whose first appearance is leftmost.
    static int repeatedCharacter(String S)
    {
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<S.length(); i++){
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
        }
        
        for(int i=0; i<S.length(); i++){
            if(map.get(S.charAt(i)) > 1){
                return i;
            }
        }
        
        return -1;
    }
}
